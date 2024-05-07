package com.example.book_store_managemnet.repository;

import com.example.book_store_managemnet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
    User findByUsername(String userName);

}


