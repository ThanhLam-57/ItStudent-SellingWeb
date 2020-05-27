package com.bksoftware.view;

import com.bksoftware.model.Product;

import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class ProductView {

    public void showAllProduct(List<Product> products) {
        System.out.println("-----------------------------");
        products.forEach(product -> {
            showProduct(product);
            System.out.println("-----------------------------");
        });
        showProductMenu();
    }

    public void showProduct(Product product) {
        System.out.println("| ID: " + product.getId());
        System.out.println("| Tên: " + product.getTen() + "  |  NSX: "+product.getNsx());
        System.out.println("| Giá nhập / Giá bán : " + product.getGiaNhap() + " / " + product.getGiaBan());
    }

    public void showMenu() {
        System.out.println("=========================");
        System.out.println("1. Danh sách sản phẩm");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("0. Thoát");
    }

    public void showProductMenu() {
        System.out.println("=========================");
        System.out.println("1. Sửa sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Sắp xếp");
        System.out.println("0. Quay lại");
    }

    public void showSortMenu() {
        System.out.println("=========================");
        System.out.println("1. Theo tên a -> z");
        System.out.println("2. Giá tăng dần");
        System.out.println("3. Giá giảm dần");
        System.out.println("0. Quay lại");
    }

    public Product getProduct() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        product.setTen(scanner.nextLine());
        System.out.println("Nhập nsx: ");
        product.setNsx(scanner.nextLine());
        System.out.println("Nhập giá nhập: ");
        product.setGiaNhap(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập giá bán: ");
        product.setGiaBan(Double.parseDouble(scanner.nextLine()));
        return product;
    }

    public void fixSuccess(){
        System.out.println("Chỉnh sửa thành công");
    }

    public void fixFail(){
        System.out.println("Chỉnh sửa thất bại");
    }

    public Product getProductToFix(){
        System.out.println("Nhập ID: ");
        int id = new Scanner(System.in).nextInt();
        Product p = getProduct();
        p.setId(id);
        return p;
    }

    public int getChoice() {
        System.out.println("===================>");
        System.out.println("Nhập lựa chọn: ");
        return new Scanner(System.in).nextInt();
    }

}
