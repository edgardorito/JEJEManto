package edu.uag.iidis.scec.control;

import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.servicios.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;


public final class MCUEliminarEvento 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUEliminarEvento.class);

 /**
   * Metodo que eliminar un evento.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */
    
    public ActionForward eliminarEvento(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">Eliminar Vehiculo");
        }

        
        // Se obtienen los datos para procesar el registro
        FormaNuevoEvento forma = (FormaNuevoEvento)form;
 
        
        System.out.println("Nombre ----> "+forma.getNombre());
        ManejadorEventos mr = new ManejadorEventos();
        int resultado = mr.eliminarEvento(forma.getNombre());

         return (mapping.findForward("exito"));
    }


}

