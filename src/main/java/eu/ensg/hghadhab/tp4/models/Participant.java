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
 * @author formation
 */
@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_pers", nullable = false)
    private Long num_pers;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_naiss", nullable = false)
    private String date_naiss;

    @Column(name = "organisation", nullable = false)
    private String organisation;

    @Column(name = "observations", nullable = false)
    private String observations;

    @ManyToOne
    @JoinColumn(name = "num_even", nullable = false)
    private Evenement event;

    // ------ Constructeurs -------------- //

    public Participant() {
    }

    public Participant(String nom, String prenom,
                       String email, String date_naiss, String organisation, String observations, Evenement event) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date_naiss = date_naiss;
        this.organisation = organisation;
        this.observations = observations;
        this.event = event;
    }

    // ---- To String -------------- //

    @Override
    public String toString() {
        return "Participant{" + "num_pers=" + num_pers + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", date_naiss=" + date_naiss + ", organisation=" + organisation + ", observations=" + observations + '}';
    }


    // ------ Getters -------------- //

    public Long getNum_pers() {
        return num_pers;
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

    public String getDate_naiss() {
        return date_naiss;
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

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
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

