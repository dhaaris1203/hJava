package com.Spring.Anno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
	public static void main(String[] args )
    {
		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
		
		  Samsung s = factory.getBean(Samsung.class); 
		  s.config();
	
    }
}
