package ru.job4j.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class DequeRunner4 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        Iterator<String> iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
