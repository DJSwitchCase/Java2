package ru.mirea.practice14_25;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.mirea.practice14_25.model.entity.Game;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@EntityScan("ru.mirea.practice14_25.model")
//@ComponentScan("ru.mirea.practice14_25.model.service.repository")
//@EnableJpaRepositories("ru.mirea.practice14_25.model.service.repository")
@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class Practice1425Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice1425Application.class, args);

    }
}

//Нужно чтобы запустился

