<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Perfil</title>
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />

        <link rel="stylesheet" type="text/css" href="css/plantilla.css">
    </head>
	
    <body>
    <c:import url="/WEB-INF/vista/comun/banner.jsp" />
    <div class="row">
        <form  id="forma" class="col s12" action="procesarRegistroUsuario.do" method="post">
          <div class="row">
          <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_box</i>
              <input required placeholder="Usuario" id="icon_prefix" type="text" class="validate"
              value="${formaNuevoPerfil.usuario}" name="usuario">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_box</i>
              <input required placeholder="Contraseña" id="icon_prefix" type="password" class="validate"
              value="${formaNuevoPerfil.contra}" name="contra">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_circle</i>
              <input required placeholder="Nombre (s)" id="icon_name" type="text" class="validate"
              value="${formaNuevoPerfil.nombre}" name="nombre">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_circle</i>
              <input required placeholder="Apellido (s)" id="icon_lastname" type="text" class="validate"
              value="${formaNuevoPerfil.apellido}" name="apellido">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">phone</i>
              <input required placeholder="Telefono" id="icon_telephone" type="number" class="validate"
              value="${formaNuevoPerfil.telefono}" name="telefono">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">email</i>
              <input required placeholder="E-mail" id="icon_email" type="email" class="validate"
              value="${formaNuevoPerfil.email}" name="email">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">book</i>
              <input required style="float: left;" type="number" placeholder="C.P." id="icon_cp" class="validate" value="${formaNuevoPerfil.cp}" name="cp">
              <a style="position: absolute; right: 5%;" href=""><i class="material-icons prefix">search</i></a>
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">collections_bookmark</i>
              <input placeholder="Pais" disabled="disabled" id="icon_country" type="text" class="validate" value="${formaNuevoPerfil.pais}" name="pais">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">collections_bookmark</i>
              <input placeholder="Ciudad" disabled="disabled" id="icon_city" type="text" class="validate" value="${formaNuevoPerfil.ciudad}" name="ciudad">
            </div>
             <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">collections_bookmark</i>
              <input placeholder="Estado" disabled="disabled" id="icon_country" type="text" class="validate" value="${formaNuevoPerfil.estado}" name="estado">
            </div>
          </div>
          <center>
            <button class="btn waves-effect waves-light" type="submit" name="action">Guardar
                <i class="material-icons right">send</i>
            </button>
            
            </center>
        </form>
        
      </div>
      <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>
