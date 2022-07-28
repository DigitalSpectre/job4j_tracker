package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl1 = Calculator.sum(10);
        int rsl2 = calculator.multiply(5);
        int rsl3 = Calculator.minus(2);
        int rsl4 = calculator.sumAllOperation(7);

        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(calculator.divide(3));
        System.out.println(rsl4);
    }
}
