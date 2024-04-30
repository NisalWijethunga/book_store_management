package com.example.book_store_managemnet.repository;

import com.example.book_store_managemnet.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {
}
