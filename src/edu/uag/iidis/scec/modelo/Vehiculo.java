package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * Esta clase se utiliza para registrar y actualizar un vehiculo
 *
 * @author Javier de Jesús Flores Herrera
 * @version  0.3, 2016-03-21
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
     * @param  curp del usuario
     * @param  tipo de automovil
     * @param  modelo del automovil
     * @param  marca  del automovil
     * @param  placa  del automovil
     * @param  color  del automovil
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
     * @return this.id id del vehiculo
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del Vehiculo.
     * @param id del vehiculo
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Regresa el tipo del vehiculo.
     * @return this.tipo del vehiculo
     */
    public String getTipo() {
        return this.tipo;
    }
     /**
     * Regresa el modelo del vehiculo.
     * @return this.modelo del vehiculo
     */
    public String getModelo() {
        return this.modelo;
    }
     /**
     * Regresa la marca del vehiculo.
     * @return this.marca del vehiculo
     */
    public String getMarca() {
        return this.marca;
    }
     /**
     * Regresa la placa del vehiculo.
     * @return this.placa del vehiculo
     */
    public String getPlaca() {
        return this.placa;
    }
     /**
     * Regresa el color de vehiculo.
     * @return this.color del vehiculo
     */
    public String getColor() {
        return this.color;
    }
     /**
     * Regresa el curp asociado al vehiculo.
     * @return this.curp del usuario
     */
     public String getCurp() {
        return this.curp;
    }
    
    /**
     * Establece el nombre del vehiculo.
     * @param tipo del vehiculo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Establece el modelo del vehiculo.
     * @param modelo del vehiculo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Establece la marca del vehiculo.
     * @param marca del vehiculo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Establece la placa del vehiculo.
     * @param placa del vehiculo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Establece el color del vehiculo.
     * @param color del vehiculo
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Establece la curo del usuario.
     * @param curp del usuario
     */
     public void setCurp(String curp) {
        this.curp = curp;
    }
   


}