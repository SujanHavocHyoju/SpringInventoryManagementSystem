/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.admin;

import com.leapfrog.inventorymanagementsystem.dao.CategoryDAO;
import com.leapfrog.inventorymanagementsystem.entity.Category;
import java.sql.SQLException;
import java.util.Properties;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author HYOJU
 */
@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {
    
    @Autowired
    private CategoryDAO categoryDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String admin(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("category", categoryDAO.getALL());
        return "/admin/category/index";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("category", new Category());
        return "/admin/category/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(Category c) throws ClassNotFoundException, SQLException {
        String retVal = "admin/category?error";
        if (categoryDAO.insert(c) > 0) {
            retVal = "admin/category?success";
        }
        return "redirect:/" + retVal;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) throws ClassNotFoundException, SQLException {
        Category category = categoryDAO.getById(id);
        if (category == null) {
            return "redirect:/admin/category";
        }
        model.addAttribute("category", category);
        return "admin/category/edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPost(Category c) throws SQLException, ClassNotFoundException {
        if (categoryDAO.update(c) > 0) {
            return "redirect:/admin/category?success";
        }
        return "redirect:/admin/category?error";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id, Category category) throws ClassNotFoundException, SQLException {
        if(categoryDAO.delete(id)>0)
        {
            return "redirect:/admin/category?deleteSuccess";
        }
        return "redirect:/admin/category?deleteError";
    }
   
}
