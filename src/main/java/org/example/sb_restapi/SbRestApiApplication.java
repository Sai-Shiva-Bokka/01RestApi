package org.example.sb_restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbRestApiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run =
                SpringApplication.run(SbRestApiApplication.class, args);
    }

}
