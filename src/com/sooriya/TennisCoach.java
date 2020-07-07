package com.sooriya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Autowired annotation above field - field injection
@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice inside net daily for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
