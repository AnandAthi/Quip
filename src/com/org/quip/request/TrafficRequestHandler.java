package com.org.quip.request;

import com.org.quip.request.beans.Bean;
import com.org.quip.request.beans.Traffic;
import com.org.quip.request.service.TrafficService;

public class TrafficRequestHandler extends LocationRequestHandler {

	@Override
	public void doProcess() {
		// TODO Auto-generated method stub
		//bean=LocationService.getTraffic(userLocation);
		//Gets only the latest traffic updates from the Chennai region.
		//TBD : Location specific updates
		
		Bean bean =  TrafficService.getTrafficUpdate();
		
		//Current design needs the cast :(
		Traffic trafficBean = (Traffic) bean;
		setResponseText("<br/> "+ trafficBean.getLatestUpdate() + " as of <br/>" + trafficBean.getAsOfDate());
	}
	
	@Override
	public String getResponseText() {
		return this.responseText;
	}
}
