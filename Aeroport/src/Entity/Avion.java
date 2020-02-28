/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.ResultSet;

/**
 *
 * @author stag
 */
public class Avion {

    // MES ATTRIBUTS
    private Integer id;
    private String type;
    private int capacite;

    // Mes constructeurs
    public Avion(String type, int capacite) {
        this.type = type;
        this.capacite = capacite;
    }

    public Avion(Integer id, String type, int capacite) {
        this.id = id;
        this.type = type;
        this.capacite = capacite;
    }

    // mes getteurs
    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getCapacite() {
        return capacite;
    }
    // mes setteurs

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Avion{" + "id=" + id + ", type=" + type + ", capacite=" + capacite + '}';
    }

}
