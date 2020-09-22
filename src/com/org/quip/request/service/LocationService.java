package com.org.quip.request.service;

import com.org.quip.request.beans.Location;
import com.org.quip.request.beans.Traffic;
import com.org.quip.request.beans.Weather;
import com.org.quip.utils.HttpUtils;
import com.org.quip.utils.UtilFunctions;

public class LocationService {
	public static Location getLocation(String mobileNumber){ 
		Location location=new Location();
		String locationXML = HttpUtils.getLocationXML(mobileNumber);
		location.setMobileNumber(mobileNumber);
		location.setSmsLocation(UtilFunctions.getSMSLocation(locationXML));
		location.setCity(UtilFunctions.getCity(locationXML));
		return location;
	}
	public static Traffic getTraffic(Location location){
		Traffic traffic=new Traffic();
		return traffic;
	}
	public static Weather getWhether(Location location){
		Weather whether=new Weather();
		return whether;
	}
}
