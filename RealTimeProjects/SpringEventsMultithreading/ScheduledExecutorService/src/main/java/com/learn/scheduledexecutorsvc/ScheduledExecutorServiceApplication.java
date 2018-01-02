package com.learn.scheduledexecutorsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.scheduledexecutorsvc.domain.User;
import com.learn.scheduledexecutorsvc.publisher.UserEventServiceImpl;

@SpringBootApplication
public class ScheduledExecutorServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ScheduledExecutorServiceApplication.class, args);
		UserEventServiceImpl impl = applicationContext.getBean(UserEventServiceImpl.class);
		
		for(int i=0;i<5;i++){
			impl.createNewEmployee(new User("User "+i));
		}
	}
}
