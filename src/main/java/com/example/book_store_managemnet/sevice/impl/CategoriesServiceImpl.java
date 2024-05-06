package com.example.book_store_managemnet.sevice.impl;

import com.example.book_store_managemnet.entity.Categories;
import com.example.book_store_managemnet.repository.BookDetailRepository;
import com.example.book_store_managemnet.repository.CategoriesRepository;
import com.example.book_store_managemnet.sevice.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public void addCategories(Categories categories) {

        categoriesRepository.save(categories);
    }

    @Override
    public List<Categories> getCategories() {

        return categoriesRepository.findAll();
    }
}
