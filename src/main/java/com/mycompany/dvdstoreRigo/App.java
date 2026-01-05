package com.mycompany.dvdstoreRigo;

import com.mycompany.dvdstoreRigo.controller.MovieController;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Application class
 * Project entry point
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();

    }
}
