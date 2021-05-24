package ru.mirea.practice14_25.model;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "name")
    public String name;
    @Column(name = "date")
    public String creationDate;

    public Game(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public Game() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
