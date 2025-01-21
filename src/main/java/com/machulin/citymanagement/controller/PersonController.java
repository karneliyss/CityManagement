package com.machulin.citymanagement.controller;


import com.machulin.citymanagement.model.Person;
import com.machulin.citymanagement.service.PersonService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/person")


public class PersonController {
    private PersonService personService;


    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping()
    public Person getPersonById(@PathParam("id") Long id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable("id") Long id) {
        personService.deletePersonById(id);
    }

    @PutMapping()
    public void changePersonNameById(@PathParam("id") Long id, @RequestBody String  name) {
        personService.changePersonNameById(id, name);
    }

}
