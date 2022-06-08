package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.produtos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class produtosController {

    private List<produtos> prod = new ArrayList<>();

    produtosController() {
        prod.add(new produtos("Copo", 7.99, 30));
        prod.add(new produtos("Garfo", 3.40, 10));
        prod.add(new produtos("Colher", 0.50, 5));
    }

    @GetMapping
    private String produtosView(Model model) {
        model.addAttribute("produtos", prod);
        return "produtos";
    }
}
