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



public final class MCUEditarPerfil 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUEditarPerfil.class);

    public ActionForward procesarRegistroUsuario(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">procesarRegistroUsuario");
        }


        
        // Se obtienen los datos para procesar el registro
        FormaNuevoPerfil forma = (FormaNuevoPerfil)form;
        log.debug(">Javi");
        log.debug(">"+forma.getUsuario());
        Perfil perfil = new Perfil(forma.getUsuario(), forma.getContra(), forma.getNombre(),
                          forma.getApellido(), forma.getTelefono(), forma.getEmail(),
                          forma.getCp(), forma.getPais(), forma.getCiudad(), forma.getEstado());

        ManejadorPerfil mr = new ManejadorPerfil();
        int resultado = mr.crearPerfil(perfil);

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:   
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.nombreUsuarioYaExiste",
                                               forma.getUsuario()));                
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

     public ActionForward buscarCP(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">buscarCPs");
        }

    

        FormaNuevoPerfil forma = (FormaNuevoPerfil)form;
      
        ManejadorPerfil mr = new ManejadorPerfil();
        FormaListadoCP resultado = mr.getCPInfo(forma.getCp());

        ActionMessages errores = new ActionMessages();
        if (resultado != null) {
            
                forma.setEstado(resultado.getEstado());
                forma.setCiudad(resultado.getCiudad());
                System.out.println("exito");
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

