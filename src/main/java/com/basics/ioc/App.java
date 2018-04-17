package com.basics.ioc;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
