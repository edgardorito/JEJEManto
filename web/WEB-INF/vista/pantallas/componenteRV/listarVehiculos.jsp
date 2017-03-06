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
 
 	  $(document).ready(function() {
    Materialize.updateTextFields();
  });
    </script>
        <c:import url="/WEB-INF/vista/comun/banner.jsp" />
        
       
        <main >
        	  <div id="tableV">
        	<div class="input-field col s6">
        	<form id="forma"  action="BuscarVehiculo.do" method="post">
        		<div class="row">
        			<div class="col s3">
        				<input  value="${formaListadoVehiculos.curp}" id="curpB" name="curp" type="text" class="validate">
	          			<label for="curpB">Introduzca curp</label>
        			</div>
        			<div class="col s2">
        				<button class="btn waves-effect waves-light" type="submit" name="action">Buscar
                <i class="material-icons right">send</i>
        			</div>
        		</div>
        		
	          
            </button>
            
        	</form>
	         
	        </div>

            
	        <table>
		        <thead>
		          <tr>
		              <th data-field="tipo">tipo</th>
		              <th data-field="modelo">modelo</th>
		              <th data-field="marca">marca</th>
		              <th data-field="placa">placa</th>
		              <th data-field="color">color</th>
		           	  <th data-field="curp">curp</th>
		          </tr>
		        </thead>

		        <tbody>
		        <c:forEach var="vehiculo" items="${formaListadoVehiculos.vehiculos}">
		        	 <tr>
			            <td><c:out value="${vehiculo.tipo}"/></td>
			            <td><c:out value="${vehiculo.modelo}"/></td>
			            <td><c:out value="${vehiculo.marca}"/></td>
			            <td><c:out value="${vehiculo.placa}"/></td>
			            <td><c:out value="${vehiculo.color}"/></td>
			            <td><c:out value="${vehiculo.curp}"/></td>
			          </tr>
		        </c:forEach>
		         
		         
		        </tbody>
		      </table>
		       </div>
        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                
    </body>
</html>