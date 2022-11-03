package com.lbbg.bookreader.service.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@SecondaryTable(name = "BOOK_PHOTO", pkJoinColumns = {
        @PrimaryKeyJoinColumn(name = "ID_BOOK")})
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "generator", initialValue = 1)
    @Column(name = "ID")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String caption;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "AUTHORS_BOOKS", joinColumns = {
            @JoinColumn(name = "ID_AUTHOR", referencedColumnName = "ID"),
            @JoinColumn(name = "BOOK_TITLE", referencedColumnName = "title"),

    })
    private List<Author> authors;
    @Column(nullable = false)
    private LocalDate year_publication;
    @Column(nullable = false)
    private String language;
    @Column(nullable = false)
    private String publishing_company;
    @Column(nullable = false)
    private String synopsis;
    @Column(table = "BOOK_PHOTO")
    private byte[] image;
}

// O ID DO AUTOR - ID DO LIVRO
// ID_AUTOR = ID_A - ID_LIVRO = ID_L
/*
    NA TABELA AUTOR_LIVRO O ID DO LIVRO VAI ESTAR REFERENCIADO AO ID DO AUTOR

 */
