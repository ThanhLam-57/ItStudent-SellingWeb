package com.bksoftware.service_impl;

import com.bksoftware.model.Product;
import com.bksoftware.service.ProductService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private BufferedReader reader = null;
    private BufferedWriter writer = null;


    @Override
    public List<Product> findAllProduct() {
        List<Product> products = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader("product.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
               products.add(new Product(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return products;
    }

    @Override
    public Product add(Product product) {
        int dataSize = findAllProduct().size();
        product.setId(dataSize);
        try {
            writer = new BufferedWriter(new FileWriter("product.txt", true));
            writer.write(product.toData() + "\n");
            return product;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

}
