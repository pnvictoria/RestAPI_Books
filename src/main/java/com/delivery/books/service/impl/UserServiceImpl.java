package com.delivery.books.service.impl;

import com.delivery.books.entity.UserEntity;
import com.delivery.books.repository.UserRepository;
import com.delivery.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserEntity create(UserEntity entity) {
        return repository.save(entity);
    }

    @Override
    public UserEntity read(BigInteger id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<UserEntity> readAll() {
        return repository.findAll();
    }

    @Override
    public UserEntity update(UserEntity entity) {
        return null;
    }

    @Override
    public void delete(UserEntity entity) {

    }
}
