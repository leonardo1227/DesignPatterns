package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class BookStore implements Cloneable{

    private String name;
    private List<Book> bookList = new ArrayList<>();

    public BookStore() {
    }

    public BookStore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public BookStore clone(String newName) throws CloneNotSupportedException {
        BookStore bookStore = new BookStore();
        bookStore.setName(newName);
        bookStore.setBookList(this.bookList.stream().collect(Collectors.toList()));
        return bookStore;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
