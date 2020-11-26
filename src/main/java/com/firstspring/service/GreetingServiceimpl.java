package com.firstspring.service;

import com.firstspring.Repository.GreetingRepository;
import com.firstspring.model.Greeting;
import com.firstspring.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingServiceimpl implements igreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
@Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message=String.format(template,(user.toString().isEmpty())?"Hello World":user.getFirstName()+" "+user.getLastName());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreetingBYId(long id) {
        return null;
    }
}
