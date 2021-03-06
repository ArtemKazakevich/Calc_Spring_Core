package org.example;

import org.example.applications.Application;
import org.example.applications.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Application application = applicationContext.getBean("application", Application.class);
        application.start();
    }
}
