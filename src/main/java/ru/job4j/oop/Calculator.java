package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int mns) {
        return x - mns;
    }

    public int divide(int di) {
        return di / x;
    }

    public int sumAllOperations(int sao) {
        return sum(sao) + multiply(sao) + divide(sao) + minus(sao);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = Calculator.sum(10);
        System.out.println("Result of sum with x = 5 and y = 10: " + result);
        result = Calculator.minus(10);
        System.out.println("Result of minus with x = 5 adn mns = 10: " + result);

        result = calculator.multiply(5);
        System.out.println("Result of multiply with x = 5 and a = 5: " + result);
        result = calculator.divide(5);
        System.out.println("Result of divide with x = 5 and di = 5: " + result);

        result = calculator.sumAllOperations(5);
        System.out.println("Result of sumAllOperations with x = 5 and sao = 5: " + result);
    }
}