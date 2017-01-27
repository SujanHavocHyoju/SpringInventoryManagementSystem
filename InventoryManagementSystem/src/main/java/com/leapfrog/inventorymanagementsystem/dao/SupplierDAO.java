/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao;

import com.leapfrog.inventorymanagementsystem.entity.Supplier;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HYOJU
 */
public interface SupplierDAO {
    int insert (Supplier s) throws SQLException, ClassNotFoundException;
    List<Supplier> getALL()throws SQLException, ClassNotFoundException;
    Supplier getById(int id)throws SQLException,ClassNotFoundException;
    int update(Supplier s)throws SQLException,ClassNotFoundException;
    int delete(int id) throws SQLException,ClassNotFoundException;
    
}
