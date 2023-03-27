package MyController;

import Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Autowired
    private GreetingService greetingService;

    public void setInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getInjectedController() {
        return greetingService.SayGreeting();
    }
}
