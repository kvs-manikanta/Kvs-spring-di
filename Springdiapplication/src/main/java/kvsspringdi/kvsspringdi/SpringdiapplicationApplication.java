package kvsspringdi.kvsspringdi;

import MyController.ConstructorInjectedController;
import MyController.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiapplicationApplication {


    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringdiapplicationApplication.class, args);

         MyController myController=(MyController) ctx.getBean("myController");

         String greeting=myController.sayHello();

         System.out.println(greeting);

        System.out.println("-----Constructorinjection");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.greetings());




    }
}
