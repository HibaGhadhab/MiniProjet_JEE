/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.controllers;

import eu.ensg.hghadhab.tp4.models.Evenement;
import eu.ensg.hghadhab.tp4.services.EvenementService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Hiba GHADHAB
 */
@Controller
public class EvenementController {

    @Autowired
    EvenementService evenementService;

    @GetMapping("/evenement")
    public String getAllEvents(Model model) {
        List<Evenement> evenements = (List<Evenement>) evenementService.findAll();
        model.addAttribute("evenements", evenements);
        return "showEvent";
    }

    @GetMapping("/addEvenement")
    public String addEvenement(Model model) {
        Evenement evenement = new Evenement();
        model.addAttribute("evenement", evenement);
        return "addEvent";
    }

    @PostMapping("/saveEvenement")
    public String saveEvenement(@Valid Evenement evenement, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addEvent";
        }
        evenementService.save(evenement);
        return getAllEvents(model);
    }

    @GetMapping("/deleteEvent/{id}")
    public String deleteEvent(@PathVariable("id") long id, Model model){
        evenementService.deleteById(id);
        return getAllEvents(model);
    }

}
