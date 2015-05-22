package com.example.myquran;

public class UserModel {
	String name="";
	String text="";

	public UserModel(String name, String text){
		this.name=name;
		this.text=text;
	}

	public String getEmail() {
		return text;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String text) {
		this.text = text;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}