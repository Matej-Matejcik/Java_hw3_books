package ness.matejcik.books;

public class ForeignBook extends Book {

    private String language;

    public ForeignBook(String nameOfTheBook, String authorOfTheBook, int numberOfPages) {
        super(nameOfTheBook, authorOfTheBook, numberOfPages);
        this.language = "English";
    }

    public ForeignBook(String nameOfTheBook, String authorOfTheBook, int numberOfPages, String language) {
        super(nameOfTheBook, authorOfTheBook, numberOfPages);
        this.language = language;
    }
}
