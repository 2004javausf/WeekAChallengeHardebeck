package com.mark.challenge;

public class BeanTwo {
	private int quantity;
	private String beans;
	private String rice;
	private String meat;
	private String guac;
	private String salsa;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBeans() {
		return beans;
	}
	public void setBeans(String beans) {
		this.beans = beans;
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getGuac() {
		return guac;
	}
	public void setGuac(String guac) {
		this.guac = guac;
	}
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	@Override
	public String toString() {
		return "Burrito order [quantity=" + quantity + ", beans=" + beans + ", rice=" + rice + ", meat=" + meat + ", guac="
				+ guac + ", salsa=" + salsa + "]";
	}
	
	
}
