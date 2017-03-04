package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;



public class Clima extends ClaseBase 
        implements Serializable {

    private Long idClima;
    private String ciudad;


    public Clima() {
    }

    public Clima(Long id){
        this.idClima = id;
    }

    public Clima(String ciudad){
        this.ciudad=ciudad;
    }

    public Long getIdClima() {
        return this.idClima;
    }

    public void setIdClima(Long id) {
        this.idClima = id;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
