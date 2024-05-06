package com.example.book_store_managemnet.sevice;

import com.example.book_store_managemnet.entity.BookDetail;

import java.util.List;

public interface BookDetailService {
    void addBookDetail(BookDetail bookDetail);

    List<BookDetail> getBookDetail();
}
