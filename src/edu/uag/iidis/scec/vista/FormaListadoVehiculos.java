package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


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

    public void setVehiculos(Collection vehiculos) {
        System.out.println("entro");
        this.vehiculos = vehiculos;
        if (vehiculos != null) {
          this.contador = vehiculos.size();
        } else
          this.contador = -1;
    }

    public Collection getvehiculos() {
        return (this.vehiculos);
    }
  
    public int getContador(){
        return (this.contador);
    }


  public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        tipo=null;
        modelo=null;
        marca=null;
        placa=null;
        color=null;
        curp=null;
    }

     public String getTipo(){
        return(this.tipo);
    }
    public void setTipo(String tipo){
         this.tipo = tipo;
    }

    public String getModelo(){
        return (this.modelo);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
     public String getMarca(){
        return(this.marca);
    }
    public void setMarca(String marca){
         this.marca = marca;
    }

    public String getPlaca(){
        return (this.placa);
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
     public String getColor(){
        return(this.color);
    }
    public void setColor(String color){
         this.color = color;
    }

    public String getCurp(){
        return (this.curp);
    }

    public void setCurp(String curp){
        this.curp = curp;
    }



    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
