package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// if you don't specify the bean id the default bean id is the class name with first letter lowercase
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // automatically wire the fortune service implementation
    // create the object of implementation of fortune service and inject it into the constructor
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand for 10 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}
