<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 

         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />

        <link rel="stylesheet" type="text/css" href="css/plantilla.css">
    </head>
	
    <body>
       <c:import url="/WEB-INF/vista/comun/banner.jsp" />
        <!--contenido-->

        <!--Formulario de Ciudad-->

        <div class="row">
            <form class="col s12">
              <div class="row">
                <div class="input-field col s10">
                  <i class="material-icons prefix">location_on</i>
                  <input id="ciudad" type="text" class="validate">
                  <label for="ciudad">ciudad</label>
                </div>
              </div>
            </form>
          </div>


       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>