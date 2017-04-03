package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
* FormaListadoEventos
* Esta clase es la forma para los eventos  
* @author  Edgardo Rito Deheza
* @version 0.3
*/
public final class FormaListadoEventos
        extends ValidatorForm {

    private Collection eventos;
    private int contador;
	private String nombre;
    private String fecha;
    private String atributo;

 /**
   * Este metodo le asigna valor a una Collection
   * @param eventos Recibe una Collection
  */
 
    public void setEventos(Collection eventos) {
        this.eventos = eventos;
        if (eventos != null) {
          this.contador = eventos.size();
          System.out.println("Cantidad: "+contador);

        } else
          this.contador = -1;
    }
/**
   * Este metodo obtiene una Collection de eventos.
   * @return this.eventos Regresa la Collection de eventos.
  */
    public Collection getEventos() {
        return (this.eventos);
    }
/**
   * Este metodo obtiene el contador.
   * @return int Regresa el valor del contador.
  */
    public int getContador(){
        return (this.contador);
    }

 /**
  * Este metodo setea el contador.
  * @param contador [atributo contador]
  */
    public void setContador(int contador){
         this.contador = contador;
    }
/**
   * Este metodo obtiene el atributo.
   * @return this.atributo Regresa el valor del atributo.
  */
    public String getAtributo(){
        return (this.atributo);
    }
    /**
   * Este metodo sete el valor del atributo
   * @param atributo Se recibe un string con el atributo
  */
    public void setAtributo(String atributo){
         this.atributo = atributo;
    }
/**
   * Este metodo reinicia los atributos nommbre y fecha
   * @param mapping Recibe un objeto ActionMapping.
   * @param request Recibe un HttpServletRequest. 
  */
 
  public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        nombre=null;
        fecha=null;

    }
/**
   * Este metodo obtiene el nombre del evento 
   * @return this.nombre Regresa el nombre el evento.
  */
     public String getNombre(){
        return(this.nombre);
    }
/**
   * Este metodo setea el nombre del evento
   * @param nombre Recibe un string con el nomnbre del evento.
  */
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
/**
   * Este metodo obtiene la fecha del evento
   * @return this.fecha Regresa la fecha del evento.
  */
    public String getFecha(){
        return (this.fecha);
    }
/**
   * Este metodo setea la fecha del evento
   * @param fecha Recibe un string con la fecha del evento.
  */
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
