package com.learn.scheduledexecutorsvc.event;

import org.springframework.context.ApplicationEvent;

import com.learn.scheduledexecutorsvc.domain.User;

public class UserEvent extends ApplicationEvent {
	
	private String eventType;
	private User user;

	public UserEvent(Object source, String eventType, User user) {
		super(source);
		this.eventType = eventType;
		this.user = user;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
