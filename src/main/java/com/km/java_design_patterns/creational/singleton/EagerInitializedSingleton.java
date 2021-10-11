package com.km.java_design_patterns.creational.singleton;

public class EagerInitializedSingleton {

	private static EagerInitializedSingleton instatance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return instatance;
	}
}
