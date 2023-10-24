package metrostate.edu.ics625.mathapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MathApplication {

	public static void main(String[] args) {
            ApplicationContext ctx = 
                SpringApplication.run(MathApplication.class, args);
    
            for(String n: ctx.getBeanDefinitionNames())
            System.out.println("BEAN=" + n);
	}

}
