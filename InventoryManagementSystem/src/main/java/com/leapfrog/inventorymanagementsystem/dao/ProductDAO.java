/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao;

import com.leapfrog.inventorymanagementsystem.entity.Product;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HYOJU
 */
public interface ProductDAO {
    int insert (Product p) throws SQLException, ClassNotFoundException;
    List<Product> getALL(boolean inStock)throws SQLException, ClassNotFoundException;
    Product getById(int id)throws SQLException,ClassNotFoundException;
    int update(Product p)throws SQLException,ClassNotFoundException;
    int delete(int id) throws SQLException,ClassNotFoundException;
    
}
