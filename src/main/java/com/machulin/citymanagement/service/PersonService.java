package com.machulin.citymanagement.service;

import com.machulin.citymanagement.model.Person;
import com.machulin.citymanagement.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person) {
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