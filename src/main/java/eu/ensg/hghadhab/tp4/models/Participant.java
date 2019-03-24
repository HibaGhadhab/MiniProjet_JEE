/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Hiba GHADHAB
 */
@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numPers", nullable = false)
    private Long numPers;

    @Column(name = "nom", nullable = true)
    private String nom;

    @Column(name = "prenom", nullable = true)
    private String prenom;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "dateNaiss", nullable = true)
    private String dateNaiss;

    @Column(name = "organisation", nullable = true)
    private String organisation;

    @Column(name = "observations", nullable = true)
    private String observations;

    @ManyToOne
    @JoinColumn(name = "numEvent", nullable = true)
    private Evenement event;

    // ------ Constructeurs -------------- //

    public Participant() {
    }

    public Participant(String nom, String prenom,
                       String email, String dateNaiss, String organisation, String observations, Evenement event) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaiss = dateNaiss;
        this.organisation = organisation;
        this.observations = observations;
        this.event = event;
    }

    // ---- To String -------------- //

    @Override
    public String toString() {
        return "Participant{" + "numPers=" + numPers + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", dateNaiss=" + dateNaiss + ", organisation=" + organisation + ", observations=" + observations + '}';
    }


    // ------ Getters -------------- //

    public Long getNumPers() {
        return numPers;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getObservations() {
        return observations;
    }

    public Evenement getEvent() {
        return event;
    }

    // ------ Setters -------------- //

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public void setEvent(Evenement event) {
        this.event = event;
    }

}

