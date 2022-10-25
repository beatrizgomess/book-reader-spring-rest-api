package com.lbbg.bookreader.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class PublishingCompany {
    private Long id;
    private String name;
    private List<Author> authors;
    private List<Book> books;
    private String description;
    private Date birth_date;
    private String image;


}
