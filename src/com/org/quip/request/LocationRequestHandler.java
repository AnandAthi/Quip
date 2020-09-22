package com.org.quip.request;

import javax.servlet.http.HttpServletRequest;

import com.org.quip.request.beans.Bean;
import com.org.quip.request.beans.Location;
import com.org.quip.request.service.LocationService;

public class LocationRequestHandler extends RequestHandler {

	Location userLocation;
	Bean bean;
	
	@Override
	protected void init(HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.init(request);
		userLocation=LocationService.getLocation(mobileNumber);
		bean=new Bean() {
			
			@Override
			public String getString() {
				// TODO Auto-generated method stub
				return Constants.locationDefaultText;
			}
		};
	}
	
	@Override
	public String getResponseText() {
		// TODO Auto-generated method stub
		return userLocation.getString();
	}
}
