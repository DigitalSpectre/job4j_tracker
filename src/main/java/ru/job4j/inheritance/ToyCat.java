package ru.job4j.inheritance;

public class ToyCat extends Cat1 {
    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat1 cat = new Cat1();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
    }
}