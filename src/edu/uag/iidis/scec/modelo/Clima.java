package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * Clase donde se declaran los atrobutos de un objeto
 * de tipo Clima
 * @author  Ernesto Sandoval Becerra
 * @version 0.3
 * @since   2016-03-21 
 */

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
        /**
         * método empleado para obtener el atributo idClima
         * @return atributo idClima
         */
        return this.idClima;
    }

    public void setIdClima(Long id) {
         /**
         * método empleado para settear el atributo idClima
         * @param id valor de idClima
         */
        this.idClima = id;
    }

    public String getCiudad() {
         /**
         * método empleado para obtener el atributo ciudad
         * @return atributo ciudad
         */
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        /**
         * método empleado para settear el atributo ciudad
         * @param ciudad valor de ciudad
         */
        this.ciudad = ciudad;
    }

    public String getLatitud(){
         /**
         * método empleado para obtener el atributo latitud
         * @return atributo latitud
         */
        return this.latitud;
    }

    public void setLatitud(String latitud){
        /**
         * método empleado para settear el atributo latitud
         * @param latitud valor de latitud
         */
        this.latitud = latitud;
    }

    public String getLongitud(){
         /**
         * método empleado para obtener el atributo longitud
         * @return atributo longitud
         */
        return this.longitud;
    }

    public void setLongitud(String longitud){
        /**
         * método empleado para settear el atributo longitud
         * @param longitud valor de longitud
         */
        this.longitud = longitud;
    }    

}
