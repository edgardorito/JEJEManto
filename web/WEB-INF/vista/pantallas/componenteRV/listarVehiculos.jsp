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
 	  function ordenarPor (atributo) {
       var curp = document.getElementById('divSecret').value;
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("contenidoTabla").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              document.getElementById("contenidoTabla").innerHTML=xmlhttp.responseText;
            
          }
        };
        xmlhttp.open("GET","ordenarVehiculosPor.do?atributo="+atributo+"&curp="+curp,true);
        xmlhttp.send();
  
    }

     function buscar () {
       var curp = document.getElementById('curpB').value;
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("contenidoTabla").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
            document.getElementById('divSecret').value = document.getElementById('curpB').value; 
              document.getElementById("contenidoTabla").innerHTML=xmlhttp.responseText;
            
          }
        };
        xmlhttp.open("GET","BuscarVehiculo.do?curp="+curp,true);
        xmlhttp.send();
  
    }
    function eliminarV(placas) {
      
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
          
           }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              ordenarPor('tipo');
          }
        };
       
        xmlhttp.open("GET","EliminarVehiculo.do?placa="+placas,true);
        xmlhttp.send();
  
    }
    
 	  $(document).ready(function() {
    Materialize.updateTextFields();
  });
    </script>
        <c:import url="/WEB-INF/vista/comun/banner.jsp" />
        
        <input id="divSecret" style="display:none;"> 
          
        </input>
        <main >
        	  <div id="tableV">
        	<div class="input-field col s6">
        	
        		<div class="row">
        			<div class="col s3">
        				<input  value="${formaListadoVehiculos.curp}" id="curpB" name="curp" type="text" class="validate">
	          			<label for="curpB">Introduzca curp</label>
        			</div>
        			<div class="col s2">
        				<a class="btn waves-effect waves-light" onclick="buscar()">Buscar
                <i class="material-icons right">send</i> </a>
        			</div>
        		</div>
        		
	          
           
            
        	
	         
	        </div>

            
	        <table>
		        <thead>
		          <tr>
		              <th onclick="ordenarPor('tipo')"  data-field="tipo">tipo</th>
		              <th onclick="ordenarPor('modelo')"  data-field="modelo">modelo</th>
		              <th onclick="ordenarPor('marca')"  data-field="marca">marca</th>
		              <th onclick="ordenarPor('placa')"  data-field="placa">placa</th>
		              <th onclick="ordenarPor('color')"  data-field="color">color</th>
		           	  <th onclick="ordenarPor('curp')"  data-field="curp">curp</th>
                  <th data-field="eliminar">Eliminar</th>
                   <th data-field="editar">Editar</th>
		          </tr>
		        </thead>

		        <tbody id="contenidoTabla">
		        <c:forEach var="vehiculo" items="${formaListadoVehiculos.vehiculos}">
		        	 <tr>
			            <td><c:out value="${vehiculo.tipo}"/></td>
			            <td><c:out value="${vehiculo.modelo}"/></td>
			            <td><c:out value="${vehiculo.marca}"/></td>
			            <td><c:out value="${vehiculo.placa}"/></td>
			            <td><c:out value="${vehiculo.color}"/></td>
			            <td><c:out value="${vehiculo.curp}"/></td>
                  <td><i onclick="eliminarV('${vehiculo.placa}')" class="small material-icons">delete</i></td>
                  <td><a href="BuscarVehiculoPorPlaca.do?placa=${vehiculo.placa}"><i class="small material-icons">mode_edit</i></a></td>
			          </tr>
		        </c:forEach>
		         
		         
		        </tbody>
		      </table>
		       </div>
        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                
    </body>
</html>