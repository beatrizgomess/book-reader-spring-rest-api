package com.lbbg.bookreader.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column()
    private String title;
    private String caption;
    private List<Author> autors;
    private Date year_publication;
    private String language;
    private String publishing_company;
    private String synopsis;
    private String image;
}
