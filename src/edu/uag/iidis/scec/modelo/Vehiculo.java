package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;



public class Vehiculo extends ClaseBase 
        implements Serializable {

    private Long id;
    private String tipo;
    private String modelo;
    private String marca;
    private String placa;
    private String color;
    private String curp;


    public Vehiculo() {
    }

    public Vehiculo(Long id){
        this.id = id;
    }

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
     * Regresa el tipo de vehiculo.
     * @return String
     */
    public String getTipo() {
        return this.tipo;
    }
    public String getModelo() {
        return this.modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getPlaca() {
        return this.placa;
    }
    public String getColor() {
        return this.color;
    }
     public String getCurp() {
        return this.curp;
    }
    
    /**
     * Establece el nombre del Lugar.
     * @return void
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setColor(String color) {
        this.color = color;
    }
     public void setCurp(String curp) {
        this.curp = curp;
    }
   


}