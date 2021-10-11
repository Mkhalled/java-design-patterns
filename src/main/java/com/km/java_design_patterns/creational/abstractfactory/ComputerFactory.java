package com.km.java_design_patterns.creational.abstractfactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();

	}

}
