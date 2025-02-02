package com.machulin.citymanagement.service;

import java.util.Random;

public class PassportNumberGenerator {
    private final static Random random = new Random();

    public static Long generatePassportNumber() {
        return (long) (random.nextInt(900000) + 100000);
    }
}
