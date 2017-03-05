package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;

public class Perfil extends ClaseBase 
        implements Serializable {

    private Long id;
    private String usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String cp;
    private String pais;
    private String ciudad;
    private String estado;


    public Perfil() {
    }

    public Perfil(Long id){
        this.id = id;
    }

    public Perfil(String usuario, String contra, String nombre, String apellido, String telefono, String email, String cp, String pais, String ciudad, String estado){
        this.usuario = usuario;
        this.contra=contra;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.cp=cp;
        this.pais=pais;
        this.ciudad=ciudad;
        this.estado=estado;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del rol.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return this.contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return this.cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
