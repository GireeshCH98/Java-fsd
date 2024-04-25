package com.ecommerce.controller;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProduct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private final EProductDAO productDAO;

    public MainController(EProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping("/listProducts")
    public String listProducts(Model model) {
        List<EProduct> productList = productDAO.getProducts();
        model.addAttribute("products", productList);
        return "listProducts";
    }
}