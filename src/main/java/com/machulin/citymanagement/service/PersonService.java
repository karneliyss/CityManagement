package com.machulin.citymanagement.service;

import com.machulin.citymanagement.model.Passport;
import com.machulin.citymanagement.model.Person;
import com.machulin.citymanagement.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonRepository personRepository;
    private PassportService passportService;


    public Person createPerson(Person person) {
        Passport passport = passportService.createPassport(person);
        person.setPassport(passport);
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(()->new RuntimeException("Person not found"));
    }

    public void deletePersonById(Long id) {
        personRepository.deleteById(id);
    }

    public void changePersonNameById(Long id, String name) {
        Person newPerson = getPersonById(id);
        newPerson.setFirstName(name);
        personRepository.save(newPerson);

    }
}