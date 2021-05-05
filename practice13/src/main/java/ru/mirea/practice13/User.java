package ru.mirea.practice13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class User {
    @Value("${app.student.name}")
    private String name;
    @Value("${app.student.last_name}")
    private String last_name;
    @Value("${app.student.group}")
    private String group;
    @PostConstruct
    public void init(){
        System.out.println(name);
        System.out.println(last_name);
        System.out.println(group);
    }
}
