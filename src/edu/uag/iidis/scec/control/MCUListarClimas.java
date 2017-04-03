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

/**
* Esta clase se utiliza para listar, eliminar y buscar climas
* 
*
* @author  Ernesto Sandoval Becerra
* @version 0.3, 2016-03-21 
*/

public final class MCUListarClimas
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUListarClimas.class);

/**
     * Este metodo es utilizado para listar una coleccion de objetos de tipo 
     * Clima, los cuales seran recuperados de la BD utilizando un objeto de la clase
     * ManejadorClima
   * @param mapping de tipo ActionMapping
   * @param form  de tipo ActionForm
   * @param request de tipo HttpServletRequest
   * @param response de tipo HttpServletResponse
   * @return ActionForward Es el resultado de la consulta (la lista de ciudades ordenadas)
   * @throws Exception excepción
   */
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

    /**
    * Este metodo es utilizado para listar una coleccion de objetos de tipo 
    * Clima por el atributo indicado.
    * @param mapping de tipo ActionMapping
    * @param form  de tipo ActionForm
    * @param request de tipo HttpServletRequest
    * @param response de tipo HttpServletResponse
    * @return ActionForward Es el resultado de la consulta (la lista de ciudades ordenadas por el atributo)
    * @throws Exception excepción
    */

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
    /**
   * Se utiliza este método para buscar un clima por el parámetro de nombre de ciudad
   * @param mapping de tipo ActionMapping
   * @param form  de tipo ActionForm
   * @param request de tipo HttpServletRequest
   * @param response de tipo HttpServletResponse
   * @return ActionForward Es el resultado de la consulta (la ciudad a buscar)
   * @throws Exception excepción
   */
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
  
    /**
    * Este metodo es utilizado para eliminar una ciudad que se pasa como parametro
   * @param mapping de tipo ActionMapping
   * @param form  de tipo ActionForm
   * @param request de tipo HttpServletRequest
   * @param response de tipo HttpServletResponse
   * @return ActionForward Es el resultado de la operació (la ciudad eliminada)
   * @throws Exception excepción
   */
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
        return (mapping.findForward("exito"));

    }
}