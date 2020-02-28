/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author stag
 */
public class Pilote {

    // mes attributs
    private Integer id;
    private String nom;
    private String prenom;

    // mes construteurs
    public Pilote(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Pilote(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

// mes getteurs
    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    // mes setteurs

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Pilote{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

}
