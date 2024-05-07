package com.example.book_store_managemnet.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table


public class BookAuthorsCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookDetail book;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Authors author;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    public BookAuthorsCategories() {

    }

    public BookAuthorsCategories(Integer id, BookDetail book, Authors author, Categories category) {
        this.id = id;
        this.book = book;
        this.author = author;
        this.category = category;
    }
}
