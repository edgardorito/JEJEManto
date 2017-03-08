package edu.uag.iidis.scec.control;

import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.servicios.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;



public final class MCUEliminarPerfil 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCUEditarPerfil.class);


     public ActionForward procesarEliminarPerfil(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        HttpServletRequest req = (HttpServletRequest) request; 
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user"); 

        if (log.isDebugEnabled()) {
            log.debug(">Eliminar Perfil");
        }

        
        // Se obtienen los datos para procesar el registro
        FormaNuevoPerfil forma = (FormaNuevoPerfil)form;
 
        
        System.out.println("Usuario ----> "+user.getUsername());
        ManejadorPerfil mr = new ManejadorPerfil();
        int resultado = mr.eliminarPerfil(user.getUsername());

         return (mapping.findForward("exito"));
    }
}