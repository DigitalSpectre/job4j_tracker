package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf2 wolf2 = new Wolf2();
        girl.help(petya);
        wolf2.eat(girl);
        petya.kill(wolf2);
    }
}
