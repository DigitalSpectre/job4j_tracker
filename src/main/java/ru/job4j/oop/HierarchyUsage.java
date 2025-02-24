package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        /** создаем объекта класса Car. */
        Car2 car = new Car2();
        /** делаем приведение к типу родителя Transport. */
        Transport transport = car;
        /** делаем приведение к типу родителя Object. */
        Object object = car;
        /** Приведение типа при создании объекта. */
        Object objectCar = new Car2();
        /** Приведение типа за счет понижения по иерархии. */
        Car2 carFromObject = (Car2) objectCar;

        /** Ошибка в приведении типа. */
        Object bicycle = new Bicycle();
        Car2 carBicycle = (Car2) bicycle; /** код завершится с ошибкой приведения типов ClassCastException */

        System.out.println(new Car2());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}