package com.lbbg.bookreader.persistence.repository;


import com.lbbg.bookreader.service.models.Book;
import com.lbbg.bookreader.service.models.Genre;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDate;


public class BookRepository {

    @Autowired // Injeção de dependencias
    private GenericRepository genericRepository;


    public void insertData(Book book){
        book.setTitle("Percy Jackson");
        book.setCaption("Ladrão de Raios");
        book.setGenre(Genre.INFANTO_JUVENIL);
        book.setLanguage("Português");
        book.setPublishing_company("Intrínseca");
        book.setSynopsis("Percy é ladrão");
        book.setYear_publication(LocalDate.of(2011,01,01));


    }

}
