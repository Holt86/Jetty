package ru.jetty.simpleweb.service;

import static org.junit.Assert.*;
import static ru.jetty.simpleweb.TestData.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.jetty.simpleweb.TestData;
import ru.jetty.simpleweb.model.Person;

/**
 * Created by user on 21.07.2018.
 */
@ContextConfiguration({
    "classpath:spring/spring-app.xml",
})
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonServiceTest {

  @Autowired
  private PersonService service;

  @Test
  public void testGetPerson() throws Exception {

    Person expected = service.getPerson();

    Assert.assertEquals(expected, PERSON_TEST);
  }
}