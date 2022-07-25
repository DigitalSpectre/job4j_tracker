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
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);
        Calculator calculatorMultiply = new Calculator();
        int rsl = calculatorMultiply.multiply(5);
        System.out.println(rsl);
        int resultMinus = Calculator.minus(2);
        System.out.println(resultMinus);
        Calculator calculatorDivide = new Calculator();
        System.out.println(calculatorDivide.divide(3));
        Calculator calculatorSumAllOperation = new Calculator();
        int resultSumAllOperation = calculatorSumAllOperation.sumAllOperation(7);
        System.out.println(resultSumAllOperation);
    }
}
