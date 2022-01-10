package com.springbootbasics.myspringbootclass;


//BeanClass
public class UserInfo {
	
	private String fname;
	private String lname;
	private int uid;
	public String getFname() {
		return fname;
	}
	
	public UserInfo(String fname, String lname, int uid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uid = uid;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	@Override
	public String toString() {
		return "UserInfo: firstname=" + fname + ", lastname=" + lname + ", user-id=" + uid;
	}
	
	

}
