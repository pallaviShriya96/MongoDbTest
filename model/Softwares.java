package com.example.SpringMongoExample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Employee") 
public class Softwares {
	@Id
	  @Field
	private String id;
	  @Field
	private String Name;
	  @Field
		private int Salary;
	public String getId() {
		return id;
	}
	public Softwares(String Name, int Salary) {
		
		
		this.Name = Name;
		this.Salary = Salary;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	 
	
	
	
	
}
