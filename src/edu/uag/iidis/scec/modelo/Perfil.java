package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Perfil extends ClaseBase 
        implements Serializable {

/**
 * Id del perfil
 */
    private Long id;
/**
 * usuario
 */
    private String usuario;
/**
 * contraseña del usuario
 */
    private String contra;
/**
 * nombre del usuario
 */
    private String nombre;
/**
 * apellido del usuario
 */
    private String apellido;
/**
 * numero telefonico del usuario
 */
    private String telefono;
/**
 * correo electronico del usuario
 */
    private String email;
/**
 * codigo postal del usuario
 */
    private String cp;
/**
 * pais del usuario
 */
    private String pais;
/**
 * ciudad del usuario
 */
    private String ciudad;
/**
 * estado del usuario
 */
    private String estado;

/**
 * Constructor de la clase
 */
    public Perfil() {
    }

/**
 * Constructor de la clase
 * @param  id [atributo id]
 */
    public Perfil(Long id){
        this.id = id;
    }

/**
 * Constructor de la clase
 * @param  usuario  [atributo usuario]
 * @param  contra   [atributo contra]
 * @param  nombre   [atributo nombre]
 * @param  apellido [atributo apellido]
 * @param  telefono [atributo telefono]
 * @param  email    [atributo email]
 * @param  cp       [atributo cp]
 * @param  pais     [atributo pais]
 * @param  ciudad   [atributo ciudad]
 * @param  estado   [atributo estado]
 */
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
* Regresa el id del perfil.
* @return this.id ide del usuario
*/
    public Long getId() {
        return this.id;
    }

/**
 * Establece el id del perfil.
 * @param id [id del usuario]
 */
    public void setId(Long id) {
        this.id = id;
    }

/**
 * Obtener el nombre de usuario
 * @return this.usuario atributo usuario
 */
    public String getUsuario() {
        return this.usuario;
    }

/** Asignar usuario
 * @param usuario atributo usuario
 */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

/**
 * Obtener la contraseña
 * @return this.contra atributo contra
 */
    public String getContra() {
        return this.contra;
    }

/**
 * Asignar la contraseña
 * @param contra atributo contra
 */
    public void setContra(String contra) {
        this.contra = contra;
    }

/**
 * Obtener el nombre del usuario
 * @return this.nombre atributo nombre
 */
    public String getNombre() {
        return this.nombre;
    }

/**
 * Asignar nombre del usuario
 * @param nombre atributo nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Obtener el apellido del usuario
 * @return this.apellido atributo apellido
 */
    public String getApellido() {
        return this.apellido;
    }

/**
 * Asignar apelliodo del usuario
 * @param apellido atributo apellido
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    

/**
 * Obtener el numero telefonico del usuario
 * @return this.telefono atributo telefono
 */
    public String getTelefono() {
        return this.telefono;
    }

/**
 * Asignar numero telefonico del usuario
 * @param telefono atributo telefono
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

/**
 * Obtener el correo electronico del usuario
 * @return this.email atributo email
 */
    public String getEmail() {
        return this.email;
    }

/**
 * Asignar correo electronico del usuario
 * @param email atributo email
 */
    public void setEmail(String email) {
        this.email = email;
    }

/**
 * Obtener el Codigo postal del usuario
 * @return this.cp atributo cp
 */
    public String getCp() {
        return this.cp;
    }

/**
 * Asignar el Codigo postal del usuario
 * @param cp atributo cp
 */
    public void setCp(String cp) {
        this.cp = cp;
    }

/**
 * Obtener el pais del usuario
 * @return this.pais atributo pais
 */
    public String getPais() {
        return this.pais;
    }

/**
 * Asignar Pais del usuario
 * @param pais atributo pais
 */
    public void setPais(String pais) {
        this.pais = pais;
    }

/**
 * Obtener la ciudad del usuario
 * @return this.ciudad atributo ciudad
 */
    public String getCiudad() {
        return this.ciudad;
    }

/**
 * Asignar ciudad del usuario
 * @param ciudad atributo ciudad
 */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

/**
 * Obtener el estado del usuario
 * @return this.estado
 * atributo estado
 */
    public String getEstado() {
        return this.estado;
    }

/**
 * Asignar estado del usuario
 * @param estado atributo estado
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}