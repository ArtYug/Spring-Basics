package com.geekbrains.spring_homework;

import org.springframework.stereotype.Component;

@Component
public class ReferralToDentist implements Service {
    private final String name = "Jonny";

    public String getName() {
        return name;
    }

    public ReferralToDentist() {
    }

    @Override
    public void direct() {
        System.out.println("received a referral to the dentist" + " " + name);
    }
}
