package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call the method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the spring container (context)
        context.close();
    }
}
