package com.example.book_store_managemnet.entity;
import java.util.Date;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table

public class BookDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer book_Id;
    private String title;
    private String isbn;
    private double price;
    private Date publication_date;


}
