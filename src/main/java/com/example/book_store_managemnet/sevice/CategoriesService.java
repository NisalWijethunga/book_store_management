package com.example.book_store_managemnet.sevice;

import com.example.book_store_managemnet.entity.Categories;

import java.util.List;

public interface CategoriesService {
    void addCategories(Categories categories);


    List<Categories> getCategories();
}
