package com.org.quip.request;

import javax.servlet.http.HttpServletRequest;

import com.org.quip.request.beans.Bean;
import com.org.quip.request.service.WeatherService;

public class WeatherRequestHandler extends RequestHandler {
	
	
	protected void init(HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.init(request);
	}
	
	@Override
	public void doProcess() {
		// TODO Auto-generated method stub
		//bean=LocationService.getWhether(userLocation);
		String city = getRequestedCity(userMessage);
		Bean bean =  WeatherService.getWeatherUpdate(city);
		setResponseText(bean.getString());
	}
	
	@Override
	public String getResponseText() {
		return this.responseText;
	}

	private String getRequestedCity(String userMessage) {
		
		String city = null;
		//Sanity 
		if(null != userMessage) {
			try{
			String message[]=userMessage.split(Constants.messageTokenizer);
			city =  message[1];
			}catch(Exception e){
				e.printStackTrace();
				city = Constants.chennai;
			}
		}
		
		return city;
	}
}
