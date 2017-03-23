package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * Esta clase se utiliza para registrar y actualizar un vehiculo
 *
 * @author Javier de Jesús Flores Herrera
 * @version  0.3
 * @fecha 2016-03-21
 * 
 */

public class Vehiculo extends ClaseBase 
        implements Serializable {

    private Long id;
    private String tipo;
    private String modelo;
    private String marca;
    private String placa;
    private String color;
    private String curp;

    /**
     * Constructor de la clase vehiculo
    * @return void
     */
    public Vehiculo() {
    }
    /**
     * Constructor de la clase vehiculo estableciendo el id
     * @param  id del vehiculo
     */
    public Vehiculo(Long id){
        this.id = id;
    }
    /**
     * Constructor estableciendo todos los valores del vehiculo
     * @param  curp   
     * @param  tipo de automovil
     * @param  modelo del automovil
     * @param  marca  
     * @param  placa  
     * @param  color  
     * @return void      
     */
    public Vehiculo( String curp,String tipo, String modelo,String marca,String placa,String color){
        this.tipo=tipo;
        this.modelo=modelo;
        this.marca=marca;
        this.placa=placa;
        this.color=color;
        this.curp = curp;
       
    }

    /**
     * Regresa el id del Vehiculo.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del Vehiculo.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Regresa el tipo del vehiculo.
     * @return String
     */
    public String getTipo() {
        return this.tipo;
    }
     /**
     * Regresa el modelo del vehiculo.
     * @return String
     */
    public String getModelo() {
        return this.modelo;
    }
     /**
     * Regresa la marca del vehiculo.
     * @return String
     */
    public String getMarca() {
        return this.marca;
    }
     /**
     * Regresa la placa del vehiculo.
     * @return String
     */
    public String getPlaca() {
        return this.placa;
    }
     /**
     * Regresa el color de vehiculo.
     * @return String
     */
    public String getColor() {
        return this.color;
    }
     /**
     * Regresa el curp asociado al vehiculo.
     * @return String
     */
     public String getCurp() {
        return this.curp;
    }
    
    /**
     * Establece el nombre del vehiculo.
     * @return void
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Establece el modelo del vehiculo.
     * @return void
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Establece la marca del vehiculo.
     * @return void
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Establece la placa del vehiculo.
     * @return void
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Establece el color del vehiculo.
     * @return void
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Establece la curo del usuario.
     * @return void
     */
     public void setCurp(String curp) {
        this.curp = curp;
    }
   


}