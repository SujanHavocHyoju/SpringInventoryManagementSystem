/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao;

import com.leapfrog.inventorymanagementsystem.entity.Sales;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HYOJU
 */
public interface SalesDAO {
    int insert (Sales s) throws SQLException, ClassNotFoundException;
    List<Sales> getALL(boolean status)throws SQLException, ClassNotFoundException;
    Sales getById(int id)throws SQLException,ClassNotFoundException;
    int update(Sales s)throws SQLException,ClassNotFoundException;
    int delete(int id) throws SQLException,ClassNotFoundException;
    
}
