package ness.matejcik.books;

import java.time.LocalDate;

public class Borrowing {

    private Book bookThatWasBorrowed;
    private Subscriber subscriberThatBorrowedBook;
    private LocalDate dateOfBorrowing;
    private LocalDate dateOfReturn;

    public Borrowing(Book bookThatWasBorrowed, Subscriber subscriberThatBorrowedBook, LocalDate dateOfBorrowing) {
        this.bookThatWasBorrowed = bookThatWasBorrowed;
        this.subscriberThatBorrowedBook = subscriberThatBorrowedBook;
        this.dateOfBorrowing = dateOfBorrowing;
    }


    public void setReturnDate(LocalDate now) {
        this.dateOfReturn = now;
    }
}
