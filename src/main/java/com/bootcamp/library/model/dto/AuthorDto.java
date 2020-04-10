package com.bootcamp.library.model.dto;

public class AuthorDto {

	private String name;
	private String country;
	private String language;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if (age<18) {
			//Throw exception 
		} else {
			this.age = age;
		}
	}

}
