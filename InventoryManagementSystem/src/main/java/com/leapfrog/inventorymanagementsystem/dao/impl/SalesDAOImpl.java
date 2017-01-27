/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao.impl;

import com.leapfrog.inventorymanagementsystem.dao.SalesDAO;
import com.leapfrog.inventorymanagementsystem.entity.Sales;
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
@Repository(value = "salesDAO")
public class SalesDAOImpl implements SalesDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public int insert(Sales s) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO tbl_sales(product_id,selling_price,quantity,discount,total_cost,payment_method,status) VALUES(?,?,?,?,?,?,?) ";
        return jdbcTemplate.update(sql, new Object[]{
            s.getProductId(),
            s.getSellingPrice(),
            s.getQuantity(),
            s.getDiscount(),
            s.getTotalCost(),
            s.getPaymentMethod(),
            s.isStatus()
            
        });
        
    }

    @Override
    public List<Sales> getALL(boolean status) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_sales WHERE 1=1";
        
        if (status) {
            sql += " AND status=1 ";
        }
        return jdbcTemplate.query(sql, new RowMapper<Sales>() {

            @Override
            public Sales mapRow(ResultSet rs, int i) throws SQLException {
                Sales s = new Sales();
                s.setId(rs.getInt("sales_id"));
                s.setProductId(rs.getInt("product_id"));
                s.setSellingPrice(rs.getInt("selling_price"));
                s.setQuantity(rs.getInt("quantity"));
                s.setDiscount(rs.getBigDecimal("discount"));
                s.setTotalCost(rs.getInt("total_cost"));
                s.setSalesDate(rs.getDate("sales_date"));
                s.setPaymentMethod(rs.getString("payment_method"));
                s.setStatus(rs.getBoolean("status"));

                return s;
            }
        });
    }

    @Override
    public Sales getById(int id) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_sales WHERE sales_id =?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new RowMapper<Sales>() {

            @Override
            public Sales mapRow(ResultSet rs, int i) throws SQLException {
                Sales s = new Sales();
                s.setId(rs.getInt("sales_id"));
                s.setProductId(rs.getInt("product_id"));
                s.setSellingPrice(rs.getInt("selling_price"));
                s.setQuantity(rs.getInt("quantity"));
                s.setDiscount(rs.getBigDecimal("discount"));
                s.setTotalCost(rs.getInt("total_cost"));
                s.setSalesDate(rs.getDate("sales_date"));
                s.setPaymentMethod(rs.getString("payment_method"));
                s.setStatus(rs.getBoolean("status"));
                return s;
            }
        });
    }

    @Override
    public int update(Sales s) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbl_sales SET product_id=?,selling_price=?,quantity=?,discount=?,total_cost=?,payment_method=?,status=? WHERE sales_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            s.getProductId(),
            s.getSellingPrice(),
            s.getQuantity(),
            s.getDiscount(),
            s.getTotalCost(),
            s.getPaymentMethod(),
            s.isStatus(),
            s.getId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tbl_sales WHERE sales_id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }
}
    
