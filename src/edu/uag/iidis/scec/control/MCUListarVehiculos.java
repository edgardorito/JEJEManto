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



public final class MCUListarVehiculos
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUListarVehiculos.class);


    public ActionForward solicitarListarVehiculos(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarListarVehiculos");
        }


        FormaListadoVehiculos forma = (FormaListadoVehiculos)form;

        ManejadorRegistroV mr = new ManejadorRegistroV();
        Collection resultado = mr.listarVehiculos();

        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            if ( resultado.isEmpty() ) {
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.registroVacio"));
                saveErrors(request, errores);
            } else {

                forma.setVehiculos(resultado);
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
    
    public ActionForward listarVehiculosPor(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarBuscarVehculo");
        }

        FormaListadoVehiculos forma = (FormaListadoVehiculos)form;

        ManejadorRegistroV mr = new ManejadorRegistroV();
        Collection resultado = mr.listarVehiculosPor(forma.getAtributo(),forma.getCurp());
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
                forma.setVehiculos( resultado );
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
    public ActionForward BuscarVehiculo(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarBuscarVehculo");
        }

        FormaListadoVehiculos forma = (FormaListadoVehiculos)form;

        ManejadorRegistroV mr = new ManejadorRegistroV();
        Collection resultado = mr.listarVehiculosPorCurp(forma.getCurp());
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
                forma.setVehiculos( resultado );
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
    public ActionForward listarVehiculosPorPlacas(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarBuscarVehculo");
        }

        FormaNuevoVehiculo forma = (FormaNuevoVehiculo)form;

        ManejadorRegistroV mr = new ManejadorRegistroV();
        Vehiculo a = mr.listarVehiculosPorPlacas(forma.getPlaca());
        
        forma.setTipo(a.getTipo());
        forma.setModelo(a.getModelo());
        forma.setMarca(a.getMarca());
        forma.setPlaca(a.getPlaca());
        forma.setColor(a.getColor());
        forma.setCurp(a.getCurp());
     
            return (mapping.findForward("exito"));
        

    }
}