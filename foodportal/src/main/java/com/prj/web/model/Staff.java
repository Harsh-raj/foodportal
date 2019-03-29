package com.prj.web.model;

public class Staff {
	int staffid;
	String staffname;
	String staffmail;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", staffname=" + staffname + ", staffmail=" + staffmail + "]";
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffmail() {
		return staffmail;
	}
	public void setStaffmail(String staffmail) {
		this.staffmail = staffmail;
	}
	public Staff(int staffid, String staffname, String staffmail) {
		super();
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffmail = staffmail;
	}
}
