package ru.job4j.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeRunner {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");
        for (String string : deque) {
            System.out.println(string);
        }
    }
}
