package com.lbbg.bookreader.persistence.repository;

import com.lbbg.bookreader.service.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository extends JpaRepository<Book, Long> {




}
