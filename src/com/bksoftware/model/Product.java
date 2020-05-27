package com.bksoftware.model;


public class Product {
    private int id;
    private String ten;
    private String nsx;
    private double giaNhap;
    private double giaBan;

    public Product(int id, String ten, String nsx, double giaNhap, double giaBan) {
        this.id = id;
        this.ten = ten;
        this.nsx = nsx;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public Product(){

    }

    public Product(String data){
        String[] fields = data.split("\\|");
        this.id = Integer.parseInt(fields[0]);
        this.ten = fields[1];
        this.nsx = fields[2];
        this.giaNhap = Double.parseDouble(fields[3]);
        this.giaBan = Double.parseDouble(fields[4]);
    }

    public String toData(){
        return this.id + "|" + this.ten + "|" + this.nsx + "|" + this.giaNhap + "|" + this.giaBan;
    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getTen() {
        return ten;
    }

    public Product setTen(String ten) {
        this.ten = ten;
        return this;
    }

    public String getNsx() {
        return nsx;
    }

    public Product setNsx(String nsx) {
        this.nsx = nsx;
        return this;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public Product setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
        return this;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public Product setGiaBan(double giaBan) {
        this.giaBan = giaBan;
        return this;
    }
}
