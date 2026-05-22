package ru.job4j.collection;

import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueRunner3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        for (String string : queue) {
            System.out.println(string);
        }

        Queue<String> queue2 = new ArrayBlockingQueue<>(3);
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");

        for (String string : queue2) {
            System.out.println(string);
        }
    }
}
