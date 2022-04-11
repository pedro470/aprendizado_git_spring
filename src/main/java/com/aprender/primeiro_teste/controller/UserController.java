package com.aprender.primeiro_teste.controller;

import java.util.List;

import com.aprender.primeiro_teste.entities.User;
import com.aprender.primeiro_teste.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> lista = userService.findAll();
        return ResponseEntity.ok(lista);
    }
    
    @GetMapping("/pesquisa")
    public ResponseEntity<List<User>> findByName(@RequestParam String nome){
        List<User> usuario = userService.findByName(nome);
        return ResponseEntity.ok(usuario);
    }
}
