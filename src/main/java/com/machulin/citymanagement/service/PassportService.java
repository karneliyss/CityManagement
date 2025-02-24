package com.machulin.citymanagement.service;


import com.machulin.citymanagement.model.Passport;
import com.machulin.citymanagement.repository.PassportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PassportService {

    private PassportRepository passportRepository;
    private PassportNumberGenerateService passportNumberGenerateService;


    public Passport createPassport() {
        Passport passport = new Passport();
        Long passportNumber = passportNumberGenerateService.generatePassportNumber();
        passport.setNumber(passportNumber);
        return passportRepository.save(passport);
    }

    public void deletePassportById(Long id) {
        passportRepository.deleteById(id);
    }

    public Passport getPassportById(Long id) {
        return passportRepository.findById(id).orElseThrow(() -> new RuntimeException("Passport not found"));
    }

    public List<Passport> getAllPassports() {
        return passportRepository.findAll();
    }

    public Passport changePassportNumber(Long id, Long number) {
        Passport newPassport = getPassportById(id);
        newPassport.setNumber(number);
        return passportRepository.save(newPassport);

    }


}
