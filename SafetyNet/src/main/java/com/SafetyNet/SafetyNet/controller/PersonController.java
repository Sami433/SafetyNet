package com.SafetyNet.SafetyNet.controller;

import com.SafetyNet.SafetyNet.model.Person;
import com.SafetyNet.SafetyNet.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController{


    private PersonService personService;

    PersonController(PersonService personService) {this.personService = personService;}

    @RequestMapping(value = "communityEmail", method = RequestMethod.GET)
    public List<String> listeEmails(@RequestParam(name = "city") String city) {

        return this.personService.findAllEmailsByCity(city);



    }}






