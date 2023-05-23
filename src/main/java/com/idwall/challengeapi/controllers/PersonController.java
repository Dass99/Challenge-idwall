package com.idwall.challengeapi.controllers;

import com.idwall.challengeapi.dtos.PersonDTO;
import com.idwall.challengeapi.services.PersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
  @Autowired
  private PersonService personService;

  @GetMapping(value = "/{id}")
  public PersonDTO findById(@PathVariable Long id) {
    PersonDTO result = personService.findById(id);
    return result;
  }

}
