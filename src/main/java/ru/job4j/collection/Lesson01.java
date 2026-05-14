package ru.job4j.collection;

import java.util.ArrayList;

public class Lesson01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        /** Добавление данных **/
        names.add("Petr");

        /** Замена или изменение данных **/
        names.set(0, "Ivan");

        /** Удаление данных **/
        names.remove(0);

        /** Чтение данных **/
//        for (int index = 0; index < names.size(); index++) {
//            Object value = names.get(index);
//            System.out.println(value);
//        }
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
