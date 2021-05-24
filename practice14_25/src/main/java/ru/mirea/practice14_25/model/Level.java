package ru.mirea.practice14_25.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "levels")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Level {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "levelsIdSeq", sequenceName = "levels_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "levelsIdSeq")
    public Integer id;

    @Column(name = "name")
    public String levelName;

    @Column(name = "complexity")
    public int complexity;

    public Level(String levelName, int complexity) {
        this.levelName = levelName;
        this.complexity = complexity;
    }

    public Level() {

    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
