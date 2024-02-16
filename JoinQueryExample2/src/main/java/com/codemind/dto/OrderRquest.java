package com.codemind.dto;


public class OrderRquest {

	private  String subName;
	private String stName;
	public OrderRquest(String subName, String stName) {
		super();
		this.subName = subName;
		this.stName = stName;
	}
	public OrderRquest() {
		//super();
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	@Override
	public String toString() {
		return "OrderRquest [subName=" + subName + ", stName=" + stName + "]";
	}
	
	
}
