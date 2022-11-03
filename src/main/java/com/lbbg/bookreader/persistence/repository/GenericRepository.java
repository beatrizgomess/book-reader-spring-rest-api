package com.lbbg.bookreader.persistence.repository;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T, ID> {
     T insert(T t);
     void update(T t);
    Optional<T> finById(ID id);
    List<T> findAll();
    void deleteById(ID id);

}
