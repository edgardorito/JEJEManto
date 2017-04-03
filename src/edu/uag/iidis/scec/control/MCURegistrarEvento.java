package edu.uag.iidis.scec.control;

import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.servicios.*;

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
* MCURegistrarEvento
* Esta clase se encar de registrar y actualizar un evento.
* 
* @author  Edgardo Rito Deheza
* @version 0.3
*/
public final class MCURegistrarEvento
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCURegistrarEvento.class);

 /**
   * Metodo que registra un evento.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */

    public ActionForward procesarRegistroEvento(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">procesarRegistroEvento");
        }

        // Verifica si la acción fue cancelada por el usuario
        if (isCancelled(request)) {
            if (log.isDebugEnabled()) {
                log.debug("<La acción fue cancelada");
            }
            return (mapping.findForward("cancelar"));
        }


        // Se obtienen los datos para procesar el registro
        FormaNuevoEvento forma = (FormaNuevoEvento)form;

        Evento evento = new Evento(forma.getNombre(),
                          forma.getFecha());

        ManejadorEventos mr = new ManejadorEventos();
        int resultado = mr.crearEvento(evento);

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.nombreEstadoYaExiste",
                                               forma.getNombre()));
                saveErrors(request, errores);
                return ( mapping.findForward("fracaso") );

            case 3:
                log.error("Ocurrió un error de infraestructura");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));
                saveErrors(request, errores);
                return ( mapping.findForward("fracaso") );

            default:
                log.warn("ManejadorEvento.crearEvento regresó reultado inesperado");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));
                saveErrors(request, errores);
                return ( mapping.findForward("fracaso") );
        }
    }
 /**
   * Metodo que actualiza un evento.
   * @param mapping [Recibe un objeto de la clase ActionMapping]
   * @param form  [Recibe un objeto de la clase ActionForm]
   * @param request [Recibe un objeto de la clase HttpServletRequest]
   * @param  response [Recibe un objeto de la clase HttpServletResponse]
   * @return ActionForward [Regresa ub objeto de la clase ActionForward]
   * @throws Exception [excepción]
  */
        public ActionForward actualizarEvento(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">procesarRegistroVehiculo");
        }

        
        // Se obtienen los datos para procesar el registro
        FormaNuevoEvento forma = (FormaNuevoEvento)form;
 
        String a = forma.getFecha();

        String b =forma.getNombre();
        System.out.println("Nombre ----<>------ "+a);
        Evento evento = new Evento(
                       a,b
        );
         

        ManejadorEventos mr = new ManejadorEventos();
        int resultado = mr.actualizarEvento(evento);

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:   
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.fechaEventoYaExiste",
                                               forma.getNombre()));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            case 3:
                log.error("Ocurrió un error de infraestructura");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            default:
                log.warn("ManejadorUsuario.crearUsuario regresó reultado inesperado");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());
        }
    }

}
