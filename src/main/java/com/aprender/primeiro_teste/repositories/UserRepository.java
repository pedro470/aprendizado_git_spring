package com.aprender.primeiro_teste.repositories;

import java.util.List;

import com.aprender.primeiro_teste.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    public List<User> findByNome(String nome);
}
