package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * Clase para obtener y asignar el valor de cada atributo
 * ingresado en el sistema.
 * @version 0.3, 21/03/17
 * @author Josseline Arreola
 */
public final class FormaNuevoPerfil
        extends ValidatorForm {

/**
 * Nombre del usuario
 */
    private String usuario;
/**
 * Contraseña del usuario
 */
    private String contra;
/**
 * Nombre del usuario
 */
    private String nombre;
/**
 * Apellido del usuario
 */
    private String apellido;
/**
 * Número telefonico del usuario
 */
    private String telefono;
/**
 * Correo electronico del usuario
 */
    private String email;
/**
 * Código postal del usuario (Solo de Estados Unidos)
 */
    private String cp;
/**
 * País del usuario
 */
    private String pais;
/**
 * Ciudad del usuario
 */
    private String ciudad;
/**
 * Estado del usuario
 */
    private String estado;

/**
 * Asignar la contraseña
 * @param contra
 * atributo contra
 */
    public void setContra(String contra) {
        this.contra = contra;
    }

/**
 * Obtener la contraseña
 * @return this.contra
 * atributo contra
 */
    public String getContra() {
        return (this.contra);
    }

/** Asignar usuario
 * @param usuario
 * atributo usuario
 */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

/**
 * Obtener el nombre de usuario
 * @return this.usuario
 * atributo usuario
 */
    public String getUsuario() {
        return (this.usuario);
    }

/**
 * Asignar nombre del usuario
 * @param nombre
 * atributo nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Obtener el nombre del usuario
 * @return this.nombre
 * atributo nombre
 */
    public String getNombre() {
        return (this.nombre);
    }

/**
 * Asignar apelliodo del usuario
 * @param apellido
 * atributo apellido
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

/**
 * Obtener el apellido del usuario
 * @return this.apellido
 * atributo apellido
 */
    public String getApellido() {
        return (this.apellido);
    }

/**
 * Asignar numero telefonico del usuario
 * @param telefono
 * atributo telefono
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

/**
 * Obtener el numero telefonico del usuario
 * @return this.telefono
 * atributo telefono
 */
    public String getTelefono() {
        return (this.telefono);
    }

/**
 * Asignar correo electronico del usuario
 * @param email
 * atributo email
 */
    public void setEmail(String email) {
        this.email = email;
    }

/**
 * Obtener el correo electronico del usuario
 * @return this.email
 * atributo email
 */
    public String getEmail() {
        return (this.email);
    }

/**
 * Asignar el Codigo postal del usuario
 * @param cp
 * atributo cp
 */
    public void setCp(String cp) {
        this.cp = cp;
    }

/**
 * Obtener el Codigo postal del usuario
 * @return this.cp
 * atributo cp
 */
    public String getCp() {
        return (this.cp);
    }

/**
 * Asignar Pais del usuario
 * @param pais
 * atributo pais
 */
    public void setPais(String pais) {
        this.pais = pais;
    }

/**
 * Obtener el pais del usuario
 * @return this.pais
 * atributo pais
 */
    public String getPais() {
        return (this.pais);
    }

/**
 * Asignar ciudad del usuario
 * @param ciudad
 * atributo ciudad
 */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

/**
 * Obtener la ciudad del usuario
 * @return this.ciudad
 * atributo ciudad
 */
    public String getCiudad() {
        return (this.ciudad);
    }

/**
 * Asignar estado del usuario
 * @param estado
 * atributo estado
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }

/**
 * Obtener el estado del usuario
 * @return this.estado
 * atributo estado
 */
    public String getEstado() {
        return (this.estado);
    }

/**
 * Reestablece los atributos en nulos
 * @param mapping  representa la información que el servlet controlador, ActionServlet, 
 * sabe sobre la asignación de una solicitud particular, a una instancia de una clase 
 * determinada
 * @param request Contiene toda la información de la solicitud del cliente
 */
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

/**
 * Encapsula los mensajes de error 
 * @param mapping  representa la información que el servlet controlador, ActionServlet, 
 * sabe sobre la asignación de una solicitud particular, a una instancia de una clase 
 * determinada
 * @param request Contiene toda la información de la solicitud del cliente
 * @return errores Contiene los mensajes de error
 */
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
