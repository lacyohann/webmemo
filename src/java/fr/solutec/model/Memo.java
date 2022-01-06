/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author dsi
 */
public class Memo {
        private int id;
        private String contenu;
        private Date dateCreation;
        private User createur;
        private Boolean prive; 
    
    //alt + insert
    public Memo() {
    }

    public Memo(int id, String contenu, Date dateCreation, User createur, Boolean prive) {
        this.id = id;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.createur = createur;
        this.prive = prive;
    }


    public int getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public User getCreateur() {
        return createur;
    }
    
    public Boolean getPrive() {
        return prive;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setPrive(Boolean prive) {
        this.prive = prive;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setCreateur(User createur) {
        this.createur = createur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
        
    
}
