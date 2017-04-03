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


/**
 * Esta clase se utiliza para eliminar un vehiculo
 *
 * @author Javier de Jesús Flores Herrera
 * @version  0.3, 2016-03-21
 * 
 */
public final class MCUEliminarVehiculo 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUEliminarVehiculo.class);


    /**
     * 
     * @param mapping de tipo ActionMapping]
     * @param form forma con los datos a procesar
     * @param request peticion request de tipo HttpServletRequest
     * @param response peticion response de tipo HttpServletResponse
     * @return respuesta de tipo HttpServletResponse
     * @throws Exception excepción
     */
    public ActionForward eliminarVehiculo(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">Eliminar Vehiculo");
        }

        
        // Se obtienen los datos para procesar el registro
        FormaNuevoVehiculo forma = (FormaNuevoVehiculo)form;
 
        
        System.out.println("PLACAS ----> "+forma.getPlaca());
        ManejadorRegistroV mr = new ManejadorRegistroV();
        int resultado = mr.eliminarVehiculo(forma.getPlaca());

         return (mapping.findForward("exito"));
    }


}

