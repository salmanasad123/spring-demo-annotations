package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    // field injection, Spring will automatically inject the implementation of the FortuneService
    // interface without any setter methods or constructor, it will set the field value right where
    // we define. This is achieved using Java Reflection
    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Dribbling for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
