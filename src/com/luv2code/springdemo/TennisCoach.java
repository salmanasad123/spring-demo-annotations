package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// if you don't specify the bean id the default bean id is the class name with first letter lowercase
@Component("thatSillyCoach")
@Scope("singleton") // only 1 instance will be created for this bean
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // constructor injection
    // automatically wire the fortune service implementation
    // create the object of implementation of fortune service and inject it into the constructor
    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
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

    // this method will execute after the bean is created, it's a life cycle hook
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Bean is created");
        System.out.println("Inside doMyStartupStuff() ");
    }

    // this method will execute before the bean is destroyed so we mark it with @PreDestroy annotation
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("Bean is about to be destroyed");
        System.out.println("Inside doMyCleanUpStuff() ");
    }

}
