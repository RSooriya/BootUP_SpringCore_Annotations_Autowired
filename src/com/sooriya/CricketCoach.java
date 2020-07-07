package com.sooriya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Autowired annotation above any method - method injection 
@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public void autowireDependency(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice bowling for daily 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
