package com.org.quip.request.beans;

public class Location implements Bean{

	private String city;
	private String smsLocation;
	private String mobileNumber;
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return smsLocation + "  " + city;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the smsLocation
	 */
	public String getSmsLocation() {
		return smsLocation;
	}

	/**
	 * @param smsLocation the smsLocation to set
	 */
	public void setSmsLocation(String smsLocation) {
		this.smsLocation = smsLocation;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
