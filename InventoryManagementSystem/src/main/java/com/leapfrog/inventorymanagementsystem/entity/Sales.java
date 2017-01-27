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
public class Sales {
    private int id, productId, sellingPrice, quantity;
    private BigDecimal discount;
    private int totalCost;
    private Date salesDate;
    private String paymentMethod;
    private boolean status;

    public Sales() {
    }

    public Sales(int id, int productId, int sellingPrice, int quantity, BigDecimal discount, int totalCost, Date salesDate, String paymentMethod, boolean status) {
        this.id = id;
        this.productId = productId;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.totalCost = totalCost;
        this.salesDate = salesDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
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
        return "Sales{" + "id=" + id + ", productId=" + productId + ", sellingPrice=" + sellingPrice + ", quantity=" + quantity + ", discount=" + discount + ", totalCost=" + totalCost + ", salesDate=" + salesDate + ", paymentMethod=" + paymentMethod + ", status=" + status + '}';
    }
    
    
    
}
