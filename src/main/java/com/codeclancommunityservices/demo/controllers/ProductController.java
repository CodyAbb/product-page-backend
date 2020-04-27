//package com.codeclancommunityservices.demo.controllers;
//
//import com.codeclancommunityservices.demo.models.Product;
//import com.codeclancommunityservices.demo.repositories.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/products")
//public class ProductController {
//    @Autowired
//    ProductRepository productRepository;
//
//    @GetMapping
//    public List<Product> getAllProducts(){
//        return productRepository.findAll();
//    }
//}
