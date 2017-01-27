/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.admin;

import com.leapfrog.inventorymanagementsystem.dao.SalesDAO;
import com.leapfrog.inventorymanagementsystem.entity.Sales;
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
@RequestMapping(value = "/admin/sales")
public class SalesController {
    
    @Autowired
    private SalesDAO salesDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String admin(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("sales", salesDAO.getALL(false));
        return "/admin/sales/index";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("sales", new Sales());
        return "/admin/sales/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(Sales s) throws ClassNotFoundException, SQLException {
        String retVal = "admin/sales?error";
        if (salesDAO.insert(s) > 0) {
            retVal = "admin/sales?success";
        }
        return "redirect:/" + retVal;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) throws ClassNotFoundException, SQLException {
        Sales sales = salesDAO.getById(id);
        if (sales == null) {
            return "redirect:/admin/sales";
        }
        model.addAttribute("sales", sales);
        return "admin/sales/edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPost(Sales s) throws SQLException, ClassNotFoundException {
        if (salesDAO.update(s) > 0) {
            return "redirect:/admin/sales?success";
        }
        return "redirect:/admin/sales?error";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id, Sales sales) throws ClassNotFoundException, SQLException {
        if(salesDAO.delete(id)>0)
        {
            return "redirect:/admin/sales?deleteSuccess";
        }
        return "redirect:/admin/sales?deleteError";
    }
   
}
