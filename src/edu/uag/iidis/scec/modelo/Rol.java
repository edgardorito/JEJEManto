package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="Rol.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Rol extends ClaseBase 
        implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;
    private List usuarios = new ArrayList();

    public Rol() {
    }

    public Rol(Long id){
        this.id = id;
    }

    public Rol(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return this.nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        usuario.getRoles().add(this);
    }

}
