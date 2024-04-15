package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Fashion;
import com.example.demo.service.FashionService;

@RestController
@RequestMapping("/Pavani")
public class FashionController {
    @Autowired
    FashionService fashionservice;
    
    @PostMapping("/Fashion/add")
    public Fashion addNewFashion(@RequestBody Fashion fashion) {
        return fashionservice.addFashionToDB(fashion);
    }

    @PostMapping("/Fashion/all")
    public List<Fashion> addAllNewFashion(@RequestBody List<Fashion> fashionList) {
        return fashionservice.addAllFashiontoDB(fashionList);
    }

    @GetMapping("/Fashion/all")
    public List<Fashion> getAll() {
        return fashionservice.getAllFashion();
    }

    @GetMapping("/Fashion/{id}")
    public Fashion getFashionById(@PathVariable int id) {
        return fashionservice.getFashionbyID(id);
    }
}