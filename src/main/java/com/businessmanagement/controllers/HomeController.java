package com.businessmanagement.controllers;

import java.util.List;

import com.businessmanagement.entities.Product;
import com.businessmanagement.loginCredentials.AdminLogin;
import com.businessmanagement.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @Autowired
    private ProductServices productServices;

    @GetMapping("/home")
    public String home()
    {
        return "Home";
    }

    @GetMapping("/products")
    public String products( Model model)
    {
        List<Product> allProducts = this.productServices.getAllProducts();
        model.addAttribute("products", allProducts);
        return "Products";
    }

    @GetMapping("/location")
    public String location()
    {
        return "Locate_us";
    }

    @GetMapping("/about")
    public String about()
    {
        return "About";
    }

    @GetMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("adminLogin",new AdminLogin());
        return "Login";
    }
}
