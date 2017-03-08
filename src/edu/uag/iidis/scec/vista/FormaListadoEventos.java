package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


public final class FormaListadoEventos
        extends ValidatorForm {

    private Collection eventos;
    private int contador;
	private String nombre;
    private String fecha;
    private String atributo;


    public void setEventos(Collection eventos) {
        System.out.println("entro");
        this.eventos = eventos;
        if (eventos != null) {
          this.contador = eventos.size();
          System.out.println("Cantidad: "+contador);

        } else
          this.contador = -1;
    }

    public Collection getEventos() {
        return (this.eventos);
    }

    public int getContador(){
        return (this.contador);
    }
    public void setContador(int contador){
         this.contador = contador;
    }

    public String getAtributo(){
        return (this.atributo);
    }
    public void setAtributo(String atributo){
         this.atributo = atributo;
    }

  public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        nombre=null;
        fecha=null;

    }

     public String getNombre(){
        return(this.nombre);
    }

    public void setNombre(String nombre){
         this.nombre = nombre;
    }

    public String getFecha(){
        return (this.fecha);
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }




    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
