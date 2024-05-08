package com.tarikc.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


//Bean(Pojo)
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String surname;
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop = new ArrayList<>();
	
	

	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getId() {
		return id;
	}
//	public void setName(Name name) {
//		this.name = name;
//	}
//	public Name getName() {
//		return name;
//	}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	

}
