/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao;

import com.leapfrog.inventorymanagementsystem.entity.Purchase;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HYOJU
 */
public interface PurchaseDAO {
    int insert (Purchase p) throws SQLException, ClassNotFoundException;
    List<Purchase> getALL(boolean inPaid)throws SQLException, ClassNotFoundException;
    Purchase getById(int id)throws SQLException,ClassNotFoundException;
    int update(Purchase p)throws SQLException,ClassNotFoundException;
    int delete(int id) throws SQLException,ClassNotFoundException;
    
}
