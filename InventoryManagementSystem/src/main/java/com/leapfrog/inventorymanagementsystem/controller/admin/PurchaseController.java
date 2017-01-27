/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.admin;

import com.leapfrog.inventorymanagementsystem.dao.PurchaseDAO;
import com.leapfrog.inventorymanagementsystem.entity.Purchase;
import java.sql.SQLException;
import java.util.Properties;
import java.util.function.Supplier;
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
@RequestMapping(value = "/admin/purchase")
public class PurchaseController {
    
    @Autowired
    private PurchaseDAO purchaseDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String admin(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("purchase", purchaseDAO.getALL(false));
        return "/admin/purchase/index";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("purchase", new Purchase());
        return "/admin/purchase/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(Purchase p) throws ClassNotFoundException, SQLException {
        String retVal = "admin/purchase?error";
        if (purchaseDAO.insert(p) > 0) {
            retVal = "admin/purchase?success";
        }
        return "redirect:/" + retVal;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) throws ClassNotFoundException, SQLException {
        Purchase purchase = purchaseDAO.getById(id);
        if (purchase == null) {
            return "redirect:/admin/purchase";
        }
        model.addAttribute("purchase", purchase);
        return "admin/purchase/edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPost(Purchase p) throws SQLException, ClassNotFoundException {
        if (purchaseDAO.update(p) > 0) {
            return "redirect:/admin/purchase?success";
        }
        return "redirect:/admin/purchase?error";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id, Purchase purchase) throws ClassNotFoundException, SQLException {
        if(purchaseDAO.delete(id)>0)
        {
            return "redirect:/admin/purchase?deleteSuccess";
        }
        return "redirect:/admin/purchase?deleteError";
    }
   
}
