package com.mirea.practice12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Practice12Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Practice12Application.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FileWork.class);
        FileWork fw = context.getBean("fileWork", FileWork.class);
    }
}
