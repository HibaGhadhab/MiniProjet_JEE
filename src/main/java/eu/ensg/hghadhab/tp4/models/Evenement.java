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
 * @author Hiba GHADHAB
 */
@Entity
@Table(name = "evenement")
public class Evenement {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "numEven", nullable = false)
    private Long numEven;

    @Column(name = "intitule", nullable = false)
    private String intitule;

    @Column(name = "theme")
    private String theme;

    @Column(name = "dateDebut")
    private String dateDebut;

    @Column(name = "duree")
    private String duree;

    @Column(name = "nbrPartMax")
    private int nbrPartMax;

    @Column(name = "description")
    private String description;

    @Column(name = "organisateur")
    private String organisateur;

    @Column(name = "typeEvent")
    private String typeEvent;

    @OneToMany(mappedBy = "event")
    private List<Participant> participants = new ArrayList<Participant>();

    // ------ Constructeur -------------- //

    public Evenement() {
    }

    public Evenement(String intitule, String theme, String dateDebut, String duree, int nbrPartMax, String description, String organisateur, String typeEvent) {
        this.intitule = intitule;
        this.theme = theme;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.nbrPartMax = nbrPartMax;
        this.description = description;
        this.organisateur = organisateur;
        this.typeEvent = typeEvent;
    }

    // ---- To String -------------- //
    @Override
    public String toString() {
        return "Evenement{" + "numEven=" + numEven + ", intitule=" + intitule + ", theme=" + theme + ", dateDebut=" + dateDebut + ", duree=" + duree + ", nbrPartMax=" + nbrPartMax + ", description=" + description + ", organisateur=" + organisateur + ", typeEvent=" + typeEvent + '}';
    }

    // ------ Getters -------------- //

        public Long getnumEven() {
        return numEven;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getTheme() {
        return theme;
    }

    public String getdateDebut() {
        return dateDebut;
    }

    public String getDuree() {
        return duree;
    }

    public int getnbrPartMax() {
        return nbrPartMax;
    }

    public String getDescription() {
        return description;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public String gettypeEvent() {
        return typeEvent;
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

    public void setdateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setnbrPartMax(int nbrPartMax) {
        this.nbrPartMax = nbrPartMax;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public void settypeEvent(String typeEvent) {
        this.typeEvent = typeEvent;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

}
