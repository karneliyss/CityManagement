package com.machulin.citymanagement.service;


import com.machulin.citymanagement.model.Passport;
import com.machulin.citymanagement.repository.PassportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PassportService {


    private PassportRepository passportRepository;

    public Passport createPassport() {
        Passport passport = new Passport();
        passport.setNumber(PassportNumberGenerator.generatePassportNumber());
        return passportRepository.save(passport);
    }

    public void deletePassport(Passport passport) {
        passportRepository.delete(passport);
    }
}
