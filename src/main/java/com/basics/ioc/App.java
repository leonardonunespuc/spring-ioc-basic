package com.basics.ioc;

import com.basics.ioc.beans.TrackCoach;
import com.basics.ioc.interfaces.Coach;

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
