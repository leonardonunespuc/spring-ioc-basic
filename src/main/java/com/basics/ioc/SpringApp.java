package com.basics.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basics.ioc.interfaces.Coach;

/**
 * Hello world!
 *
 */
public class SpringApp {
	public static void main(String[] args) {
		// load the spring configuration file
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			// retrieve bean from spring container
//			Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
			Coach theCoach = context.getBean("myTrackCoach", Coach.class);
			
			// call methods on the beans
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
		}
	}
}
