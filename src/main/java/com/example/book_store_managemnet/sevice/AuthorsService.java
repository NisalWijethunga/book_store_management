package com.example.book_store_managemnet.sevice;


import com.example.book_store_managemnet.entity.Authors;

import java.util.List;

public interface AuthorsService {


    void addAuthors(Authors authors);

    List<Authors> getAuthors();

//    void updateAuthors(Integer author_Id, Authors authors);


}
