/**
 * 
 */
package com.org.quip.request.service;

import com.org.quip.request.beans.Bean;
import com.org.quip.request.beans.Weather;
import com.org.quip.utils.HttpUtils;
import com.org.quip.utils.UtilFunctions;

/**
 * @author Anand
 *
 */
public class WeatherService {

	public static Bean getWeatherUpdate(String city) {
		Weather weather = new Weather();
		weather.setCity(city);
		getLatestWeather(weather);
		return weather;
	}

	private static void getLatestWeather(Weather weather) {
		String weatherXML = HttpUtils.getWeatherUpdate(weather.getCity());
		weather.setTemperature(UtilFunctions.getTemperature(weatherXML));
		weather.setConditions(UtilFunctions.getConditions(weatherXML));
	}

}
