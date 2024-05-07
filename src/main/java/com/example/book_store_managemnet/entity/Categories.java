package com.example.book_store_managemnet.entity;


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

public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer category_Id;
    private String name;
    private String description;


}
