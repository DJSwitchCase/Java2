package ru.mirea.practice14_25.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.practice14_25.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String Username);
}
