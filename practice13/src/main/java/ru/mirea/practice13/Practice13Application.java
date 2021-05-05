package ru.mirea.practice13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Practice13Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice13Application.class, args);
    }
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
    User Igor = context.getBean(User.class);
}
