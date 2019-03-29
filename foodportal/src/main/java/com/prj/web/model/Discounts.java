package com.prj.web.model;

public class Discounts {
	int creditpt;
	int discount;
	public Discounts(int creditpt, int discount) {
		super();
		this.creditpt = creditpt;
		this.discount = discount;
	}
	public int getCreditpt() {
		return creditpt;
	}
	public void setCreditpt(int creditpt) {
		this.creditpt = creditpt;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Discounts [creditpt=" + creditpt + ", discount=" + discount + "]";
	}	
}
