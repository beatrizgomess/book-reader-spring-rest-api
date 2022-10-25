package com.lbbg.bookreader.repository;

import com.lbbg.bookreader.entity.Book;
import com.lbbg.bookreader.entity.Role;

import java.util.List;
import java.util.Optional;

public class BookRepository implements GenericRepository<Book, Integer>{

    @Override
    public Book insert(Book book) {

        return null;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public Optional<Book> finById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
