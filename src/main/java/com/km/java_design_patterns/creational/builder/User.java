package com.km.java_design_patterns.creational.builder;

public class User {
	// required
	private String firstName;
	private String lastName;

	// optional
	private int age;
	private String phone;
	private String address;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private int age;

		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;

		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {

			return new User(this);
		}

	}

}
