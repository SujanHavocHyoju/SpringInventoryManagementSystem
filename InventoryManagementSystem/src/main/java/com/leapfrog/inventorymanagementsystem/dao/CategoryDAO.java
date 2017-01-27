/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao;

import com.leapfrog.inventorymanagementsystem.entity.Category;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HYOJU
 */
public interface CategoryDAO {
    int insert (Category c) throws SQLException, ClassNotFoundException;
    List<Category> getALL()throws SQLException, ClassNotFoundException;
    Category getById(int id)throws SQLException,ClassNotFoundException;
    int update(Category c)throws SQLException,ClassNotFoundException;
    int delete(int id) throws SQLException,ClassNotFoundException;
    
}
