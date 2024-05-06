package ru.job4j.oop;

public class Tamagotchi {
    public static void main(String[] args) {
        int weight = 100;
        int weightcopy = weight;
        System.out.println("weight: " + weight);
        System.out.println("copy of weight: " + weightcopy);
        weightcopy += 10;
        System.out.println("weight: " + weight);
        System.out.println("copy of weight: " + weightcopy);

    }
}
