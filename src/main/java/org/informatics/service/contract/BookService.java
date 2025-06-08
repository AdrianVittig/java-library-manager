package org.informatics.service.contract;

import org.informatics.entity.Book;
import org.informatics.exception.NotValidCoverTypeException;

import java.math.BigDecimal;

public interface BookService {
    StringBuilder getBookDetails(Book book);
    BigDecimal calculateBookPrice(Book book) throws NotValidCoverTypeException;
}
