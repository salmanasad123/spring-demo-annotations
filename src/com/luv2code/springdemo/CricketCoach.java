package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// here we didn't specify any bean id so it will use the default bean it (i.e. take first letter of the
// class and make it lower case)
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice straight drive";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
