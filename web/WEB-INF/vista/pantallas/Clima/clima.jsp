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
                      <label for="ciudad">ciudad</label>
                      <input type="submit">
                    
                </div>
              </div>
              <a class="waves-effect waves-light btn-large"><i class="material-icons left">search</i>buscar</a>
            </form>
          </div>

          <!--Mostrar ciudades-->
          <ul class="collapsible" data-collapsible="accordion">
              <li>
                <div id="name_ciudad" class="collapsible-header"><span class="badge"></span><i class="material-icons">place</i></div>
                <div class="collapsible-body">
                    <p><span id="temp"></span></p>
                </div>
              </li>
          </ul>


        <!--Script para obtener datos de clima-->
        <script type="text/javascript">
            
        var clima = new XMLHttpRequest();
        clima.open("GET", "http://api.wunderground.com/api/6ba55446fea34e0a/conditions/q/CA/San_Francisco.json", false);
        clima.send(null);

        var r = JSON.parse(clima.response);
        var clima =  r.current_observation.display_location.full + " "+"<br />";
        var pais =   r.current_observation.display_location.country + "<br />";
        var conjunto = clima + pais;
        var temperatura = r.current_observation.temperature_string + "<br />";

        document.getElementById("name_ciudad").innerHTML = conjunto;
        document.getElementById("temp").innerHTML = temperatura;

        function buscarCiudad(){
            var valor = document.getElementById("ciudad_buscador");

        }


        </script>
        </main>
       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>