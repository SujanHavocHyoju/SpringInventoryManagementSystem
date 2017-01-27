/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author HYOJU
 */
public class Product {
    
    private int id;
    private String productName;
    private int costPrice, sellingPrice;
    private BigDecimal discount;
    private int quantity;
    private String categoryName;
    private int supplierId;
    private Date addedDate, modifiedDate;
    private boolean status;

    public Product() {
    }

    public Product(int id, String productName, int costPrice, int sellingPrice, BigDecimal discount, int quantity, String categoryName, int supplierId, Date addedDate, Date modifiedDate, boolean status) {
        this.id = id;
        this.productName = productName;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.discount = discount;
        this.quantity = quantity;
        this.categoryName = categoryName;
        this.supplierId = supplierId;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String catagoryName) {
        this.categoryName = catagoryName;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", productName=" + productName + ", costPrice=" + costPrice + ", sellingPrice=" + sellingPrice + ", discount=" + discount + ", quantity=" + quantity + ", categoryName=" + categoryName + ", supplierId=" + supplierId + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", status=" + status + '}';
    }
    
    
    
}
