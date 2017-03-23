package edu.uag.iidis.scec.vista;

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

public final class FormaNuevoClima
        extends ValidatorForm {

    private String ciudad;
    private String latitud;
    private String longitud;

    public void setCiudad(String ciudad) {
         /**
     * Utilizamos este metodo para settear el atributo ciudad
   * @param ciudad el atributo a settear
   */
        this.ciudad = ciudad;
    }

    public String getCiudad() {
         /**
     * Utilizamos este metodo para obtener el atributo ciudad
     *  @return ciudad atributo ciudad
   */
        return (this.ciudad);
    }

    public void setLatitud(String latitud){
         /**
     * Utilizamos este metodo para settear el atributo latitud
   * @param latitud el atributo a settear
   */
        this.latitud = latitud;
    }

    public String getLatitud(){
          /**
     * Utilizamos este metodo para obtener el atributo latitud
     *  @return latitud atributo latitud
   */
        return (this.latitud);
    }

    public void setLongitud(String longitud){
        /**
     * Utilizamos este metodo para settear el atributo longitud
   * @param longitud el atributo a settear
   */
        this.longitud = longitud;
    }

    public String getLongitud(){
          /**
     * Utilizamos este metodo para obtener el atributo longitud
     *  @return longitud atributo longitud
   */
        return (this.longitud);
    }


    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        /** 
     * Utilizamos este método para hacer nulo el atributo ciudad 
     * @param mapping de tipo ActionMapping
     * @param request de tipo HttpServletRequest
     */
        ciudad=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        /**
         * Ejecuta las validaciones proporcionadas por Struts-Validator
         * @param mapping de tipo ActionMapping
         * @param request de tipo HttpServletRequest
         * @return Validaciones no cubiertas por Struts-Validator
         */

        ActionErrors errores = super.validate(mapping, request);

        return errores;

    }

}
