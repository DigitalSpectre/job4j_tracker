package ru.job4j.tracker;

import java.time.LocalDateTime;

/** Класс Item описывает модель заявления.
 Поле id - это уникальный номер заявления.
 Поле name содержит название заявления.
 Поле created содержит дату создания заявления.
 */
public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}