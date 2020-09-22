package com.org.quip.request.beans;

public class Weather implements Bean {

	private String temperature;
	private String conditions;
	private String city;
	
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return "Temperature -  " + getTemperature() + " and " + getConditions() + ". Update Provided by www.wunderground.com"; 
	}

	/**
	 * @return the conditions
	 */
	public String getConditions() {
		return conditions;
	}


	/**
	 * @param conditions the conditions to set
	 */
	public void setConditions(String conditions) {
		this.conditions = conditions;
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
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}


	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}
