package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//creating spring container and loading configuration file
        ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieving bean from the container
        //At this point bean will be fully assembled as all the objects wil be wired up on @Autowired annotation 
        Coach theCoach = context.getBean("cricketCoach",Coach.class);
        //calling methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
		
		
	}

}
