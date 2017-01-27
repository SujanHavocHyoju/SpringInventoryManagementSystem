/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.dao.impl;

import com.leapfrog.inventorymanagementsystem.dao.CategoryDAO;
import com.leapfrog.inventorymanagementsystem.entity.Category;
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
@Repository(value = "categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public int insert(Category c) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO tbl_category(category_name) VALUES(?) ";
        return jdbcTemplate.update(sql, new Object[]{
            c.getCategoryName()
            
        });
        
    }

    @Override
    public List<Category> getALL() throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_category";
        
        return jdbcTemplate.query(sql, new RowMapper<Category>() {

            @Override
            public Category mapRow(ResultSet rs, int i) throws SQLException {
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                c.setCategoryName(rs.getString("category_name"));
                
                return c;
            }
        });
    }

    @Override
    public Category getById(int id) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_category WHERE category_id =?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new RowMapper<Category>() {

            @Override
            public Category mapRow(ResultSet rs, int i) throws SQLException {
                Category c = new Category();
                c.setId(rs.getInt("category_id"));
                c.setCategoryName(rs.getString("category_name"));
                
                return c;
            }
        });
    }

    @Override
    public int update(Category c) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbl_category SET category_name=? WHERE category_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            c.getCategoryName(),
            c.getId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tbl_category WHERE category_id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }
}
    
