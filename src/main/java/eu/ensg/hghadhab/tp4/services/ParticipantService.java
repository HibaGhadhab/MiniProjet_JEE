/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.services;

import eu.ensg.hghadhab.tp4.models.Participant;
import eu.ensg.hghadhab.tp4.repositories.ParticipantRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Hiba GHADHAB
 */
@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepo repository;

    public List<Participant> findAll() {

        List<Participant> participants = (List<Participant>) repository.findAll();

        return participants;
    }

    public void save(Participant participant) {

        repository.save(participant);
    }

    public void deleteById(Long id){

        repository.deleteById(id);
    }

}