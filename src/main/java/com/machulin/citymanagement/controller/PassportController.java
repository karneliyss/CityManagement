package com.machulin.citymanagement.controller;


import com.machulin.citymanagement.model.Passport;
import com.machulin.citymanagement.service.PassportService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/passport")




public class PassportController {

    private PassportService passportService;


    @PostMapping
    public Passport createPassport(Passport passport) {
        return passportService.createPassport(passport);
    }



    @GetMapping
    public Passport getPassportById(Long id) {
        return passportService.getPassportById(id);
    }

    @GetMapping("/all")
    public List<Passport> getAllPassports() {
        return passportService.getAllPassports();
    }

    @PutMapping
    public Passport changePassportNumber(@PathParam("id") Long id, @RequestBody Long number) {
        return passportService.changePassportNumber(id, number);
    }



    @DeleteMapping("/{id}")
    public void deletePassportById(@PathVariable("id") Long id) {
        passportService.deletePassportById(id);
    }

}
