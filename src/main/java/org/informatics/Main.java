package org.informatics;

import org.informatics.exception.NotValidCoverTypeException;
import org.informatics.service.contract.BookService;
import org.informatics.service.impl.BookServiceImpl;
import org.informatics.entity.Book;
import org.informatics.util.CoverType;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Nz", "nz", "123123123", LocalDate.of(1997, 1, 1));
        book1.setCoverTypeSet(Set.of(CoverType.HARD));
        System.out.println(book1);

        BookService bookService = new BookServiceImpl();
        try {
            System.out.println(bookService.calculateBookPrice(book1));
        } catch (NotValidCoverTypeException e) {
            System.out.println(e.getMessage());
        }
    }
}