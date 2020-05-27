package com.bksoftware.controller;

import com.bksoftware.model.Product;
import com.bksoftware.service.ProductService;
import com.bksoftware.service_impl.ProductServiceImpl;
import com.bksoftware.view.ProductView;

public class ProductController {

    private ProductService productService;

    private ProductView view;

    public ProductController(){
        productService = new ProductServiceImpl();
        view = new ProductView();
    }

    public void start(){
        view.showMenu();
        switch (view.getChoice()){
            case 1:
                showAllProductEvent();
                break;
            case 2:
                addProductEvent();
                break;
            default:
                System.exit(0);
        }
    }

    // Các phương thức xử lý
    private void showAllProductEvent(){
        view.showAllProduct(productService.findAllProduct());
        switch (view.getChoice()){
            case 1:
                updateProductEvent();
                break;
            case 2:
                deleteProductEvent();
                break;
            case 3:
                view.showSortMenu();
                sortProductEvent();
                break;
            case 0:
                start();
                break;
        }
    }

    private void sortProductEvent(){};

    private void addProductEvent(){
        Product p = view.getProduct();
        if (productService.add(p) != null)
            System.out.println("Thêm thành công");
        else
            System.out.println("Thêm thất bại");
        start();
    }

    private void updateProductEvent(){};

    private void deleteProductEvent(){};
}
