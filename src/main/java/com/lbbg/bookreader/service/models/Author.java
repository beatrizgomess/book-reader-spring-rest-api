package com.lbbg.bookreader.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Author {
    private Long id;
    private String name;
    private String genre;
    private String local;
    private String description;
    private Date birth_date;
    private String image;

}
