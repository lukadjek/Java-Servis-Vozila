/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovneklase;

import java.util.Date;

/**
 *
 * @author lucca
 */
public class Vozila {
    
    private int ID;
    private String markaVozila;
    private String modelVozila;
    private String vreme;
    private Date datum;
    private Integer kilometraza;
    private String brojSasije;
    private String registarskaOznaka;
    private String redovneServisneUsluge;
    private String dodatneServisneUsluge;
    private String napomene;

    public Vozila() {
    }

    public Vozila(Integer ID, String markaVozila, String modelVozila, String vreme, Date datum, Integer kilometraza, String brojSasije, String registarskaOznaka, String redovneServisneUsluge, String dodatneServisneUsluge, String napomene) {
        this.ID = ID;
        this.markaVozila = markaVozila;
        this.modelVozila = modelVozila;
        this.vreme = vreme;
        this.datum = datum;
        this.kilometraza = kilometraza;
        this.brojSasije = brojSasije;
        this.registarskaOznaka = registarskaOznaka;
        this.redovneServisneUsluge = redovneServisneUsluge;
        this.dodatneServisneUsluge = dodatneServisneUsluge;
        this.napomene = napomene;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getMarkaVozila() {
        return markaVozila;
    }

    public void setMarkaVozila(String markaVozila) {
        this.markaVozila = markaVozila;
    }

    public String getModelVozila() {
        return modelVozila;
    }

    public void setModelVozila(String modelVozila) {
        this.modelVozila = modelVozila;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(Integer kilometraza) {
        this.kilometraza = kilometraza;
    }

    public String getBrojSasije() {
        return brojSasije;
    }

    public void setBrojSasije(String brojSasije) {
        this.brojSasije = brojSasije;
    }

    public String getRegistarskaOznaka() {
        return registarskaOznaka;
    }

    public void setRegistarskaOznaka(String registarskaOznaka) {
        this.registarskaOznaka = registarskaOznaka;
    }

    public String getRedovneServisneUsluge() {
        return redovneServisneUsluge;
    }

    public void setRedovneServisneUsluge(String redovneServisneUsluge) {
        this.redovneServisneUsluge = redovneServisneUsluge;
    }

    public String getDodatneServisneUsluge() {
        return dodatneServisneUsluge;
    }

    public void setDodatneServisneUsluge(String dodatneServisneUsluge) {
        this.dodatneServisneUsluge = dodatneServisneUsluge;
    }

    public String getNapomene() {
        return napomene;
    }

    public void setNapomene(String napomene) {
        this.napomene = napomene;
    }
    
    
    
}
