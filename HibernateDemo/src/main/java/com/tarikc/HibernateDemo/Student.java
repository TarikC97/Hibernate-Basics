package com.tarikc.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


//Bean(Pojo)
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int marks;
//	@ManyToMany(mappedBy="student")
//	private List<Laptop> laptop = new ArrayList<>();
	
	

public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
