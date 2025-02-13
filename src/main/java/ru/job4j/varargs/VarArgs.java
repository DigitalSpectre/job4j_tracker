package ru.job4j.varargs;

public class VarArgs {

    public static String text(String[] strings) {
        return "";
    }

    public static void main(String[] args) {
        String[] strings = {"aaa", "bbb", "ccc"};
        String string = text(strings);
        System.out.println(string);
    }

}
