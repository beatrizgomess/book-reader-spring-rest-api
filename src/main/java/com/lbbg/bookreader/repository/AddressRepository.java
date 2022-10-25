package com.lbbg.bookreader.repository;

import com.lbbg.bookreader.entity.Address;
import com.lbbg.bookreader.entity.Role;

import java.util.List;
import java.util.Optional;

public class AddressRepository implements GenericRepository<Address, Integer>{

    @Override
    public Address insert(Address address) {

        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public Optional<Address> finById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
