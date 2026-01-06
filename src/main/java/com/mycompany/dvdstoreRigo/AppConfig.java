package com.mycompany.dvdstoreRigo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstoreRigo.controller", "com.mycompany.dvdstoreRigo.repository.file", "com.mycompany.dvdstoreRigo.service"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
