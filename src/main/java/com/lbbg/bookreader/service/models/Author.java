package com.lbbg.bookreader.service.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@SecondaryTable(name = "AUTHOR_PHOTO", pkJoinColumns = {
        @PrimaryKeyJoinColumn(name = "ID_AUTHOR")})
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "generator", initialValue = 1)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre; // make the genus class an enumeration class?
    @Column(nullable = false)
    private String local;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Date birth_date;

    private byte[] image;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "AUTHORS_BOOKS", joinColumns = {
            @JoinColumn(name = "ID_AUTHOR", referencedColumnName = "ID"),
            @JoinColumn(name = "AUTHOR_NAME", referencedColumnName = "NAME")
    })
    private List<Book> books;

}
