package com.prj.web.model;

public class MonSales {
	int billno;
	long mobileno;
	String Fname;
	int billamt;
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public int getBillamt() {
		return billamt;
	}
	public void setBillamt(int billamt) {
		this.billamt = billamt;
	}
	@Override
	public String toString() {
		return "MonSales [billno=" + billno + ", mobileno=" + mobileno + ", Fname=" + Fname + ", billamt=" + billamt
				+ "]";
	}
	public MonSales(int billno, long mobileno, String fname, int billamt) {
		super();
		this.billno = billno;
		this.mobileno = mobileno;
		Fname = fname;
		this.billamt = billamt;
	}
}
