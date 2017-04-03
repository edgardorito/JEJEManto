package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * Esta clase se utiliza para registrar y actualizar un vehiculo
 *
 * @author Javier de Jesús Flores Herrera
 * @version  0.3
 * 
 * 
 */

public final class FormaListadoVehiculos
        extends ValidatorForm {

    private Collection vehiculos;
    private int contador;
	    private String tipo;
    private String modelo;
    private String marca;
    private String placa;
    private String color;
    private String curp;
    private String atributo;
    /**
     *  
     * @param vehiculos lista con objetos tipo vehiculos
     */
    public void setVehiculos(Collection vehiculos) {
        System.out.println("entro");
        this.vehiculos = vehiculos;
        if (vehiculos != null) {
          this.contador = vehiculos.size();
          System.out.println("Cantidad: "+contador);
        } else
          this.contador = -1;
    }

    /**
     * Devuelve la lista de vehiculos
     * @return Collecton
     */
    public Collection getvehiculos() {
        return (this.vehiculos);
    }
  
    /**
     * 
     * @return int
     */
    public int getContador(){
        return (this.contador);
    }

    /**
     * Restablece los valores a null
     * @param mapping actionmapping
     * @param request httpservletrequest
     */
  public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        tipo=null;
        modelo=null;
        marca=null;
        placa=null;
        color=null;
        curp=null;
        atributo = null;
    }

    /**
     * 
     * @return String devuelve el tipo de vehiculo
     */
     public String getTipo(){
        return(this.tipo);
    }
    /**
     * 
     * @param tipo String establece el tipo de vehiculo
     */
    public void setTipo(String tipo){
         this.tipo = tipo;
    }
    /**
     * 
     * @return String
     */
     public String getAtributo(){
        return(this.atributo);
    }
    /**
     * 
     * @param atributo de tipo string
     */
    public void setAtributo(String atributo){
         this.atributo = atributo;
    }
    /**
     * Regresa el modelo del Vehiculo.
     * @return String [modelo del vehiculo]
     */
    public String getModelo(){
        return (this.modelo);
    }
    /**
     * Establece el modelo del Vehiculo.
     * @param modelo [modelo del vehiculo]
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    /**
     * Regresa la marca del Vehiculo.
     * @return String  [marca del vehiculo]
     */
     public String getMarca(){
        return(this.marca);
    }
    /**
     * Establece la marca del Vehiculo.
     * @param marca [marca del vehiculo]
     */
    public void setMarca(String marca){
         this.marca = marca;
    }
    /**
     * Regresa la placa del Vehiculo.
     * @return String  [placa del vehiculo]
     */
    public String getPlaca(){
        return (this.placa);
    }
    /**
     * Establece la placa del Vehiculo.
     * @param placa [placa del vehiculo]
     */
    public void setPlaca(String placa){
        this.placa = placa;
    }
    /**
     * Regresa el color del Vehiculo.
     * @return String  [color del vehiculo]
     */
     public String getColor(){
        return(this.color);
    }
    /**
     * Establece el color del Vehiculo.
     * @param color [color del vehiculo]
     */
    public void setColor(String color){
         this.color = color;
    }
    /**
     * Regresa la curp del usuario.
     * @return String [curp del usuario]
     */
    public String getCurp(){
        return (this.curp);
    }
    /**
     * Establece la curp del usuario.
     * @param curp [curp del usuario]
     */
    public void setCurp(String curp){
        this.curp = curp;
    }


    /**
     * 
     * @param mapping de tipo ActionMapping
     * @param request de tipo HttpServletRequest
     * @return ActionErrors errores
     */
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
