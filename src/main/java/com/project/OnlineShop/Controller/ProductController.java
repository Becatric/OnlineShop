package com.project.OnlineShop.Controller;

import com.project.OnlineShop.Entity.Product;
import com.project.OnlineShop.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    ProductService productService;

    ProductController(ProductService productService){this.productService=productService;}

    //Post, get, delete
    @PostMapping
    ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.createProduct(product));
    }

    @GetMapping
    ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("{name}")
    ResponseEntity<Product> findByName(@PathVariable String name){
        return ResponseEntity.ok(productService.findByName(name).get(0));
    }

    @DeleteMapping("{id}")
    ResponseEntity delete(@PathVariable int id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
