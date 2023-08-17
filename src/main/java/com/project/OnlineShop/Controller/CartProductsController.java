package com.project.OnlineShop.Controller;

import com.project.OnlineShop.Entity.CartProducts;
import com.project.OnlineShop.Entity.FavouriteProduct;
import com.project.OnlineShop.Entity.Product;
import com.project.OnlineShop.Service.CartProductService;
import com.project.OnlineShop.Service.FavouriteProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cart")
@RestController
public class CartProductsController {

    CartProductService cartProductService;

    CartProductsController ( CartProductService cartProductService)
    {
        this.cartProductService=cartProductService;
    }

    @PostMapping
    ResponseEntity<CartProducts> saveProduct(@RequestBody CartProducts cartProducts){
        return ResponseEntity.ok(cartProductService.createProduct(cartProducts));
    }
    @GetMapping
    ResponseEntity<List<CartProducts>> findAll(){
        return ResponseEntity.ok(cartProductService.findAll());
    }


    @DeleteMapping("{id}")
    ResponseEntity delete(@PathVariable int id){
        cartProductService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
