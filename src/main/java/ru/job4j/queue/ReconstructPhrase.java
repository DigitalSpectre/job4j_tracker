package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int size = evenElements.size();

        for (int i = 0; i < size; i++) {
            char str = evenElements.poll();
            result.append(str);
            if (i % 2 == 0) {
                result.append(str);
            }
            evenElements.add(str);
        }

        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        int size = descendingElements.size();

        for (int i = 0; i < size; i++) {
            char str = descendingElements.pollLast();
            result.append(str);
        }

        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}