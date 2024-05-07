package com.example.book_store_managemnet.sevice.impl;

import com.example.book_store_managemnet.dto.RegistrationDto;
import com.example.book_store_managemnet.entity.Role;
import com.example.book_store_managemnet.entity.User;
import com.example.book_store_managemnet.repository.RoleRepository;
import com.example.book_store_managemnet.repository.UserRepository;
import com.example.book_store_managemnet.sevice.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        User user = new User();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }
    
}
