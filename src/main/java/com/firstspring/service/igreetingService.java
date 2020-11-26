package com.firstspring.service;

import com.firstspring.model.Greeting;
import com.firstspring.model.User;
import org.springframework.stereotype.Service;

@Service
public interface igreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingBYId(long id);
}
