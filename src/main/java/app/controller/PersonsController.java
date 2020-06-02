package app.controller;

import app.entity.Person;
import app.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonsController {

  private final CalcService calcService;

  public PersonsController(CalcService calcService) {
    this.calcService = calcService;
  }

  @RequestMapping("/persons")
  public List<Person> handle() {
    return Arrays.asList(
        new Person("Jim"),
        new Person("John")
    );
  }

  @GetMapping("/calc")
  public String calc() {
    int c = calcService.add(1, 2);
    return Integer.toString(c);
  }

}
