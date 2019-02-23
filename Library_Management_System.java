import java.util.Date;
enum BookFormat {HARDCOVER, PAPERBACK, AUDIO_BOOK, EBOOK, NEWSPAPER, MAGAZINE, JOURNAL}

enum BookStatus {AVAILABLE, RESERVED, LOANED, LOST}

enum ReservationStatus{WAITING, PENDING, CANCELED, NONE}

enum AccountStatus{ACTIVE, CLOSED, CANCELED, BLACKLISTED, NONE}

class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}

class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
}

class Constants {
    public static final int MAX_BOOKS_ISSUED_TO_A_USER = 5;
    public static final int MAX_LENDING_DAYS = 10;
}

class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;
}

class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memberId;
}

class Fine {
    private Date creationDate;
    private double bookItemBarcode;
    private String memberId;
}
class Book{
private String title;
    private String publisher;
    private String subject;
    private String language;
    private int No_of_pages;
}
class BookItem{
private String barcode;
private Date borrowed;
private Date dueDate;
private double price;
}

class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;
}

abstract class Librarian extends Account {
    abstract boolean addBookItem(BookItem bookItem);
   abstract boolean blockMember(Member member);
    abstract boolean unBlockMember(Member member);
}

abstract class Member extends Account {
    private Date dateOfMembership;
    private int totalBooksCheckedout;
    abstract boolean reserveBookItem(BookItem bookItem);



