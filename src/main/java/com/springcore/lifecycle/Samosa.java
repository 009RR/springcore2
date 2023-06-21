package com.springcore.lifecycle;

public class Samosa {
	
	private Double price;
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("setting price");
		this.price = price;
	}
	
	public void hey() {
		System.out.println("Inside init method: hey how are you?");
	}
	public void by() {
		System.out.println("inside by method: by by I am going to die");
	}
	
	

}
