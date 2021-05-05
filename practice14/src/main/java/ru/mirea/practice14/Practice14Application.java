package ru.mirea.practice14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mirea.practice14.controllers.GameController;

@SpringBootApplication
public class Practice14Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice14Application.class, args);
    }
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    GameController gc = context
}
