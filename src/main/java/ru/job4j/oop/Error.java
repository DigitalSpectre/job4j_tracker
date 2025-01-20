package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 1, "ERROR");
        Error error2 = new Error(false, 3, "WARNING");
        Error error3 = new Error(false, 5, "ALARM!");

        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
