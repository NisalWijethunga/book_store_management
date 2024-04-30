package com.example.book_store_managemnet.sevice.impl;

import com.example.book_store_managemnet.entity.Authors;
import com.example.book_store_managemnet.repository.AuthorsRepository;
import com.example.book_store_managemnet.sevice.AuthorsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService {

    @Autowired
    private AuthorsRepository authorsRepository;

    @Override
    public void addAuthors(Authors authors) {
        authorsRepository.save(authors);

    }

    @Override
    public List<Authors> getAuthors() {
        return authorsRepository.findAll();
    }

//    @Override
//    public void updateAuthors(Integer author_Id, Authors authors) {
//        authorsRepository
//                .findById(author_Id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND."Invalid Author_Id" + author_Id));
//    }
}
