package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this class will be used for our spring container configuration
// instead of xml based configuration, we are defining beans in java class rather than defining them in xml
@Configuration
@ComponentScan("com.luv2code.springdemo")
// spring will scan the given package for classes marked with @Component annotation
public class SportConfig {

    // define a bean for our sad fortune service

    @Bean // this annotation is used to define bean in our java code
    public FortuneService sadFortuneService() {  // the method name we give is the actual bean id that is registered with spring container, so we retrieve the bean using the beanId
        return new SadFortuneService();
    }

    // define the method to expose the bean
    // define the bean for swim coach and inject dependency
    // the method name we give is the actual bean id that is registered with spring container, so we retrieve the bean using the beanId
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
