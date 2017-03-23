package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;
/**
 * Esta clase se utiliza para registrar y actualizar un vehiculo
 *
 * @author Javier de Jesús Flores Herrera
 * @version  0.3
 * @fecha 2016-03-21
 * 
 */


public final class FormaNuevoVehiculo
        extends ValidatorForm {

    private String tipo;
    private String modelo;
    private String marca;
    private String placa;
    private String color;
    private String curp;
    
    /**
     * estable atributos a nulos
     * @param mapping de tipo ActionMapping
     * @param request de tipo HttpServletRequest
     */
    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
	    tipo=null;
        modelo=null;
        marca=null;
        placa=null;
        color=null;
        curp=null;
    }

    /**
     * Regresa el tipo del Vehiculo.
     * @return Long
     */
     public String getTipo(){
        return(this.tipo);
    }
    /**
     * Establece el tipo del Vehiculo.
     * @return Long
     */
    public void setTipo(String tipo){
         this.tipo = tipo;
    }
    /**
     * Regresa el modelo del Vehiculo.
     * @return Long
     */
    public String getModelo(){
        return (this.modelo);
    }
    /**
     * Establece el modelo del Vehiculo.
     * @return Long
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    /**
     * Regresa la marca del Vehiculo.
     * @return Long
     */
     public String getMarca(){
        return(this.marca);
    }
    /**
     * Establece la marca del Vehiculo.
     * @return Long
     */
    public void setMarca(String marca){
         this.marca = marca;
    }
    /**
     * Regresa la placa del Vehiculo.
     * @return Long
     */
    public String getPlaca(){
        return (this.placa);
    }

    /**
     * Establece la placa del Vehiculo.
     * @return Long
     */
    public void setPlaca(String placa){
        this.placa = placa;
    }
    /**
     * Regresa el color del Vehiculo.
     * @return Long
     */
     public String getColor(){
        return(this.color);
    }
    /**
     * Establece el color del Vehiculo.
     * @return Long
     */
    public void setColor(String color){
         this.color = color;
    }
    /**
     * Regresa la curp del usuario.
     * @return Long
     */
    public String getCurp(){
        return (this.curp);
    }
/**
     * Establece la curp del usuario.
     * @return Long
     */
    public void setCurp(String curp){
        this.curp = curp;
    }
    /**
     * 
     * @param  mapping 
     * @param  request
     * @return ActionErrors
     */
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
