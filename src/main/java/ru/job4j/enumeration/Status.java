package ru.job4j.enumeration;

public enum Status implements Code {
    ACCEPTED(1, "Принят"),
    IN_WORK(2, "В работе"),
    WAITING(3, "Ожидает клиента"),
    FINISHED(4, "Завершен");

    private final String text;
    private final int code;

    Status(int code, String text) {
        this.text = text;
        this.code = code;
    }

    public String info() {
        return text;
    }

    @Override
    public int code() {
        return code;
    }
}