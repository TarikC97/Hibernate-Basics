package com.tarikc.HibernateDemo;

import javax.persistence.Embeddable;

//Data stored in Class Student,
//no new table creation.
@Embeddable
public class Name {
	
	private String fname;
	private String mname;
	private String lname;
	
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
