/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensg.hghadhab.tp4.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author formation
 */
@Entity
@Table(name = "evenement")
public class Evenement {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "num_even", nullable = false)
    private Long num_even;

    @Column(name = "intitule", nullable = false)
    private String intitule;

    @Column(name = "theme")
    private String theme;

    @Column(name = "date_debut")
    private String date_debut;

    @Column(name = "duree")
    private String duree;

    @Column(name = "nbr_part_max")
    private int nbr_part_max;

    @Column(name = "description")
    private String description;

    @Column(name = "organisateur")
    private String organisateur;

    @Column(name = "type_even")
    private String type_even;

    @OneToMany(mappedBy = "event")
    private List<Participant> participants = new ArrayList<Participant>();

    // ------ Constructeur -------------- //

    public Evenement() {
    }

    public Evenement(String intitule, String theme, String date_debut, String duree, int nbr_part_max, String description, String organisateur, String type_even) {
        this.intitule = intitule;
        this.theme = theme;
        this.date_debut = date_debut;
        this.duree = duree;
        this.nbr_part_max = nbr_part_max;
        this.description = description;
        this.organisateur = organisateur;
        this.type_even = type_even;
    }

    // ---- To String -------------- //
    @Override
    public String toString() {
        return "Evenement{" + "num_even=" + num_even + ", intitule=" + intitule + ", theme=" + theme + ", date_debut=" + date_debut + ", duree=" + duree + ", nbr_part_max=" + nbr_part_max + ", description=" + description + ", organisateur=" + organisateur + ", type_even=" + type_even + '}';
    }

    // ------ Getters -------------- //

    public Long getNum_even() {
        return num_even;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getTheme() {
        return theme;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public String getDuree() {
        return duree;
    }

    public int getNbr_part_max() {
        return nbr_part_max;
    }

    public String getDescription() {
        return description;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public String getType_even() {
        return type_even;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    // ------ Setters -------------- //

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setNbr_part_max(int nbr_part_max) {
        this.nbr_part_max = nbr_part_max;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public void setType_even(String type_even) {
        this.type_even = type_even;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

}
