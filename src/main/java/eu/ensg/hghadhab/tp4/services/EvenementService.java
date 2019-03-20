/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.services;

import eu.ensg.hghadhab.tp4.models.Evenement;
import eu.ensg.hghadhab.tp4.repositories.EvenementRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hiba GHADHAB
 */
@Service
public class EvenementService {

    @Autowired
    private EvenementRepo repository;

    public List<Evenement> findAll() {

        List<Evenement> evenements = (List<Evenement>) repository.findAll();
        return evenements;
    }

    public void save(Evenement evenement) {

        repository.save(evenement);
    }

    public void deleteById(Long id){

        repository.deleteById(id);
    }

}
