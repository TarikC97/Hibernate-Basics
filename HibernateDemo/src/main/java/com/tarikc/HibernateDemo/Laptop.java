package com.tarikc.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lapname;
//	@ManyToMany
//	private List<Student> student = new ArrayList<Student>();
	private int price;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
