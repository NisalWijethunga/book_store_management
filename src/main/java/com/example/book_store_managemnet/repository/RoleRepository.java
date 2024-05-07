package com.example.book_store_managemnet.repository;

import com.example.book_store_managemnet.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
