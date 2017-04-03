package edu.uag.iidis.scec.modelo;

import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase es usada para representar a una persona. 
 *
 * <p>
 * <a href="Persona.java.html"><i>Ver código fuente</i></a>
 * </p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Persona {
    
    protected Long id;
    protected NombrePersona nombre;


    public Persona(){
    }

    public Persona(NombrePersona nombre) {
        this.nombre=nombre;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public NombrePersona getNombre() {
        return nombre;
    }

    public void setNombre(NombrePersona nombre) {
        this.nombre = nombre;
    }

}
