package com.example.book_store_managemnet.sevice.impl;

import com.example.book_store_managemnet.entity.BookAuthorsCategories;
import com.example.book_store_managemnet.repository.BooksAuthorsCategoriesRepository;
import com.example.book_store_managemnet.sevice.BooksAuthorsCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BooksAuthorsCategoriesServiceImpl implements BooksAuthorsCategoriesService {

    @Autowired
    private BooksAuthorsCategoriesRepository booksAuthorsCategoriesRepository;

    @Override
    public List<BookAuthorsCategories> getBooksAuthorsCategories() {
        return booksAuthorsCategoriesRepository.findAll();
    }
}
