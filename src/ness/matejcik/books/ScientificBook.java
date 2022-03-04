package ness.matejcik.books;

public class ScientificBook extends Book {

    private String scientificArea;

    public ScientificBook(String nameOfTheBook, String authorOfTheBook, int numberOfPages, String scientificArea) {
        super(nameOfTheBook, authorOfTheBook, numberOfPages);
        this.scientificArea = scientificArea;
    }

}
