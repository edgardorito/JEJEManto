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
* MCUListarEventos
* Esta clase se encarga de listar por fecha 
* o por un atributo, ademas también 
* se encarga de buscar
* @author  Edgardo Rito Deheza
* @version 0.3
*/
public final class MCUListarEventos
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCURegistrarUsuario.class);
 /**
   * Metodo que lista los eventos por atributo.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */
    public ActionForward listarEventosPor(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">listarEventosPor");
        }

        FormaListadoEventos forma = (FormaListadoEventos)form;

        ManejadorEventos mr = new ManejadorEventos();
        Collection resultado = mr.listarEventosPor(forma.getAtributo());
        log.debug("Resultado Ordernar "+resultado);
        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            if ( resultado.isEmpty() ) {
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.registroVacio"));
                saveErrors(request, errores);
               // System.out.println("vacio");
                //return (mapping.findForward("vacio"));
            } else {
                forma.setEventos( resultado );
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
   * Metodo que lista los eventos por fecha.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */
    public ActionForward listarEventosPorFecha(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">listarEventosPorFecha");
        }

        FormaNuevoEvento forma = (FormaNuevoEvento)form;

        ManejadorEventos mr = new ManejadorEventos();
        Evento a = mr.listarEventosPorF(forma.getNombre());
        
        forma.setNombre(a.getNombre());        
        forma.setFecha(a.getFecha());


     
        return (mapping.findForward("exito"));
        

    }
 /**
   * Metodo que solicita los eventos.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */
    public ActionForward solicitarListaEventos(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarListarEventos");
        }


        FormaListadoEventos forma = (FormaListadoEventos)form;

        ManejadorEventos mr = new ManejadorEventos();
        Collection resultado = mr.listarEventos();

        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            if ( resultado.isEmpty() ) {
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.registroVacio"));
                saveErrors(request, errores);
            } else {

                forma.setEventos(resultado);
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
   * Metodo que busca un evento.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */
        public ActionForward BuscarEvento(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarBuscarEvento");
        }

        FormaListadoEventos forma = (FormaListadoEventos)form;

        ManejadorEventos mr = new ManejadorEventos();
        Collection resultado = mr.listarEventosPorFecha(forma.getFecha());
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
                forma.setEventos( resultado );
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

}
