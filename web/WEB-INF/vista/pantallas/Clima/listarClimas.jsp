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
         
        <main>
        	
	        <table>
		        <thead>
		          <tr>
		              <th data-field="ciudad">Ciudad</th>
		              <th data-field="latitud">Latitud</th>
		              <th data-field="longitud">Longitud</th>
		            
		          </tr>
		        </thead>

		        <tbody>
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