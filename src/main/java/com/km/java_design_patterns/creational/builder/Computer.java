package com.km.java_design_patterns.creational.builder;

public class Computer {

	// requirred params
	private String HDD;
	private String RAM;

	// optional params
	private boolean isGraphicsCardEnabled;
	private boolean isBluethoothEnabled;

	Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluethoothEnabled = builder.isBluethoothEnabled;
	}

	public static class ComputerBuilder {

		// requirred params
		private String HDD;
		private String RAM;

		// optional params
		boolean isGraphicsCardEnabled;
		boolean isBluethoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluethoothEnabled(boolean isBluethoothEnabled) {
			this.isBluethoothEnabled = isBluethoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

		@Override
		public String toString() {
			return "ComputerBuilder [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
					+ ", isBluethoothEnabled=" + isBluethoothEnabled + "]";
		}

	}

}
