package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;



public class Clima extends ClaseBase 
        implements Serializable {

    private Long idClima;
    private String ciudad;
    private String latitud;
    private String longitud;


    public Clima() {
    }

    public Clima(Long id){
        this.idClima = id;
    }

    public Clima(String ciudad, String latitud, String longitud){
        this.ciudad=ciudad;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public String getLatitud(){
        return this.latitud;
    }

    public void setLatitud(String latitud){
        this.latitud = latitud;
    }

    public String getLongitud(){
        return this.longitud;
    }

    public void setLongitud(String longitud){
        this.longitud = longitud;
    }    

}
