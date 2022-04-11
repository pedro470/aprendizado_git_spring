package com.aprender.primeiro_teste.services;

import java.util.List;

import com.aprender.primeiro_teste.entities.User;
import com.aprender.primeiro_teste.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        List<User> lista = userRepository.findAll();
        return lista;
    }

    public List<User> findByName(String name){
        List<User> lista = userRepository.findByNome(name);
        return lista;
    }
}