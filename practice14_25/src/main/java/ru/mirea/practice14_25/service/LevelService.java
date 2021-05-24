package ru.mirea.practice14_25.service;

import ru.mirea.practice14_25.model.Level;

import java.util.List;

public interface LevelService {
    void create(Level level);
    List<Level> readAll();
    Level read(int id);
    boolean update(Level level, int id);
    boolean delete(int id);
}
