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
        private int before_update;
    
    //alt + insert
    public Memo() {
    }

    public Memo(int id, String contenu, Date dateCreation, User createur, int before_update) {
        this.id = id;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.createur = createur;
        this.before_update = before_update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public User getCreateur() {
        return createur;
    }

    public void setCreateur(User createur) {
        this.createur = createur;
    }

    public int getBefore_update() {
        return before_update;
    }

    public void setBefore_update(int before_update) {
        this.before_update = before_update;
    }      

    
}
