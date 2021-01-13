package com.solomka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    //Create a Spring project using Maven.
    // The application should sout to the console -  which time is it, every second.
    // Use annotation @Sceduled to create a scheduler.
    // Don’t forget to enable scheduling in your configuration (JavaConfig).
    // For more information please use Google. :) (cron)
    //Good luck))
    //
    //P.S. I actually  don’t care about way you implement this, just two rules:
    //Build a project on Spring Framework
    //Try to avoid bikes, tricycles, and shit-code :) I believe in u)
    public static void main(String[] args) {
        System.out.println(new Date());
        AnnotationConfigApplicationContext  context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
