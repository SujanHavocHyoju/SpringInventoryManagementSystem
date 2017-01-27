/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao.impl;

import com.leapfrog.inventorymanagementsystem.dao.PurchaseDAO;
import com.leapfrog.inventorymanagementsystem.dao.SalesDAO;
import com.leapfrog.inventorymanagementsystem.entity.Purchase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HYOJU
 */
@Repository(value = "purchaseDAO")
public class PurchaseDAOImpl implements PurchaseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public int insert(Purchase p) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO tbl_purchase(product_name,cost_price,discount,quantity,total_cost,supplier_id,payment_method,status) VALUES(?,?,?,?,?,?,?,?) ";
        return jdbcTemplate.update(sql, new Object[]{
            p.getProductName(),
            p.getCostPrice(),
            p.getDiscount(),
            p.getQuantity(),
            p.getTotalCost(),
            p.getSupplierId(),
            p.getPaymentMethod(),
            p.isStatus()
            
        });
        
    }

    @Override
    public List<Purchase> getALL(boolean status) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_purchase WHERE 1=1";
        
        if (status) {
            sql += " AND status=1 ";
        }
        return jdbcTemplate.query(sql, new RowMapper<Purchase>() {

            @Override
            public Purchase mapRow(ResultSet rs, int i) throws SQLException {
                Purchase p = new Purchase();
                p.setId(rs.getInt("purchase_id"));
                p.setProductName(rs.getString("product_name"));
                p.setCostPrice(rs.getInt("cost_price"));
                p.setDiscount(rs.getBigDecimal("discount"));
                p.setQuantity(rs.getInt("quantity"));
                p.setTotalCost(rs.getInt("total_cost"));
                p.setSupplierId(rs.getInt("supplier_id"));
                p.setPurchaseDate(rs.getDate("purchase_date"));
                p.setPaymentMethod(rs.getString("payment_method"));
                p.setStatus(rs.getBoolean("status"));

                return p;
            }
        });
    }

    @Override
    public Purchase getById(int id) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_purchase WHERE purchase_id =?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new RowMapper<Purchase>() {

            @Override
            public Purchase mapRow(ResultSet rs, int i) throws SQLException {
                Purchase p = new Purchase();
                p.setId(rs.getInt("purchase_id"));
                p.setProductName(rs.getString("product_name"));
                p.setCostPrice(rs.getInt("cost_price"));
                p.setDiscount(rs.getBigDecimal("discount"));
                p.setQuantity(rs.getInt("quantity"));
                p.setTotalCost(rs.getInt("total_cost"));
                p.setSupplierId(rs.getInt("supplier_id"));
                p.setPurchaseDate(rs.getDate("purchase_date"));
                p.setPaymentMethod(rs.getString("payment_method"));
                p.setStatus(rs.getBoolean("status"));

                return p;
            }
        });
    }

    @Override
    public int update(Purchase p) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbl_purchase SET product_name=?,cost_price=?,discount=?,quantity=?,total_cost=?,supplier_id=?,payment_method=?,status=? WHERE purchase_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            p.getProductName(),
            p.getCostPrice(),
            p.getDiscount(),
            p.getQuantity(),
            p.getTotalCost(),
            p.getSupplierId(),
            p.getPaymentMethod(),
            p.isStatus(),
            p.getId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tbl_purchase WHERE purchase_id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }
}
    
