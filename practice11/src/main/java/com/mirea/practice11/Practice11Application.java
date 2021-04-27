package com.mirea.practice11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// http://localhost:8080/actuator и через json-Viewer смотрим
// по умолчанию включены все кроме shutdown. Командой ниже включаем их вывод через http запрос
// проверяем состояние через http://localhost:8080/actuator/health
@SpringBootApplication
public class Practice11Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice11Application.class, args);
    }

}
