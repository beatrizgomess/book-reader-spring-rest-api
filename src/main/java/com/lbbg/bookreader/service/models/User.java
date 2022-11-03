package com.lbbg.bookreader.service.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.*;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String surname;
    private Date birth_date;
    private Sex sex;
    private Address address;
    private ImageIcon image;
    private List<Book> books;
    private Role role;

}
