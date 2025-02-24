package com.machulin.citymanagement.service;

import com.machulin.citymanagement.repository.PassportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@AllArgsConstructor

public class PassportNumberGenerateService {

    private PassportRepository passportRepository;

    public Long generatePassportNumber() {
        Long number;
        do {
            number = ThreadLocalRandom.current().nextLong(100000, 1000000);
        } while (passportRepository.existsByNumber(number));


        return number;
    }
}
