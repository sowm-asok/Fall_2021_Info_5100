package com.company.Question1;

import com.company.Question1.Book;
import com.company.Question1.iBorrowable;

public class Fiction extends Book implements iBorrowable {
    int borrowDay;
    int returnDay;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return getTitle() + " all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        borrowDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        returnDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if (day >= borrowDay && day <= returnDay) {
            return true;
        }
        return false;
    }
}
