package ru.jetty.simpleweb.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.jetty.simpleweb.model.Person;

@Service
public class PersonService {

//  @Autowired
//  private ActiveMQQueue queue;

  public static final Person person = new Person("Sasha", 31);

  public Person getPerson(){
    System.out.println("++++++++++++++++++++++++++++");
//    queue.getDataStructureType();
    return person;
  }

}
