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
        <main>
        <div class="row">
            <form class="col s12" action="procesarRegistroClima.do" method="post">
              <div class="row">
                <div class="input-field col s10">

                <i class="material-icons prefix">location_on</i>
                     <input value="${formaNuevoClima.ciudad}" name="ciudad" id="ciudad_buscador" type="text" class="validate">
                     <label for="latitud">ciudad</label>

                <i class="material-icons prefix">location_on</i>
                     <input value="${formaNuevoClima.latitud}" name="latitud" id="ciudad_latitud" type="text" class="validate">
                     <label for="latitud">latitud</label>

                <i class="material-icons prefix">location_on</i>
                     <input value="${formaNuevoClima.longitud}" name="longitud" id="ciudad_longitud" type="text" class="validate">
                     <label for="longitud">longitud</label>
                      <!--<input type="submit">-->
                      <button class="btn waves-effect waves-light" type="submit" name="action">Agregar
                        <i class="material-icons right">send</i>
                      </button>
                    
                </div>
              </div>
            </form>
            <form action="solicitarListarClimas.do">
               <button class="btn waves-effect waves-light" type="submit" name="action">Listar
                 <i class="material-icons right">reorder</i>
                </button>
            </form>
          </div>

          <!--Mostrar ciudades-->
        

        <!--Script para obtener datos de clima-->
        </main>
       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>