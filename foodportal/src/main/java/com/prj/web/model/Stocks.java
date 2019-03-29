package com.prj.web.model;

public class Stocks {
	int ID;
	String itemname;
	int quntity;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	@Override
	public String toString() {
		return "Stocks [ID=" + ID + ", itemname=" + itemname + ", quntity=" + quntity + "]";
	}
	public Stocks(int iD, String itemname, int quntity) {
		super();
		ID = iD;
		this.itemname = itemname;
		this.quntity = quntity;
	}
}
