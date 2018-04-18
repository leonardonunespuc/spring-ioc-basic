package com.basics.ioc.beans;

import com.basics.ioc.interfaces.Coach;
import com.basics.ioc.interfaces.FortuneService;

public class SoccerCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	private SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour practicing penalties";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}








