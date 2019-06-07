package com.apitest.APISandbox;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apitest.APISandbox.entity.Brewery;

@Controller
public class HomeController {
	// Create the RestTemplate
	RestTemplate rt = new RestTemplate();

	@RequestMapping("/")
	public ModelAndView breweryList() {
		
		// Set up the headers -- headers will not be necessary for your final assessment
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing!"); // typically the documentation will tell what to add here

		ResponseEntity<Brewery[]> pr = rt.exchange("https://api.openbrewerydb.org/breweries", HttpMethod.GET,
				new HttpEntity<>(headers), Brewery[].class);

		System.out.println(Arrays.toString(pr.getBody()));

		return new ModelAndView("index", "list", pr.getBody());
	}

	@RequestMapping("/details")
	public ModelAndView breweryDetails(@RequestParam("id") String id) {
		
		// Set up the headers
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing!"); // typically the documentation will tell what to add here

		ResponseEntity<Brewery> brewery = rt.exchange("https://api.openbrewerydb.org/breweries/" + id, HttpMethod.GET,
				new HttpEntity<>(headers), Brewery.class);

		System.out.println(brewery.getBody());

		return new ModelAndView("brewery-details", "brew", brewery.getBody());
	}
}
