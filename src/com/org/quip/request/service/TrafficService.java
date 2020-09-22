/**
 * 
 */
package com.org.quip.request.service;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import com.org.quip.request.Constants;
import com.org.quip.request.beans.Bean;
import com.org.quip.request.beans.Traffic;

/**
 * @author Anand
 * This class gets the latest traffic update
 * of Chennai City Traffic police from twitter
 * Uses twitter4j api
 * OAuth credentials of quipquote twitter application 
 * TBD : Cache tweets, updates less frequent than expected
 *       Twitter response slow
 *
 */
public class TrafficService {
	
	private static Twitter twitter;
	
	public static Bean getTrafficUpdate() {
		Bean traffic = new Traffic();
		authenticateUser();
		getTrafficTweets(traffic);
		getLatestTrafficUpdate(traffic);
		return traffic;
	}
	
	

	private static void getLatestTrafficUpdate(Bean traffic) {
		Traffic trafficBean = (Traffic) traffic;
		String trafficUpdate = "";
		List<Status> updatesList = trafficBean.getTrafficUpdatesList();
		for(Status updates : updatesList) {
			trafficUpdate = updates.getText();
			
			if (trafficUpdate.contains(Constants.trafficContent)) {
				
				trafficBean.setLatestUpdate(trafficUpdate);
				trafficBean.setAsOfDate(updates.getCreatedAt());
				//You got what you want, now get outta here !
				break;
			}
		}
	}



	private static void getTrafficTweets(Bean traffic) {
		
		Traffic trafficBean = (Traffic) traffic;
		
		try {
            List<Status> statuses;
            statuses = twitter.getUserTimeline(Constants.trafficUpdatesUser); 
            trafficBean.setTrafficUpdatesList(statuses);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            //System.exit(-1);
        }
	}



	private static void authenticateUser() {
		twitter = new TwitterFactory().getInstance();
		
	}

}
