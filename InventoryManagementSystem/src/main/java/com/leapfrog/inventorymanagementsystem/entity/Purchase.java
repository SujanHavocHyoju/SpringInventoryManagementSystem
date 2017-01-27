/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author HYOJU
 */
public class Purchase {
    private int id;
    private String productName;
    private int costPrice;
    private BigDecimal discount;
    private int quantity, totalCost;
    private int supplierId;
    private Date purchaseDate;
    private String paymentMethod;
    private boolean status;

    public Purchase() {
    }

    public Purchase(int id, String productName, int costPrice, BigDecimal discount, int quantity, int totalCost, int supplierId, Date purchaseDate, String paymentMethod, boolean status) {
        this.id = id;
        this.productName = productName;
        this.costPrice = costPrice;
        this.discount = discount;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.supplierId = supplierId;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
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

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", productName=" + productName + ", costPrice=" + costPrice + ", discount=" + discount + ", quantity=" + quantity + ", totalCost=" + totalCost + ", supplierId=" + supplierId + ", purchaseDate=" + purchaseDate + ", paymentMethod=" + paymentMethod + ", status=" + status + '}';
    }
    
    
}
