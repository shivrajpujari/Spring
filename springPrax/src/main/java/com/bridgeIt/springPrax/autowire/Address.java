package com.bridgeIt.springPrax.autowire;

public class Address {

	private String location;
	private String city;
	private String state;
	public String getLocation() {
		System.out.println("get location method called");
		return location;
	}
	public void setLocation(String location) {
		System.out.println("set location called");
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", state=" + state + "]";
	}
	
}
