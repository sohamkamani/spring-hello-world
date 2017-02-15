package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting(1, "hi there");
        System.out.print(greeting.getContent());
        SpringApplication.run(App.class, args);
    }
}