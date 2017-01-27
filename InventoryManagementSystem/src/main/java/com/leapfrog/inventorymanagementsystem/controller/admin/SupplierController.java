/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.admin;

import com.leapfrog.inventorymanagementsystem.dao.SupplierDAO;
import com.leapfrog.inventorymanagementsystem.entity.Supplier;
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
@RequestMapping(value = "/admin/supplier")
public class SupplierController {
    
    @Autowired
    private SupplierDAO supplierDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String admin(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("supplier", supplierDAO.getALL());
        return "/admin/supplier/index";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("supplier", new Supplier());
        return "/admin/supplier/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(Supplier s) throws ClassNotFoundException, SQLException {
        String retVal = "admin/supplier?error";
        if (supplierDAO.insert(s) > 0) {
            retVal = "admin/supplier?success";
        }
        return "redirect:/" + retVal;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) throws ClassNotFoundException, SQLException {
        Supplier supplier = supplierDAO.getById(id);
        if (supplier == null) {
            return "redirect:/admin/supplier";
        }
        model.addAttribute("supplier", supplier);
        return "admin/supplier/edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPost(Supplier s) throws SQLException, ClassNotFoundException {
        if (supplierDAO.update(s) > 0) {
            return "redirect:/admin/supplier?success";
        }
        return "redirect:/admin/supplier?error";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id, Supplier supplier) throws ClassNotFoundException, SQLException {
        if(supplierDAO.delete(id)>0)
        {
            return "redirect:/admin/supplier?deleteSuccess";
        }
        return "redirect:/admin/supplier?deleteError";
    }
   
}
