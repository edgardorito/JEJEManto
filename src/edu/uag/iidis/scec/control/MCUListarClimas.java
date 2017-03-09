package edu.uag.iidis.scec.control;

import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.servicios.*;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;



public final class MCUListarClimas
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUListarClimas.class);


    public ActionForward solicitarListarClimas(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarListarClimas");
        }


        FormaListadoClima forma = (FormaListadoClima)form;

        ManejadorClima mr = new ManejadorClima();
        Collection resultado = mr.listarClima();

        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            if ( resultado.isEmpty() ) {
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.registroVacio"));
                saveErrors(request, errores);
            } else {

                forma.setClimas(resultado);
            }
            return (mapping.findForward("exito"));
        } else {
            log.error("Ocurrió un error de infraestructura");
            errores.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage("errors.infraestructura"));                
            saveErrors(request, errores);
            return ( mapping.findForward("fracaso") );
        }

    }


    public ActionForward listarClimasPor(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarBuscarClima");
        }

        FormaListadoClima forma = (FormaListadoClima)form;

        ManejadorClima mr = new ManejadorClima();
        Collection resultado = mr.listarClimaPor(forma.getAtributo());
        log.debug("Resultado Buscar "+resultado);
        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            if ( resultado.isEmpty() ) {
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.registroVacio"));
                saveErrors(request, errores);
               // System.out.println("vacio");
                //return (mapping.findForward("vacio"));
            } else {
                forma.setClimas( resultado );
            }
            return (mapping.findForward("exito"));
        } else {
            log.error("Ocurrió un error de infraestructura");
            errores.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage("errors.infraestructura"));                
            saveErrors(request, errores);
            return ( mapping.findForward("fracaso") );
        }

    }

        public ActionForward BuscarClima(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarBuscarClima");
        }

        FormaListadoClima forma = (FormaListadoClima)form;

        ManejadorClima mr = new ManejadorClima();
        Collection resultado = mr.buscarClimaPorCiudad(forma.getCiudad());
        log.debug("Resultado Buscar "+resultado);
        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            if ( resultado.isEmpty() ) {
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.registroVacio"));
                saveErrors(request, errores);
               // System.out.println("vacio");
                //return (mapping.findForward("vacio"));
            } else {
                forma.setClimas( resultado );
            }
            return (mapping.findForward("exito"));
        } else {
            log.error("Ocurrió un error de infraestructura");
            errores.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage("errors.infraestructura"));                
            saveErrors(request, errores);
            return ( mapping.findForward("fracaso") );
        }

    }
  

          public ActionForward EliminarClima(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarEliminarClima");
        }

        FormaListadoClima forma = (FormaListadoClima)form;

        ManejadorClima mr = new ManejadorClima();
        int resultado = mr.eliminarClimaPorCiudad(forma.getCiudad());
        //log.debug("Resultado Buscar "+resultado);
        //ActionMessages errores = new ActionMessages();
        return (mapping.findForward("exito"));

    }
}