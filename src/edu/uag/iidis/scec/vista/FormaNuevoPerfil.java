package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public final class FormaNuevoPerfil
        extends ValidatorForm {

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

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getContra() {
        return (this.contra);
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return (this.usuario);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return (this.nombre);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return (this.apellido);
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return (this.telefono);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return (this.email);
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCp() {
        return (this.cp);
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return (this.pais);
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return (this.ciudad);
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return (this.estado);
    }

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
    usuario=null;
    contra=null;
    nombre=null;
    apellido=null;
    telefono=null;
    email=null;
    cp=null;
    pais=null;
    ciudad=null;
    estado=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
