package com.km.java_design_patterns.creational.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {

		if ("PC".equals(type))
			return new PC(ram, hdd, cpu);
		if ("Server".equals(type))
			return new Server(ram, hdd, cpu);

		return null;

	}

}
