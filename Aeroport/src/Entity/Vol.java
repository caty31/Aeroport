/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author stag
 */
public class Vol {

    // les attributs de ma classe
    private Integer id;
    private String depart;
    private String arrivee;
    private Integer id_avion;
    private Integer id_pilote;
    private Date jdep;
    private Date hdep;
    private Date jarr;
    private Date harr;

    // mes constructeurs
    public Vol(String depart, String arrivee, Integer id_avion, Integer id_pilote) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.id_avion = id_avion;
        this.id_pilote = id_pilote;
    }

    public Vol(Integer id, Date jdep, Date hdep, Date jarr, Date harr) {
        this.id = id;
        this.jdep = jdep;
        this.hdep = hdep;
        this.jarr = jarr;
        this.harr = harr;
    }

    public Vol(Integer id, String depart, String arrivee, Integer id_avion, Integer id_pilote, Date jdep, Date hdep, Date jarr, Date harr) {
        this.id = id;
        this.depart = depart;
        this.arrivee = arrivee;
        this.id_avion = id_avion;
        this.id_pilote = id_pilote;
        this.jdep = jdep;
        this.hdep = hdep;
        this.jarr = jarr;
        this.harr = harr;
    }

    // ma methode tostring
    @Override
    public String toString() {
        return "Vol{" + "id=" + id + ", depart=" + depart + ", arrivee=" + arrivee + ", id_avion=" + id_avion + ", id_pilote=" + id_pilote + ", jdep=" + jdep + ", hdep=" + hdep + ", jarr=" + jarr + ", harr=" + harr + '}';
    }

    // mes getteurs
    public Integer getId() {
        return id;
    }

    public String getDepart() {
        return depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public Integer getId_avion() {
        return id_avion;
    }

    public Integer getId_pilote() {
        return id_pilote;
    }

    public Date getJdep() {
        return jdep;
    }

    public Date getHdep() {
        return hdep;
    }

    public Date getJarr() {
        return jarr;
    }

    public Date getHarr() {
        return harr;
    }
    // mes setteurs

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public void setId_avion(Integer id_avion) {
        this.id_avion = id_avion;
    }

    public void setId_pilote(Integer id_pilote) {
        this.id_pilote = id_pilote;
    }

    public void setJdep(Date jdep) {
        this.jdep = jdep;
    }

    public void setHdep(Date hdep) {
        this.hdep = hdep;
    }

    public void setJarr(Date jarr) {
        this.jarr = jarr;
    }

    public void setHarr(Date harr) {
        this.harr = harr;
    }

}
