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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hiba GHADHAB
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
    public String saveParticipant(@Valid Participant participant, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addParticipant";
        }
        participantService.save(participant);
        return getAllParticipant(model);
    }

    @PostMapping("/editParticipant/{id}")
    public String editParticipant(@PathVariable("id") long id, Model model) {
        Participant participant = participantService.findById(id);
        //participant.setDateNaiss();
//        participantService.save(participant);
//        model.addAttribute("participants", participantService.findAll());
        return getAllParticipant(model);
    }

    @PostMapping("/saveEditedParticipant")
    public String saveEditedParticipant(@Valid Participant participant, BindingResult result, Model model){
        if (result.hasErrors()){
            return getAllParticipant(model);
        }
        participantService.save(participant);
        return getAllParticipant(model);
    }

    @GetMapping("/deleteParticipant/{id}")
    public String deleteParticipant(@PathVariable("id") long id, Model model){
        participantService.deleteById(id);
        return getAllParticipant(model);
    }

    @PostMapping("/login")
    public String authentification(@Valid Participant participant, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "login";
//        }
        return "welcomePage";
    }

}
