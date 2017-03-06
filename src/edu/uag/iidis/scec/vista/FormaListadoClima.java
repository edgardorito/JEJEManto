package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


public final class FormaListadoClima
        extends ValidatorForm {

    private Collection climas;
    private int contador;
    private String ciudad;
	
    public void setClimas(Collection climas) {
        this.climas = climas;
        if (climas != null) {
          this.contador = climas.size();
        } else
          this.contador = -1;
    }

    public Collection getClimas() {
        return (this.climas);
    }
  
    public int getContador(){
        return (this.contador);
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return (this.ciudad);
    }


    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        ciudad=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
