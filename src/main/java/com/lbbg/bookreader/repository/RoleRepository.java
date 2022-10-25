package com.lbbg.bookreader.repository;

import com.lbbg.bookreader.dao.ConnectionManager;
import com.lbbg.bookreader.entity.Role;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class RoleRepository implements GenericRepository<Role, Integer>{


    @Override
    public Role insert(Role role) {
        final String sql = "INSERT INTO tb_role(name) VALUES (?)";

        try {
            final PreparedStatement preparedStatement = ConnectionManager.getCurrentConection().prepareStatement(sql);
            preparedStatement.setString(1, role.getName());
            preparedStatement.execute();

            final ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

            if(generatedKeys.next()){
                role.setId((int) generatedKeys.getLong(1));
            }

            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return role;
    }

    @Override
    public void update(Role role) {

    }

    @Override
    public Optional<Role> finById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
