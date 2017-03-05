package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;

public class Evento  extends ClaseBase implements Serializable  {

  private long idEvento;
  private String nombre;
  private String fecha;

  public Evento (){}

    public Evento(Long idEvento){
      this.idEvento = idEvento;
    }

    public Evento(String nombre, String fecha){
      this.nombre=nombre;
      this.fecha=fecha;
    }

    /**
    * Regresa el id del rol.
    * @return Long
    */
    public Long getIdEvento() {
      return this.idEvento;
    }

    /**
    * Establece el id del rol.
    * @return void
    */
    public void setIdEvento(Long idEvento) {
      this.idEvento = idEvento;
    }


    /**
    * Regresa el nombre del evento
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
