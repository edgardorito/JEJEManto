package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;
/**
* <h1>Evento</h1>
* En esta clase esta declarado los metodos y atributos  
* que 
* @author  Edgardo Rito Deheza
* @version 0.3
*/
public class Evento  extends ClaseBase implements Serializable  {

  private long idEvento;
  private String nombre;
  private String fecha;

  public Evento (){}
 /**
   * Constructor que recibe de parametro el id del Evento.
   * @param idEvento Recibe el id del evento.
  */
    public Evento(Long idEvento){
      this.idEvento = idEvento;
    }
 /**
   * Constructor que recibe el nombre y la fecha.
   * @param nombre Nombre del evento.
   * @param fecha Fecha del evento.
   */
    public Evento(String nombre, String fecha){
      this.nombre=nombre;
      this.fecha=fecha;
    }

    /**
    * Regresa el id del evento.
    * @return Long
    */
    public Long getIdEvento() {
      return this.idEvento;
    }

    /**
    * Establece el id del evento.
    * @return void
    */
    public void setIdEvento(Long idEvento) {
      this.idEvento = idEvento;
    }


    /**
    * Regresa el nombre del Evento
    * @return String
    */
    public String getNombre() {
      return this.nombre;
    }

    /**
    * Establece el nombre del evento.
    * @return void
    */
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }


    /**
    * Regresa la fecha del evento.
    * @return String
    */
    public String getFecha() {
      return this.fecha;
    }

    /**
    * Establece la fecha del evento.
    * @return void
    */
    public void setFecha(String fecha) {
      this.fecha = fecha;
    }


}
