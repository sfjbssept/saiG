package com.rabbitmq.entity;

public class Employee {

	private String empId;
	private String name;
	private Integer salary;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String empId, String name, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
