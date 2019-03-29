package com.prj.web.model;

public class MenuItem {
	private int ID;
	private String Itemname;
	private int Price;
	private String Category;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "MenuItem [ID=" + ID + ", Itemname=" + Itemname + ", Price=" + Price + ", category=" + Category + "]";
	}
	public MenuItem(int iD, String itemname, int price, String category) {
		super();
		ID = iD;
		Itemname = itemname;
		Price = price;
		Category = category;
	}
}
