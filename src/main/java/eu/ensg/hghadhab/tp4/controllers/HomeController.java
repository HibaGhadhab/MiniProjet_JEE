/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Hiba GHADHAB
 */
@Controller
public class HomeController {

    @GetMapping("/login")
    public String authentification() {
        return "login";
    }

    @GetMapping("/logout")
    public String login() {
        return "login";
    }

}