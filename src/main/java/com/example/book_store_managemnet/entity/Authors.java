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

public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer author_Id;
    private String name;
    private String email;
    private String biography;


}
