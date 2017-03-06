package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


public final class FormaListadoCP
        extends ValidatorForm {

   
	private String ciudad;
    private String estado;

    public FormaListadoCP(){

    }
    public FormaListadoCP(String ciudad, String estado){
        this.ciudad = ciudad;
        this.estado = estado;
    }
     public void setAll(String ciudad, String estado){
        this.ciudad = ciudad;
        this.estado = estado;
    }
  
  
  
	public String getCiudad(){
        return(this.ciudad);
    }

	public void setCiudad(String ciudad){
         this.ciudad = ciudad;
    }

    public String getEstado(){
        return(this.estado);
    }

    public void setEstado(String estado){
         this.estado = estado;
    }

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        estado=null;
        ciudad =null;
       
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
