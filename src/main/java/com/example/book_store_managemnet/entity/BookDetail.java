package com.example.book_store_managemnet.entity;
import java.util.Date;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class BookDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer book_Id;
    private String title;
    private String ISBN;
    private double price;
    private Date publicationDate;

    public BookDetail() {

    }

    public BookDetail(Integer book_Id, String title, String ISBN, double price, Date publicationDate) {
        this.book_Id = book_Id;
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.publicationDate = publicationDate;
    }
}
