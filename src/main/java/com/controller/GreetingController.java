package com.controller;

import com.core.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by Garlen on 19/02/2017.
 */

@RestController
public class GreetingController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

 //  @Autowired
//   private PeopleService peopleService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

//    @RequestMapping("/db")
//    public People database(@RequestParam(value = "name", defaultValue = "World") String name) {
//
//        People person =peopleService.getPeople(1);
//
//        return People.builder().age(person.getAge()).name(person.getName()).build();
//    }

}