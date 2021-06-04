package ru.mirea.practice14_25.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.practice14_25.model.entity.Role;
import ru.mirea.practice14_25.model.entity.User;
import ru.mirea.practice14_25.model.repository.UserRepository;

import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/registration")
    public String registration() {
        return"registration";
    }
    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model){
         User userFromDB = userRepository.findByUsername(user.getUsername());
        System.out.println(userFromDB);
        System.out.println("Privet1");
         if (userFromDB != null){
            System.out.println("Privet2");
            model.put("hey", "User exists!");
            return "registration";
        }
        System.out.println("Privet3");
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepository.save(user);

        return "redirect:/";
    }
//
//    @GetMapping("/login")
//    public String sayHello(){
//        return "login";
//    }
}
