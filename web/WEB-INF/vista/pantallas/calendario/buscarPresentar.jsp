<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />
    </head>

    <body>
      <script type="text/javascript">
           function buscar () {
             var fecha = document.getElementById('fechaB').value;
             var xmlhttp=new XMLHttpRequest();

             xmlhttp.onreadystatechange=function(){
              if(xmlhttp.status==404){
                document.getElementById("contenidoTabla").innerHTML="Page not found";
              }
              if (xmlhttp.readyState==4 && xmlhttp.status==200){
                document.getElementById("contenidoTabla").innerHTML=xmlhttp.responseText;
                
              }
            };
            xmlhttp.open("GET","BuscarEvento.do?fecha="+fecha,true);
            xmlhttp.send();

          }

          function ordenarPor (atributo) {

            var xmlhttp=new XMLHttpRequest();

            xmlhttp.onreadystatechange=function(){
              if(xmlhttp.status==404){
                document.getElementById("contenidoTabla").innerHTML="Page not found";
              }
              if (xmlhttp.readyState==4 && xmlhttp.status==200){
                document.getElementById("contenidoTabla").innerHTML=xmlhttp.responseText;

              }
            };
            xmlhttp.open("GET","ordenarEventosPor.do?atributo="+atributo,true);
            xmlhttp.send();

          }
          function eliminarE (nombre) {
            var xmlhttp=new XMLHttpRequest();

            xmlhttp.onreadystatechange=function(){
              if(xmlhttp.status==404){

              }
              if (xmlhttp.readyState==4 && xmlhttp.status==200){
                ordenarPor('nombre');
              }
            };

            xmlhttp.open("GET","EliminarEvento.do?nombre="+nombre,true);
            xmlhttp.send();

          }
              
          $(document).ready(function() {
          Materialize.updateTextFields();
        });
      </script>
      <c:import url="/WEB-INF/vista/comun/banner.jsp" />
       <main>
        <div id="tableE">
        <div class="input-field col s6">
          <div class="row">
              <div class="col s3">
                <input placeholder="Buscar fecha" id="fechaB" type="date" class="validate"
                  name="nombre" value="${formaListadoEventos.fecha}">
              </div>
              <div class="col s2">
                <a class="btn waves-effect waves-light" onclick="buscar()">Buscar
                  <i class="material-icons right">send</i> </a>
              </div>
            </div>
          </div>
         <table class="centered">
           <thead>
             <tr>
                 <th  onclick="ordenarPor('nombre')" data-field="nombre">Nombre del evento</th>
                 <th  onclick="ordenarPor('fecha')" data-field="fecha">Fecha</th>
             </tr>
           </thead>

           <tbody id="contenidoTabla" >
           <c:forEach var="eventos" items="${formaListadoEventos.eventos}">
              <tr>
                <td><c:out value="${eventos.nombre}"/></td>
                <td><c:out value="${eventos.fecha}"/></td>
                <td>
                <a href="BuscarEventoPorFecha.do?nombre=${eventos.nombre}">
                  <i  class="small material-icons">mode_edit</i>
                </a>
                  <i onclick="eliminarE('${eventos.nombre}')" class="small material-icons">delete</i>
                </td>
               </tr>
           </c:forEach>
           </tbody>
         </table>
          </div>
       </main>
       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>
