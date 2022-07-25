package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 404, "Page not found");
        Error error2 = new Error(true, 503, "Service unavailable");
        Error error3 = new Error(true, 500, "Internal server error");
        error1.printError();
        error2.printError();
        error3.printError();

    }
}
