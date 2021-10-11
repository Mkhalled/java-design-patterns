package com.km.java_design_patterns.creational.builder;

public class TestBuilder {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("50 GB", "2 GB").setBluethoothEnabled(true)
				.setGraphicsCardEnabled(true).build();

	}

}
