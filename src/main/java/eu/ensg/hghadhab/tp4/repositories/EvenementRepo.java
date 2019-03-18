/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.repositories;

import eu.ensg.hghadhab.tp4.models.Evenement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author formation
 */
@Repository
public interface EvenementRepo extends CrudRepository<Evenement, Long> {

}
