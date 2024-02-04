/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package springaoptut;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "springaoptut")
@EnableAspectJAutoProxy
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}
