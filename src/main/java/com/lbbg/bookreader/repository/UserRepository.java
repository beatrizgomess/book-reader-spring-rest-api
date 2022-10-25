package com.lbbg.bookreader.repository;

import com.lbbg.bookreader.dao.ConnectionManager;
import com.lbbg.bookreader.entity.Role;
import com.lbbg.bookreader.entity.User;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GenericRepository<User, Integer>{

    @Override
    public User insert(User user) {
        String sql = "INSERT INTO tb_user(EMAIL, NAME, SURNAME, SEX, BIRTH_DATE, STATE," +
                " CITY, PASSWORD, IMAGE, BOOKS, ROLE_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = ConnectionManager.getCurrentConection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            argsPreparedStatement(preparedStatement, user);

            preparedStatement.execute();
            final ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if(generatedKeys.next()){
                user.setId(generatedKeys.getLong(1));
            }

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public Optional<User> finById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }




    public void argsPreparedStatement(PreparedStatement preparedStatement, User user) throws SQLException{
        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getSurname());
        preparedStatement.setObject(4, user.getSex());
        preparedStatement.setDate(5, (Date) user.getBirth_date());
        preparedStatement.setObject(6, user.getAddress().getState());
        preparedStatement.setObject(7, user.getAddress().getCity());
        preparedStatement.setString(8, user.getPassword());
        preparedStatement.setString(9, String.valueOf(user.getImage()));
        preparedStatement.setString(10, user.getBooks().toString());
        preparedStatement.setInt(11, user.getRole().getId());
    }
}
