package com.project.OnlineShop.Service;

import com.project.OnlineShop.DAO.ProductDAO;
import com.project.OnlineShop.DAO.UserDAOImpl;
import com.project.OnlineShop.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    ProductDAO productDAO;
    ProductServiceImpl(){}

    @Autowired
    ProductServiceImpl(ProductDAO productDAO){
        this.productDAO=productDAO;
    }

    public Product createProduct(Product product){
        return productDAO.create(product);

    }

    public Product readProduct(int id){
        return productDAO.findById(id);

    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    public List<Product> findAll(){
        return productDAO.findAll();
    }

    public List<Product> findByName(String Name)
    {  List<Product> tempList=productDAO.findByName(Name);

        return tempList;
    }

    public List<Product> findByPrice(int price)
    { List<Product> tempList=productDAO.findByPrice(price);

      return tempList;
    }

    public void updateProduct(int id)
    {
        //find the product
        Product tempProd= productDAO.findById(id);
        //update it
        productDAO.update(tempProd);
    }

    public int deleteProduct(int id)
    { return productDAO.deleteProduct(id); }

    public int deleteAll()
    {   productDAO.deleteAll();

        return 1; //pe idee sa vad ca mere
    }

}
