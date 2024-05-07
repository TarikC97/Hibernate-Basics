package com.tarikc.HibernateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	public int lid;
	public String lapname;
	
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
	
}
