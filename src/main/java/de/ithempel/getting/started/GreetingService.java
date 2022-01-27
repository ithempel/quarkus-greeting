package de.ithempel.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(final String name) {
        return String.format("hello %s", name);
    }
    
}
