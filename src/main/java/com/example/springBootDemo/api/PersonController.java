package com.example.springBootDemo.api;

import com.example.springBootDemo.model.Person;
import com.example.springBootDemo.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
