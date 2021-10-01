package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp3 {

    public static void main(String[] args) {

        // read the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("footballCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call the method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the spring container (context)
        context.close();
    }
}
