package com.example.book_store_managemnet.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity

public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer category_Id;
    private String name;
    private String description;

    public Categories() {

    }

    public Categories(Integer category_Id, String name, String description) {
        this.category_Id = category_Id;
        this.name = name;
        this.description = description;
    }
}
