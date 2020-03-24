package ru.job4j.tracker.pojo;

/**
 * 3. Массивы и модели.[#242932]
 * задание
 *
 * @since 24.03.2020
 */
public class Library {
    public static void main(String[] args) {
        Book zavet = new Book("Zavet", 360);
        Book faraon = new Book("Faraon", 1300);
        Book kolobok = new Book("Kolobok", 55);
        Book cleancode = new Book("Clean code", 1);
        Book[] books = new Book[]{zavet, faraon, kolobok, cleancode};
        System.out.println("Library:");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getNameBook() + " - page " + bk.getPageBook());
        }
        System.out.println("Exchange book[0] to books[3]");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getNameBook() + " - page " + bk.getPageBook());
        }
        System.out.println("Out Book = Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getNameBook().equals("Clean code")) {
                System.out.println(bk.getNameBook() + " - page " + bk.getPageBook());
            }
        }
    }
}
