package com.basics.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basics.ioc.interfaces.Coach;

/**
 * Hello world!
 *
 */
public class SpringSingletonAndPrototype {
	public static void main(String[] args) {
		// load the spring configuration file
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			// retrieve bean from spring container
			Coach singletonBaseballCoach = context.getBean("myBaseballCoach", Coach.class);
			Coach singletonBaseballCoach2 = context.getBean("myBaseballCoach", Coach.class);
			
			// check if both objets are the same
			boolean isTheSame = (singletonBaseballCoach == singletonBaseballCoach2);
			
			System.out.println("Pointing to the same object: " + isTheSame);
			System.out.println("Memory location [singletonBaseballCoach]: " + singletonBaseballCoach);
			System.out.println("Memory location [singletonBaseballCoach2]: " + singletonBaseballCoach2 + "\n");
			
			Coach prototypeSoccerCoach = context.getBean("mySoccerCoach", Coach.class);
			Coach prototypeSoccerCoach2 = context.getBean("mySoccerCoach", Coach.class);
			
			// check if both objets are the same
			isTheSame = (prototypeSoccerCoach == prototypeSoccerCoach2);
			
			System.out.println("Pointing to the same object: " + isTheSame);
			System.out.println("Memory location [prototypeSoccerCoach]: " + prototypeSoccerCoach);
			System.out.println("Memory location [prototypeSoccerCoach2]: " + prototypeSoccerCoach2 + "\n");
		}
	}
}
