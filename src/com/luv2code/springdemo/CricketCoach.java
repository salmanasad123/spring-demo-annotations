package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// here we didn't specify any bean id so it will use the default bean it (i.e. take first letter of the
// class and make it lower case)
@Component
@Scope("prototype")
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice straight drive";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    // we are using setter injection, spring will scan all the class with @Component annotation
    // and check if there is any class that implements fortune service interface, if it finds one
    // it will automatically inject the object of that class into our setter method using @Autowired annotation
    // so it will automatically wire up the object
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
