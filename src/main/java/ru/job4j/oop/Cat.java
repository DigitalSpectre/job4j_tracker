package ru.job4j.oop;

public class Cat {

    private String food;

    public void show() {
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
    }
}