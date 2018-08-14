package ru.jetty.simpleweb.controllers;

import static org.junit.Assert.assertEquals;
import static ru.jetty.simpleweb.TestData.PERSON_TEST;
import static ru.jetty.simpleweb.json.JsonUtil.readValue;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.jetty.simpleweb.model.Person;

/**
 * Created by user on 20.07.2018.
 */
public class HelloControllerIT {

  @Test
  public void testRoot() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl = "http://localhost:8080/root/first";
    ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

    Person expected = readValue(response.getBody(), Person.class);
    assertEquals(expected, PERSON_TEST);

  }
}