package com.project.OnlineShop.Controller;

import com.project.OnlineShop.Entity.CartProducts;
import com.project.OnlineShop.Entity.FavouriteProduct;
import com.project.OnlineShop.Request.FavoriteProductRequest;
import com.project.OnlineShop.Service.FavouriteProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/favourite")
@RestController
public class FavouriteProductController {

    FavouriteProductService favouriteProductService;

    FavouriteProductController( FavouriteProductService favouriteProductService){
        this.favouriteProductService=favouriteProductService;
    }

    @PostMapping
    ResponseEntity<FavouriteProduct> saveProduct(@RequestBody FavoriteProductRequest favouriteProduct){
        return ResponseEntity.ok(favouriteProductService.createProduct(favouriteProduct));
    }

    @GetMapping
    ResponseEntity<List<FavouriteProduct>> findAll(){
        return ResponseEntity.ok(favouriteProductService.findAll());
    }


    @DeleteMapping("{id}")
    ResponseEntity delete(@PathVariable int id){
        favouriteProductService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
