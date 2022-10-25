package com.lbbg.bookreader.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String caption;
    private List<Author> autors;
    private Date year_publication;
    private String language;
    private String publishing_company;
    private String synopsis;
    private String image;
}
