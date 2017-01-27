/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystem.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HYOJU
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("title", "Please Login");
        return mv;
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
