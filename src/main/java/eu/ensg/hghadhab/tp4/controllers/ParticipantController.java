/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.controllers;

import eu.ensg.hghadhab.tp4.models.Evenement;
import eu.ensg.hghadhab.tp4.models.Participant;
import eu.ensg.hghadhab.tp4.services.EvenementService;
import eu.ensg.hghadhab.tp4.services.ParticipantService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author formation
 */
@Controller
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @Autowired
    EvenementService evenementService;

    @GetMapping("/participant")
    public String getAllParticipant(Model model) {
        List<Participant> participants = (List<Participant>) participantService.findAll();
        model.addAttribute("participants", participants);
        return "showParticipant";
    }

    @GetMapping("/addParticipant")
    public String addParticipant(Model model) {
        Participant participant = new Participant();
        model.addAttribute("participant", participant);

        //for the select in the form
        List<Evenement> evenements = (List<Evenement>) evenementService.findAll();
        model.addAttribute("evenements", evenements);

        return "addParticipant";
    }

    @PostMapping("/saveParticipant")
    public String saveEvenement(@Valid Participant participant, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addParticipant";
        }
        participantService.save(participant);
        return getAllParticipant(model);
    }




}
