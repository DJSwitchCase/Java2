package ru.mirea.practice14_25.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.mirea.practice14_25.model.Level;
import ru.mirea.practice14_25.service.LevelService;

import java.util.List;
//@Repository
public interface LevelRepository extends JpaRepository<Level, Integer> {
}
