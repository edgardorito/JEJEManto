<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />        
    </head>
  
    <body>
        <c:import url="/WEB-INF/vista/comun/banner.jsp" /> 

        <script type="text/javascript">

        function editar(){
          //var ciudad = document.getElementById('ciudad_buscador').value;
           var ciudad = document.getElementById('ciudad_buscador').value;
           var latitud = document.getElementById('ciudad_latitud').value;
           var longitud = document.getElementById('ciudad_longitud').value;
           document.getElementById('ciudad_buscador').value = "";
           alert(ciudad);
            var xmlhttp=new XMLHttpRequest();
                        
            xmlhttp.onreadystatechange=function(){
              if(xmlhttp.status==404){
                  document.getElementById("contenidoTabla").innerHTML="Page not found";
              }
              if (xmlhttp.readyState==4 && xmlhttp.status==200){
                  document.getElementById("contenidoTabla").innerHTML="El estado se edito correctamente";
                
              }
            };
            xmlhttp.open("GET","procesarEditarClima.do?ciudad="+ciudad+"&"+"latitud="+latitud+"&"+"longitud="+longitud,true);
            xmlhttp.send();
        }

        </script>
         
        <main>
      <div class="row">
            <form class="col s12" method="post">
              <div class="row">
                <div class="input-field col s10">
                    <i class="material-icons prefix">location_on</i>
                     <input required value="${formaNuevoClima.ciudad}" name="ciudad" id="ciudad_buscador" type="text" class="validate">
                     <label for="latitud">ciudad</label>
                </div>

                <div class="input-field col s10">
                     <i class="material-icons prefix">location_on</i>
                     <input required value="${formaNuevoClima.latitud}" name="latitud" id="ciudad_latitud" type="text" class="validate">
                     <label for="latitud">latitud</label>
                </div>

                <div class="input-field col s10">
                     <i class="material-icons prefix">location_on</i>
                     <input required value="${formaNuevoClima.longitud}" name="longitud" id="ciudad_longitud" type="text" class="validate">
                     <label for="longitud">longitud</label>
                </div>
                      <!--<input type="submit">-->
                <div class="input-field col s10">
                      <button onclick="editar()" class="btn waves-effect waves-light" type="submit" name="action">Modificar
                        <i class="material-icons right">mode_edit</i>
                      </button>
                </div>
                    
                </div>
              </div>
            </form>
          </div>

          
          <table>
            <thead>
             <!-- <tr>
                  <th data-field="ciudad">Ciudad</th>
                  <th data-field="latitud">Latitud</th>
                  <th data-field="longitud">Longitud</th>
                
              </tr>-->
            </thead>

            <tbody id="contenidoTabla">
            <c:forEach var="ciudad" items="${formaListadoClima.climas}">
               <tr>
                  <td><c:out value="${ciudad.ciudad}"/></td>
                  <td><c:out value="${ciudad.latitud}"/></td>
                  <td><c:out value="${ciudad.longitud}"/></td>
                </tr>
            </c:forEach>
            
             
            </tbody>
         </table>

        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                
    </body>
</html>