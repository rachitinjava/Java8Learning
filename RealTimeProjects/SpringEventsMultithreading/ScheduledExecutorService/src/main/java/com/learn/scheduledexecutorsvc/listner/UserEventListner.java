package com.learn.scheduledexecutorsvc.listner;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.learn.scheduledexecutorsvc.event.UserEvent;

@Component
public class UserEventListner implements ApplicationListener<UserEvent> {

	public UserEventListner() {

		//TODO
		
	}

	@Override
	public void onApplicationEvent(UserEvent event) {
		
		if(event instanceof UserEvent){
			UserEvent userevent = (UserEvent) event;
		System.out.println("Logging event "+userevent.getEventType() + " for user "+event.getUser().getUserName());
		}
	}

}
