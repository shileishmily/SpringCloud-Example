package com.leo.springcloud.user.controller;

import com.leo.springcloud.user.pojo.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson() {
        Person person = new Person();

        person.setId(2);
        person.setAge(20);
        person.setName("leo");

        return person;
    }

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId) {
        Person person = new Person();

        person.setId(personId);
        person.setAge(18);
        person.setName("atm");

        return person;
    }
}