/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao.impl;

import com.leapfrog.inventorymanagementsystem.dao.SupplierDAO;
import com.leapfrog.inventorymanagementsystem.entity.Supplier;
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
@Repository(value = "supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public int insert(Supplier s) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO tbl_supplier(supplier_name,address,contact,email,status) VALUES(?,?,?,?,?) ";
        return jdbcTemplate.update(sql, new Object[]{
            s.getSupplierName(),
            s.getAddress(),
            s.getContact(),
            s.getEmail(),
            s.getStatus()
            
        });
        
    }

    @Override
    public List<Supplier> getALL() throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_supplier";
        
        return jdbcTemplate.query(sql, new RowMapper<Supplier>() {

            @Override
            public Supplier mapRow(ResultSet rs, int i) throws SQLException {
                Supplier s = new Supplier();
                s.setId(rs.getInt("supplier_id"));
                s.setSupplierName(rs.getString("supplier_name"));
                s.setAddress(rs.getString("address"));
                s.setContact(rs.getString("contact"));
                s.setEmail(rs.getString("email"));
                s.setAddedDate(rs.getDate("added_date"));
                s.setStatus(rs.getBoolean("status"));

                return s;
            }
        });
    }

    @Override
    public Supplier getById(int id) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_supplier WHERE supplier_id =?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new RowMapper<Supplier>() {

            @Override
            public Supplier mapRow(ResultSet rs, int i) throws SQLException {
                Supplier s = new Supplier();
                s.setId(rs.getInt("supplier_id"));
                s.setSupplierName(rs.getString("supplier_name"));
                s.setAddress(rs.getString("address"));
                s.setContact(rs.getString("contact"));
                s.setEmail(rs.getString("email"));
                s.setAddedDate(rs.getDate("added_date"));
                s.setStatus(rs.getBoolean("status"));
                return s;
            }
        });
    }

    @Override
    public int update(Supplier s) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbl_supplier SET supplier_name=?,address=?,contact=?,email=?,status=? WHERE supplier_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            s.getSupplierName(),
            s.getAddress(),
            s.getContact(),
            s.getEmail(),
            s.getStatus(),
            s.getId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tbl_supplier WHERE supplier_id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }
}
    
