package com.security.entity;

import java.util.Objects;

public class Employee {

	
	private String name;
	private String role;
	
	public Employee() {
	}
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.role);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (! (obj instanceof Employee)) {
			return false;
		} 
		Employee other = (Employee) obj;
		return Objects.equals(this.name, other.name) && Objects.equals(this.role, other.role);
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
