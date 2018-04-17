package com.basics.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApp {
	public static void main(String[] args) {
		// load the spring configuration file
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/basics/ioc/applicationContext.xml")) {

			// retrieve bean from spring container
			Coach theCoach = context.getBean("myCoach", Coach.class);
			
			// call methods on the beans
			System.out.println(theCoach.getDailyWorkout());
		}
	}
}
