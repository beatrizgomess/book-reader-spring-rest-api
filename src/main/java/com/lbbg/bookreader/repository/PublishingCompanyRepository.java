package com.lbbg.bookreader.repository;

import com.lbbg.bookreader.entity.PublishingCompany;
import com.lbbg.bookreader.entity.Role;

import java.util.List;
import java.util.Optional;

public class PublishingCompanyRepository implements GenericRepository<PublishingCompany, Integer> {

    @Override
    public PublishingCompany insert(PublishingCompany publishingCompany) {

        return null;
    }

    @Override
    public void update(PublishingCompany publishingCompany) {

    }

    @Override
    public Optional<PublishingCompany> finById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<PublishingCompany> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
