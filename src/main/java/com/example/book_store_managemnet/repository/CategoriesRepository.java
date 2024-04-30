package com.example.book_store_managemnet.repository;

import com.example.book_store_managemnet.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
