package com.example.book_store_managemnet.controller;
import com.example.book_store_managemnet.entity.Authors;
import com.example.book_store_managemnet.sevice.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")

public class AuthorController {

        @Autowired
        private AuthorsService authorsService;

        @PostMapping("add")
        public String addAuthors(@RequestBody Authors authors){
            authorsService.addAuthors(authors);

            return "Successfully added an Author";
        }

        @GetMapping
        public List<Authors> getAuthors(){
            return authorsService.getAuthors();
        }
        @PutMapping("/update/{author_Id}")
        public ResponseEntity<Void> updateAuthors(@PathVariable Integer author_Id, @RequestBody Authors authors){
            return ResponseEntity.noContent().build();
        }

}
