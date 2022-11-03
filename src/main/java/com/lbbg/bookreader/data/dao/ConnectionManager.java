package com.lbbg.bookreader.data.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/book_reader_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    private static final Connection currentConection = null;

    public static Connection getCurrentConection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
