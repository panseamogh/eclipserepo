package com.lti.junit.demo;

public class Product {
	private int prdId;
	private String prdName;
	private double prdCost;
	private String companyName="LTI INFO";
	public Product(int prdId, String prdName, double prdCost) {
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
}
		public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
    public String getPrdName() {
		return prdName;
	}
   public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public double getPrdCost() {
		return prdCost;
	}
   public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}






	public String getCompanyName() {
		return companyName;
	}






	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void helloworld()
	{
		System.out.println("Hello World welcome to Git!");
		System.out.println("My name is Amogh P.");
		System.out.println("I work at L&T Infotech");
	}




	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + ", companyName="
				+ companyName + "]";
	}
	
	
	
	
}
