package com.mycompany.dvdstoreRigo;

import com.mycompany.dvdstoreRigo.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Application class
 * Project entry point
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstoreRigo.controller", "com.mycompany.dvdstoreRigo.repository.file", "com.mycompany.dvdstoreRigo.service"})
public class App {
    public static void main(String[] args) {

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigPropertySource.class);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();

    }
}
