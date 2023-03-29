package Services;

import org.springframework.stereotype.Service;

@Service

public class GreetingServiceimp implements GreetingService{

    @Override
    public String SayGreeting() {
        return "Hello World";
    }
}
