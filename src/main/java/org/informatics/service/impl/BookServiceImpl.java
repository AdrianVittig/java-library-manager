package org.informatics.service.impl;

import org.informatics.exception.NotValidCoverTypeException;
import org.informatics.service.contract.BookService;
import org.informatics.entity.Book;
import org.informatics.util.CoverType;

import java.math.BigDecimal;

public class BookServiceImpl implements BookService {


    @Override
    public BigDecimal calculateBookPrice(Book book) throws NotValidCoverTypeException {
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal price = BigDecimal.ZERO;
        for(int i = 0; i < book.getIsbn().length(); i++) {
            int currNumber = Integer.parseInt(String.valueOf(book.getIsbn().charAt(i)));
            sum = sum.add(BigDecimal.valueOf(currNumber));
            if(book.getCoverTypeSet().contains(CoverType.HARD)){
                price = (price.add(sum).multiply(BigDecimal.valueOf(.2))).add((BigDecimal.valueOf(book.getId())).multiply(BigDecimal.valueOf(.2)).add(BigDecimal.valueOf(8)));
            }
            else if(book.getCoverTypeSet().contains(CoverType.SOFT)){
                price = (price.add(sum).multiply(BigDecimal.valueOf(.1))).add((BigDecimal.valueOf(book.getId())).multiply(BigDecimal.valueOf(.2)).add(BigDecimal.valueOf(5)));
            }
            else{
                throw new NotValidCoverTypeException("Please enter valid cover type to calculate book price!");
            }
        }
        return price.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
    @Override
    public StringBuilder getBookDetails(Book book) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Details for book: ").append(book.getTitle()).append("\n");
        stringBuilder.append("ID: ").append(book.getId()).append("\n");
        stringBuilder.append("Title: ").append(book.getTitle()).append("\n");
        stringBuilder.append("ISBN: ").append(book.getIsbn()).append("\n");
        return stringBuilder;
    }
}
