package com.org.quip.request.beans;

import java.util.Date;
import java.util.List;

import twitter4j.Status;

public class Traffic implements Bean{

	
	private List<Status> trafficUpdatesList;
	private String latestUpdate;
	private Date asOfDate;
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return "Current Traffic";
	}
	/**
	 * @return the trafficUpdatesList
	 */
	public List<Status> getTrafficUpdatesList() {
		return trafficUpdatesList;
	}
	/**
	 * @param trafficUpdatesList the trafficUpdatesList to set
	 */
	public void setTrafficUpdatesList(List<Status> trafficUpdatesList) {
		this.trafficUpdatesList = trafficUpdatesList;
	}
	/**
	 * @return the latestUpdate
	 */
	public String getLatestUpdate() {
		return latestUpdate;
	}
	/**
	 * @param latestUpdate the latestUpdate to set
	 */
	public void setLatestUpdate(String latestUpdate) {
		this.latestUpdate = latestUpdate;
	}
	/**
	 * @return the asOfDate
	 */
	public Date getAsOfDate() {
		return asOfDate;
	}
	/**
	 * @param asOfDate the asOfDate to set
	 */
	public void setAsOfDate(Date asOfDate) {
		this.asOfDate = asOfDate;
	}

	
	
}
