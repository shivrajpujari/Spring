package com.bridgeIt.springPrax.autowire;

public class Employee {

	private int id;
	private String name;
	private String role;
	private Address address;
	
	public void showDetails(Employee employee) {
		
		System.out.println(employee);
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", address=" + address + "]";
	}


	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
