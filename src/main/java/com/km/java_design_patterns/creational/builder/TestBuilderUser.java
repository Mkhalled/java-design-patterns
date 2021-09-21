package com.km.java_design_patterns.creational.builder;

public class TestBuilderUser {

	public static void main(String[] args) {
		User user = new User.UserBuilder("khalled", "Meneou").age(32).build();

		System.out.println(user.toString());

	}

}
