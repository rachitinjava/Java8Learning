package com.learn.scheduledexecutorsvc.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import com.learn.scheduledexecutorsvc.domain.User;
import com.learn.scheduledexecutorsvc.event.UserEvent;

@Service
public class UserEventServiceImpl implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void createNewEmployee(User user){
		
		applicationEventPublisher.publishEvent(new UserEvent(this,"NEW USER",user));
	}
	

}
