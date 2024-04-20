package com.tarikc.DemoHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Pojo(Bean)
@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String surname;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
