package com.example.book_store_managemnet.controller;

import com.example.book_store_managemnet.entity.Authors;
import com.example.book_store_managemnet.entity.BookDetail;
import com.example.book_store_managemnet.entity.Categories;
import com.example.book_store_managemnet.sevice.AuthorsService;
import com.example.book_store_managemnet.sevice.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")

public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;


    @PostMapping("add")
    public String addCategories(@RequestBody Categories categories){
        categoriesService.addCategories(categories);

        return "Successfully added a category";
    }
    @GetMapping
    public List<Categories> getCategories(){

        return categoriesService.getCategories();
    }
}
