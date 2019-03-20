/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.repositories;

import eu.ensg.hghadhab.tp4.models.Participant;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Hiba GHADHAB
 */
@Repository
public interface ParticipantRepo extends CrudRepository<Participant, Long> {

}
