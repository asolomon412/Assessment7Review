package com.apitest.APISandbox.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Brewery {

	private String id;
	private String name;
	// @JsonProperty("brewery_type") -- use this if the names don't match in the
	// json
	private String brewery_type;
	private String street;
	private String city;
	private String state;
	private String postal_code;
	private String phone;

	private Brewery() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrewery_type() {
		return brewery_type;
	}

	public void setBrewery_type(String brewery_type) {
		this.brewery_type = brewery_type;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Brewery [id=" + id + ", name=" + name + ", brewery_type=" + brewery_type + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", postal_code=" + postal_code + ", phone=" + phone + "]";
	}

}
