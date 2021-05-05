package ru.mirea.practice14.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("ru.mirea.practice14")
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {

}
