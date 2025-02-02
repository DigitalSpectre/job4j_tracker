package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Bible", 1600);
        Book book2 = new Book("Crime and Punishment", 672);
        Book book3 = new Book("Thinking, Fast and Slow", 655);
        Book book4 = new Book("Clean Code", 464);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println("«" + books[i].getTitle() + "»" + " (" + books[i].getPages() + " pages)");
        }
        System.out.println("\tThe first and fourth books were swapped:");
        Book temp;
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println("«" + books[i].getTitle() + "»" + " (" + books[i].getPages() + " pages)");
        }
        System.out.println("\tOnly books with the title \"Clean Code\" were output:");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("Clean Code")) {
                System.out.println("«" + books[i].getTitle() + "»" + " (" + books[i].getPages() + " pages)");
            }
        }
    }
}
