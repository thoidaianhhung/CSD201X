package com.company;

public class Product {
    private String productCode;
    private String title;
    private double price;
    private Integer quantity;

    public Product(String productCode, String title, double price, Integer quantity) {
        this.setProductCode(productCode);
        this.setTitle(title);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%-20s|%-20s|%-20f|%-20d", getProductCode(), getTitle(), getPrice(), getQuantity());
    }
}
