package ru.job4j.tracker.pojo;

/**
 * 3. Массивы и модели.[#242932]
 * задание
 *
 * @since 24.03.2020
 */
public class Book {
    private String nameBook;
    private int pageBook;

    public Book(String nameBook, int pageBook) {
        this.nameBook = nameBook;
        this.pageBook = pageBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook() {
        this.nameBook = nameBook;
    }

    public int getPageBook() {
        return pageBook;
    }

    public void setPageBook() {
        this.pageBook = pageBook;
    }
}
