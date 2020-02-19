package com.cg.go.bean;

public class Address {
	private String userId;
	private String doorNo;
	private  String cityName;
	private String stateName;
	private String countryName;
	public Address(String userId, String doorNo, String cityName, String stateName, String countryName) {
		super();
		this.userId = userId;
		this.doorNo = doorNo;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	public Address() {
		super();
	}
	public String  getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
