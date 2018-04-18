package com.basics.ioc.beans;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.basics.ioc.interfaces.Coach;
import com.basics.ioc.interfaces.FortuneService;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String teamName;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void initMethod() {
		System.out.println("Init method called");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method called");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k \n::: Email: " + emailAddress + "\n::: Team: " + teamName + "\n";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}










