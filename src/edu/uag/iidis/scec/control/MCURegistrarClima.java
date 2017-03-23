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
* Esta clase se utiliza para listar, eliminar y buscar climas
* 
*
* @author  Ernesto Sandoval Becerra
* @version 0.3
* @since   2016-03-21 
*/

public final class MCURegistrarClima 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCURegistrarClima.class);



    public ActionForward procesarRegistroClima(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

         /**
     * Este metodo es utilizado para registrar un nuevo objetoi tipo Clima dentro de la BD
   * @param mapping de tipo ActionMapping
   * @param form  de tipo ActionForm
   * @param request de tipo HttpServletRequest
   * @param response de tipo HttpServletResponse
   * @return ActionForward Es el resultado de la solicitud
   */

        if (log.isDebugEnabled()) {
            log.debug(">procesarRegistroClima");
        }

        // Se obtienen los datos para procesar el registro
        FormaNuevoClima forma = (FormaNuevoClima)form;
        System.out.println("test: latitud " +forma.getLatitud());
        Clima clima = new Clima(forma.getCiudad(),forma.getLatitud(),forma.getLongitud());

        ManejadorClima mr = new ManejadorClima();
        int resultado = mr.crearClima(clima);

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:   
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.CiudadYaExiste",
                                               forma.getCiudad()));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            case 3:
                log.error("Ocurrió un error de infraestructura");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            default:
                log.warn("ManejadorUsuario.crearClima regresó reultado inesperado");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());
        }
    }


    public ActionForward procesarEdicionClima(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {


         /**
     * Este metodo es utilizado para editar un Clima en la BD
   * @param mapping de tipo ActionMapping
   * @param form  de tipo ActionForm
   * @param request de tipo HttpServletRequest
   * @param response de tipo HttpServletResponse
   * @return ActionForward Es el resultado de la solicitud (la ciudad con atributos modificados)
   */

        if (log.isDebugEnabled()) {
            log.debug(">procesarEdicionClima");
        }

        // Se obtienen los datos para procesar el registro
        FormaNuevoClima forma = (FormaNuevoClima)form;
        //System.out.println("test: latitud " +forma.getLatitud());

        Clima clima = new Clima(forma.getCiudad(),forma.getLongitud(), forma.getLatitud());

        ManejadorClima mr = new ManejadorClima();
        int resultado = mr.editarClima(clima);

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:   
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.CiudadYaExiste",
                                               forma.getCiudad()));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            case 3:
                log.error("Ocurrió un error de infraestructura");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            default:
                log.warn("ManejadorUsuario.crearClima regresó reultado inesperado");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());
        }
    }
}

