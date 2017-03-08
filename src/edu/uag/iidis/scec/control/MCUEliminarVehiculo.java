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



public final class MCUEliminarVehiculo 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUEliminarVehiculo.class);


    
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
 
        String a = forma.getCurp();
        String b =forma.getTipo();
        String c = forma.getModelo();
        String d = forma.getMarca();
        String e = forma.getPlaca();
        String f = forma.getColor();
        Vehiculo vehiculo = new Vehiculo(
                       a,b,c,d,e,f
        );
         

        ManejadorRegistroV mr = new ManejadorRegistroV();
        int resultado = mr.eliminarVehiculo(vehiculo);

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:   
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.No se pudo eliminar Vehiculo",
                                               forma.getPlaca()));                
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

