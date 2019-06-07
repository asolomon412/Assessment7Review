package com.apitest.APISandbox.jokes;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JokesController {
	
	// this is my home page - you will need to go to localhost:8080/joke-selection to see the form to 
	// select a random joke
	@RequestMapping("/joke-selection")
	public ModelAndView jokeIndex() {

		return new ModelAndView("joke-selection");
	}

	@RequestMapping("/jokes")
	public ModelAndView index(@RequestParam("amount") int num) {
		// this is another the example to use for your final assessment
		// you will always need the rest template
		RestTemplate rt = new RestTemplate();

		// this is returning the JSON from the api with the number the user selected
		// from the jsp named joke-selection.jsp
		// for the assessment you will need to modify the url and the POJOs
		JokesJSON response = rt.getForObject("http://api.icndb.com/jokes/random/" + num, JokesJSON.class);
		// I assigned the response to the arraylist here for code readability and to pass it into the random-jokes.jsp
		ArrayList<Joke> jokes = response.getValue();
		// this was my test for the arraylist
		System.out.println(response.getValue());

		return new ModelAndView("random-jokes", "list", jokes);
	}
}
