package com.firstspring.controller;

import com.firstspring.model.Greeting;
import com.firstspring.model.User;
import com.firstspring.service.igreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

@Autowired
private igreetingService greetingService;
    @GetMapping("/greeting")
    public Greeting gretting (@RequestParam(value = "name", defaultValue = "World") String name){
       // return new Greeting(counter.incrementAndGet(),
            //    String.format(template, name));
        User user=new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }}