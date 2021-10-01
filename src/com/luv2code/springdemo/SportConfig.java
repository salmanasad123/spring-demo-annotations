package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this class will be used for our configuration
@Configuration
@ComponentScan("com.luv2code.springdemo") // spring will scan the given package for classes marked with @Component annotation
public class SportConfig {
}
