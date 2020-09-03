package com.leonardostc.designpatterns.creationalpatterns.prototypePattern.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leonardo Samuel Tolosa Contreras
 */
public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookStore bookStore1 = new BookStore("BookStore1");
        bookStore1.setBookList(getBookList());

        BookStore bookStoreClone = bookStore1.clone("BookStore1 Clone");

        System.out.println(bookStore1);
        System.out.println(bookStoreClone);


    }

    private static List<Book> getBookList(){
        List<Book> bookList = new ArrayList<>();
        for(int i=1;i<=1000;i++){
            Book book = new Book();
            book.setCode("00"+i);
            book.setDescription("Description of book number 00"+i);
            book.setTitle("Book 00"+i);
            bookList.add(book);
        }
        return bookList;
    }
}
