package com.example.book_store_managemnet.controller;

import com.example.book_store_managemnet.entity.BookAuthorsCategories;
import com.example.book_store_managemnet.sevice.BooksAuthorsCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booksAuthorsCategories")

public class BooksAuthorsCategoriesController {

    @Autowired
    private BooksAuthorsCategoriesService booksAuthorsCategoriesService;

//    @PostMapping("/add")
//    public String addBooksAuthorsCategories(@RequestBody BookAuthorsCategories bookAuthorsCategories){
//        booksAuthorsCategoriesService.addBooksAuthorsCategories(bookAuthorsCategories);
//
//        return "Success";
//
//    }

    @GetMapping
    public List<BookAuthorsCategories> getBooksAuthorsCategories(){
        return booksAuthorsCategoriesService.getBooksAuthorsCategories();
    }

}
