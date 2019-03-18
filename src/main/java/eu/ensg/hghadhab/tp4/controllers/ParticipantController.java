/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.controllers;

import eu.ensg.hghadhab.tp4.models.Participant;
import eu.ensg.hghadhab.tp4.services.ParticipantService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author formation
 */
@Controller
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @GetMapping("/participant")
    public String getAllParticipant(Model model) {
        List<Participant> participants = (List<Participant>) participantService.findAll();
        model.addAttribute("participants", participants);
        return "showParticipant";
    }
}
