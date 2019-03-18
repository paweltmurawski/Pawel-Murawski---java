//package com.kodilla.testing.library;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LibraryUser {
//    String firstname;
//    String lastname;
//    String peselId;
//
//    public LibraryUser(String firstname, String lastname, String peselId) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.peselId = peselId;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public String getPeselId() {
//        return peselId;
//    }
//
//    @Override
//    public String toString() {
//        return "LibraryUser{" +
//                "firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", peselId='" + peselId + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof LibraryUser)) return false;
//
//        LibraryUser that = (LibraryUser) o;
//
//        if (!firstname.equals(that.firstname)) return false;
//        if (!lastname.equals(that.lastname)) return false;
//        return peselId.equals(that.peselId);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = firstname.hashCode();
//        result = 31 * result + lastname.hashCode();
//        result = 31 * result + peselId.hashCode();
//        return result;
//    }
//
//    public interface LibraryDatabase {
//
//        // lists books having title beginning with titleFragment
//        List<Book> listBooksWithCondition (String titleFragment);
//
//        // list books borrowed by libraryUser
//        List<Book> listBooksInHandsOf (LibraryUser libraryUser);
//
//        // try to rent a book for libraryUser
//        // returns true when success
//        // and returns false when book is unavailable to rent
//        boolean rentABook (LibraryUser libraryUser, Book book);
//
//        // return all books borrowed by libraryUser to the library
//        // returns number of books returned back
//        int returnBooks (LibraryUser libraryUser);
//    }
//}
//
//public class BookLibrary {
//    LibraryDatabase libraryDatabase;
//
//    public BookLibrary(LibraryDatabase libraryDatabase) {
//        this.libraryDatabase = libraryDatabase;
//    }
//
//    public List<Book> listBooksWithCondition(String titleFragment) {
//        List<Book> bookList = new ArrayList<Book>();
//        if (titleFragment.length() < 3) return bookList;
//        List<Book> resultList = libraryDatabase
//                .listBooksWithCondition(titleFragment);
//        if (resultList.size() > 20) return bookList;
//        bookList = resultList;
//        return bookList;
//    }
//}
