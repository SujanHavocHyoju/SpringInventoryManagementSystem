/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.entity;

import java.util.Date;

/**
 *
 * @author HYOJU
 */
public class Supplier {
    private int id;
    private String supplierName, address, contact, email;
    private Date addedDate;
    private Date modifiedDate;
    private boolean status;

    public Supplier() {
    }

    public Supplier(int id, String supplierName, String address, String contact, String email, Date addedDate, Date modifiedDate, boolean status) {
        this.id = id;
        this.supplierName = supplierName;
        this.address = address;
        this.contact = contact;
        this.email = email;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", supplierName=" + supplierName + ", address=" + address + ", contact=" + contact + ", email=" + email + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", status=" + status + '}';
    }
    
    
    
}
