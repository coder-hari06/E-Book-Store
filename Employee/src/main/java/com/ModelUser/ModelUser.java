package com.ModelUser;

public class ModelUser {
	private int Id;
	private String Name;
	private Long Number;
	private String Location;
	private String Job;
	private int Salary;
	private String Password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getNumber() {
		return Number;
	}
	public void setNumber(Long number) {
		Number = number;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public ModelUser(int id, String name, Long number, String location, String job, int salary, String password) {
		super();
		Id = id;
		Name = name;
		Number = number;
		Location = location;
		Job = job;
		Salary = salary;
		Password = password;
	}
}
