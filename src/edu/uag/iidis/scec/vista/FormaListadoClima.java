package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
* Esta clase se utiliza para declarar todos los atributos
* de un Objeto tipo Clima, sus getters y setters
* 
*
* @author  Ernesto Sandoval Becerra
* @version 0.3
* @since   2016-03-21 
*/

public final class FormaListadoClima
        extends ValidatorForm {

    private Collection climas;
    private int contador;
    private String ciudad;
    private String latitud;
    private String longitud;
    private String atributo;

  /**
  * Utilizamos este metodo para settear el valor contador al tamaño de Collections de Clima
   * @param climas una Collection de objetos Clima
   */
    public void setClimas(Collection climas) {
        
        this.climas = climas;
        if (climas != null) {
          this.contador = climas.size();
        } else
          this.contador = -1;
    }
    /**
     * Utilizamos este metodo para obtener la Collections de Clima
     *  @return Collection una Collection de objetos Clima
     */
    public Collection getClimas() {
       
        return (this.climas);
    }
    /**
    * Utilizamos este metodo para obtener el atributo contador
    *  @return int contador atributo de clase
    */
    public int getContador(){
          
        return (this.contador);
    }
    /**
     * Utilizamos este metodo para obtener el atributo atributo
     *  @return String atributo de clase
     */
    public String getAtributo() {
          
        return (this.atributo);
    }
    /**
    * Utilizamos este metodo para settear el atributo atributo
    * @param atributo el atributo a settear
    */
    public void setAtributo(String atributo){
          
        this.atributo = atributo;
    }    

    /**
    * Utilizamos este metodo para settear el atributo ciudad
    * @param ciudad el atributo a settear
    */
    public void setCiudad(String ciudad) {
        
        this.ciudad = ciudad;
    }
    /**
    * Utilizamos este metodo para obtener el atributo ciudad
    *  @return String atributo ciudad
    */
    public String getCiudad() {
          
        return (this.ciudad);
    }
    /**
    * Utilizamos este metodo para settear el atributo latitud
    * @param latitud el atributo a settear
    */
    public void setLatitud(String latitud){
        
        this.latitud = latitud;
    }
    /**
    * Utilizamos este metodo para obtener el atributo latitud
    *  @return String atributo latitud
    */
    public String getLatitud(){
          
        return (this.latitud);
    }
    /**
    * Utilizamos este metodo para settear el atributo longitud
    * @param longitud el atributo a settear
    */
    public void setLongitud(String longitud){
        
        this.longitud = longitud;
    }
    /**
    * Utilizamos este metodo para obtener el atributo longitud
    *  @return String atributo longitud
    */
    public String getLongitud(){
          
        return (this.longitud);
    }

    /** 
     * Utilizamos este método para hacer nulo el atributo ciudad 
     * @param mapping de tipo ActionMapping
     * @param request de tipo HttpServletRequest
     */
    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        ciudad=null;
    }

    /**
    * Ejecuta las validaciones proporcionadas por Struts-Validator
    * @param mapping de tipo ActionMapping
    * @param request de tipo HttpServletRequest
    * @return Validaciones no cubiertas por Struts-Validator
    */
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errores = super.validate(mapping, request);

        return errores;

    }

}
