/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller.admin;

import com.leapfrog.inventorymanagementsystem.dao.ProductDAO;
import com.leapfrog.inventorymanagementsystem.entity.Product;
import java.sql.SQLException;
import java.util.Properties;
import java.util.function.Supplier;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
@RequestMapping(value = "/admin/product")
public class ProductController {
    
    @Autowired
    private ProductDAO productDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String admin(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("products", productDAO.getALL(false));
        return "/admin/product/index";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("product", new Product());
        return "/admin/product/add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(Product p) throws ClassNotFoundException, SQLException {
        String retVal = "admin/product?error";
        if (productDAO.insert(p) > 0) {
            retVal = "admin/product?success";
        }
        return "redirect:/" + retVal;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) throws ClassNotFoundException, SQLException {
        Product product = productDAO.getById(id);
        if (product == null) {
            return "redirect:/admin/product";
        }
        model.addAttribute("product", product);
        return "admin/product/edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPost(Product p) throws SQLException, ClassNotFoundException {
        if (productDAO.update(p) > 0) {
            return "redirect:/admin/product?success";
        }
        return "redirect:/admin/product?error";
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id, Product product) throws ClassNotFoundException, SQLException {
        if(productDAO.delete(id)>0)
        {
            return "redirect:/admin/product?deleteSuccess";
        }
        return "redirect:/admin/product?deleteError";
    }
    
    /*
    @RequestMapping(value = "/reorder/{id}", method = RequestMethod.GET)
    public String reorder(@PathVariable("id") int id, Product product) throws ClassNotFoundException, SQLException {
        
        if(productDAO.delete(id)>0)
        {
            return "redirect:/admin/reorder?deleteSuccess";
        }
        return "redirect:/admin/reorder?deleteError";
    }
    
    private void sendMail(Supplier s) {
        // Recipient's email ID needs to be mentioned.
        String to = s.getEmail();

        // Sender's email ID needs to be mentioned
        String from = "sujanhyoju@gmail.com";

        // Assuming you are sending email from localhost
        String host = "smtp.wlink.com.np";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        // Set response content type
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("Re-Order Request");
            // Now set the actual message
            message.setText("Dear " + u.getSupplierName() + "\tWe would like to place an Order for the Following:" + "The Products are:" + s.getProductName+ s.getQuantity+"\tPlease Respond or Contact us regarding these procurements");
            // Send message
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }*/
}
