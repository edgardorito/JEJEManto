
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />        
    </head>
	
    <body>
        <c:import url="/WEB-INF/vista/comun/banner.jsp" /> 

        <script type="text/javascript">
        	
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
		        xmlhttp.open("GET","ordenarClimaPor.do?atributo="+atributo,true);
		        xmlhttp.send();
	  
	    	}


	    	function buscar () {
		       var ciudad = document.getElementById('ciudad').value;
		       document.getElementById('ciudad').value = "";
		        var xmlhttp=new XMLHttpRequest();
		                    
		        xmlhttp.onreadystatechange=function(){
		          if(xmlhttp.status==404){
		              document.getElementById("contenidoTabla").innerHTML="Page not found";
		          }
		          if (xmlhttp.readyState==4 && xmlhttp.status==200){
		              document.getElementById("contenidoTabla").innerHTML=xmlhttp.responseText;
		            
		          }
		        };
		        xmlhttp.open("GET","BuscarClima.do?ciudad="+ciudad,true);
		        xmlhttp.send();
		  
		    }

		    function eliminar () {
		       var ciudad = document.getElementById('ciudad').value;
		       document.getElementById('ciudad').value = "";
		        var xmlhttp=new XMLHttpRequest();
		                    
		        xmlhttp.onreadystatechange=function(){
		          if(xmlhttp.status==404){
		              document.getElementById("contenidoTabla").innerHTML="Page not found";
		          }
		          if (xmlhttp.readyState==4 && xmlhttp.status==200){
		              //document.getElementById("contenidoTabla").innerHTML="El estado se elimino correctamente";
		            
		          }
		        };
		        xmlhttp.open("GET","EliminarClima.do?ciudad="+ciudad,true);
		        xmlhttp.send();
		  
		    }
        </script>
         
        <main>

        <div class="row">
        	<form class="col s12">
        		<div class="row">
        			<div class="input-field col s6">
        				<input required value="${FormaListadoClima.ciudad}" name="" id="ciudad" type="text" class="validate">
        			</div>
        			<div class="input-field col s6">
        				 <button onclick="buscar()" class="btn waves-effect waves-light" type="submit" name="action">Buscar
				           <i class="material-icons right">search</i>
				        </button>

				        <button onclick="eliminar()" class="btn waves-effect waves-light" type="submit" name="action">Eliminar
				           <i class="material-icons right">delete</i>
				        </button>
        			</div>
        		</div>
        	</form>
        </div>

        <!--
        <div class="input-field col s8">
	        <input value="${FormaListadoClima.ciudad}" name="" id="ciudad" type="text" class="validate">

	        <button onclick="buscar()" class="btn waves-effect waves-light" type="submit" name="action">Buscar
	           <i class="material-icons right">send</i>
	        </button>

	        <button onclick="eliminar()" class="btn waves-effect waves-light" type="submit" name="action">Eliminar
	           <i class="material-icons right">send</i>
	        </button>
	    </div>
	    -->
        	
	        <table>
		        <thead>
		          <tr>
		              <th onclick="ordenarPor('ciudad')" data-field="ciudad">Ciudad</th>
		              <th onclick="ordenarPor('latitud')" data-field="latitud">Latitud</th>
		              <th onclick="ordenarPor('longitud')" data-field="longitud">Longitud</th>
		            
		          </tr>
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