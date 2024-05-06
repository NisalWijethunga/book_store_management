package com.example.book_store_managemnet.controller;

import com.example.book_store_managemnet.entity.Authors;
import com.example.book_store_managemnet.entity.BookDetail;
import com.example.book_store_managemnet.sevice.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookDetail")

public class BookDetailController {

    @Autowired
    private BookDetailService bookDetailService;

    @PostMapping("add")
    public String addBookDetail(@RequestBody BookDetail bookDetail){
        bookDetailService.addBookDetail(bookDetail);

        return "Successfully added a Book";
    }

    @GetMapping
    public List<BookDetail> getBookDetail(){

        return bookDetailService.getBookDetail();
    }




}
