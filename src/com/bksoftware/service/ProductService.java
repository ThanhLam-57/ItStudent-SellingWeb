package com.bksoftware.service;

import com.bksoftware.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProduct();

    Product add(Product product);

    Product update(Product product);

    boolean delete(int id);


}
