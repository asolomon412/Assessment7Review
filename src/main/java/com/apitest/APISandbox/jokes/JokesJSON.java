package com.apitest.APISandbox.jokes;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JokesJSON {
	private String type;
	private ArrayList<Joke> value;

	public JokesJSON() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Joke> getValue() {
		return value;
	}

	public void setValue(ArrayList<Joke> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "JokesJSON [type=" + type + ", joke=" + value + "]";
	}

}
