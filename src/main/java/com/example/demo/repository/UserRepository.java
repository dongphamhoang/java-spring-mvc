package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User data);

    List<User> findAll();

    User findById(long id);

    boolean existsByEmail(String email);
}
