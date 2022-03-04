package ness.matejcik.books;

public class Book {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private int numberOfPages;

    public Book(String nameOfTheBook, String authorOfTheBook, int numberOfPages) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", authorOfTheBook='" + authorOfTheBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
