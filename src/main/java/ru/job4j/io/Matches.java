package ru.job4j.io;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if ((matches <= 3 && (matches >= 1)) && (matches <= count)) {
                count -= matches;
                turn = !turn;
                System.out.println("Осталось спичек: " + count);
            } else {
                System.out.println("Игрок ввёл неверное количество спичек. Попробуй ещё раз.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}