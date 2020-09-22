package com.org.quip.request;

import com.org.quip.request.service.GoundamaniService;
import com.org.quip.utils.UtilFunctions;

public class GoundertalkRequestHandler extends RequestHandler {

	@Override
	public void doProcess() {
		// TODO Auto-generated method stub
		int randNo=UtilFunctions.random(GoundamaniService.length);
		setResponseText(GoundamaniService.getDialogue(randNo));
	}
	
}
