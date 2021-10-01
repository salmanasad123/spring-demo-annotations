package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Today is a sad day";
    }
}
