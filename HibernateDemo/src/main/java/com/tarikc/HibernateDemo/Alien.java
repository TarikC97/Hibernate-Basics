package com.tarikc.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}
	@Id
	private int aid;
	private String name;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
