package com.lbbg.bookreader.repository;

import com.lbbg.bookreader.entity.Author;
import com.lbbg.bookreader.entity.Role;

import java.util.List;
import java.util.Optional;

public class AuthorRepository implements GenericRepository<Author, Integer>{

    @Override
    public Author insert(Author author) {

        return null;
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public Optional<Author> finById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
