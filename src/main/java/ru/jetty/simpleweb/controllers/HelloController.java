package ru.jetty.simpleweb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jetty.simpleweb.model.Person;
import ru.jetty.simpleweb.service.PersonService;

@RestController
@RequestMapping("/root")
public class HelloController {

  private static final Logger log = LoggerFactory.getLogger(HelloController.class);

  @Autowired
  private PersonService personService;

  @GetMapping(value = "/first", produces = MediaType.APPLICATION_JSON_VALUE)
  public Person root() {
    log.info("+++++++++++++++++This is ROOT logger+++++++++++++++++++++++++++++++");
    return personService.getPerson();
  }
}
