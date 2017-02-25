<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Editar Perfil</title>
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />

        <link rel="stylesheet" type="text/css" href="css/plantilla.css">
    </head>
	
    <body>
    <c:import url="/WEB-INF/vista/comun/banner.jsp" />
    <div class="row">
        <form class="col s12">
          <div class="row">
          <div class="input-field col s12 m12 l12">
              <i class="material-icons prefix">account_box</i>
              <input placeholder="Usuario" disabled="disabled" id="icon_prefix" type="text" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_circle</i>
              <input placeholder="Nombre (s)" id="icon_name" type="text" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_circle</i>
              <input placeholder="Apellido (s)" id="icon_lastname" type="text" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">phone</i>
              <input placeholder="Telefono" id="icon_telephone" type="number" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">email</i>
              <input placeholder="E-mail" id="icon_email" type="email" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">book</i>
              <input style="float: left;" type="number" placeholder="C.P." id="icon_cp" class="validate">
              <a style="position: absolute; right: 5%;" href=""><i class="material-icons prefix">search</i></a>
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">collections_bookmark</i>
              <input placeholder="Pais" disabled="disabled" id="icon_country" type="text" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">collections_bookmark</i>
              <input placeholder="Ciudad" disabled="disabled" id="icon_city" type="text" class="validate">
            </div>
            <div class="input-field col s12 m12 l6">
              <select class="browser-default">
                <option value="" disabled selected>Colonia</option>
                <option value=""></option>
              </select>
            </div>
          </div>
          <center>
            <button class="btn waves-effect waves-light" type="submit" name="action">Guardar
                <i class="material-icons right">send</i>
            </button>
            </center>
        </form>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
      </div>
    </body>
</html>
