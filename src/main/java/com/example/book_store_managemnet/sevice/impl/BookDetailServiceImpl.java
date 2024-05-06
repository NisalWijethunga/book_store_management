package com.example.book_store_managemnet.sevice.impl;


import com.example.book_store_managemnet.entity.BookDetail;
import com.example.book_store_managemnet.repository.AuthorsRepository;
import com.example.book_store_managemnet.repository.BookDetailRepository;
import com.example.book_store_managemnet.sevice.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDetailServiceImpl implements BookDetailService {

    @Autowired
    private BookDetailRepository bookDetailRepository;


    @Override
    public void addBookDetail(BookDetail bookDetail) {

        bookDetailRepository.save(bookDetail);
    }

    @Override
    public List<BookDetail> getBookDetail() {
        return bookDetailRepository.findAll();
    }
}
