package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
* <h1>FormaListadoEventos</h1>
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
   * @return void 
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
   * @return Collection Regresa la Collection de eventosz.
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
   * @return void.
  */
    public void setContador(int contador){
         this.contador = contador;
    }
/**
   * Este metodo obtiene el atributo.
   * @return String Regresa el valor del atributo.
  */
    public String getAtributo(){
        return (this.atributo);
    }
    /**
   * Este metodo sete el valor del atributo
   * @param atributo Se recibe un string con el atributo
   * @return void.
  */
    public void setAtributo(String atributo){
         this.atributo = atributo;
    }
/**
   * Este metodo reinicia los atributos nommbre y fecha
   * @param mappging Recibe un objeto ActionMapping.
   * @param request Recibe un HttpServletRequest. 
   * @return void.
  */
  public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        nombre=null;
        fecha=null;

    }
/**
   * Este metodo obtiene el nombre del evento 
   * @return String Regrea el nombre el evento.
  */
     public String getNombre(){
        return(this.nombre);
    }
/**
   * Este metodo setea el nombre del evento
   * @param String Recibe un string con el nomnbre del evento.
   * @return void.
  */
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
/**
   * Este metodo obtiene la fecha del evento
   * @return String Regresa la fecha del evento.
  */
    public String getFecha(){
        return (this.fecha);
    }
/**
   * Este metodo setea la fecha del evento
   * @param String Recibe un string con la fecha del evento.
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
