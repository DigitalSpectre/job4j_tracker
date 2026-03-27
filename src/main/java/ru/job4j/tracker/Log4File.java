package ru.job4j.tracker;

public final class Log4File {
    private String[] messages = new String[1000];
    private int index = 0;

    private Log4File() {
    }

    public void add(String message) {
        messages[index++] = message;
    }

    public void save() {
        //TODO Сохраняем записи из массива messages в файл.
    }
}