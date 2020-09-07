package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.PersonDao;
import com.example.springBootDemo.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
