package com.example.javafxspringboot;

import com.example.javafxspringboot.ui.JavaFxApplication;
import javafx.application.Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaFxSpringBootApp {

    public static void main(String[] args) {
        // This is how normal Spring Boot app would be launched
        //SpringApplication.run(JavafxWeaverExampleApplication.class, args);

        Application.launch(JavaFxApplication.class, args);
    }
}
