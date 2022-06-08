package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.produtos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos/api")
public class produtosControllerJson {

    private List<produtos> prod = new ArrayList<>();

    produtosControllerJson() {
        prod.add(new produtos("Copo", 7.99, 30));
        prod.add(new produtos("Garfo", 3.40, 10));
        prod.add(new produtos("Colher", 0.50, 5));
    }

    @GetMapping
    List<produtos> getProdutos() {
        return prod;
    }
}
