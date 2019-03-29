package com.prj.web.model;

public class Login {
	private boolean lid;
	private String lname;
	private String lpass;
	@Override
	public String toString() {
		return "Login [lid=" + lid + ", lname=" + lname + ", lpass=" + lpass + "]";
	}
	public boolean getLid() {
		return lid;
	}
	public void setLid(boolean lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Login(boolean lid, String lname, String lpass) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lpass = lpass;
	}
	public String getLpass() {
		return lpass;
	}
	public void setLpass(String lpass) {
		this.lpass = lpass;
	}
	
	
}
