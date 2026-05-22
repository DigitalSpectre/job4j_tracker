package ru.job4j.collection;

import java.util.Queue;
import java.util.LinkedList;

public class QueueRunner4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue.peek());
    }
}
