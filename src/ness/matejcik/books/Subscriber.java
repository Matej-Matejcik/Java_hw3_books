package ness.matejcik.books;

public class Subscriber {
    private String firstName;
    private String lastName;
    private SubscriberAddress fullAddress;
    private String emailAddress;
    private int age;

    public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullAddress = fullAddress;
        this.emailAddress = emailAddress;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String emailAddress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullAddress = fullAddress;
        this.emailAddress = emailAddress;
        this.age = age;
    }
}
