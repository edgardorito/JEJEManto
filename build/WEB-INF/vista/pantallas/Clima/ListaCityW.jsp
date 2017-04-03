<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

				<c:forEach var="ciudad" items="${formaListadoClima.climas}">
		        	 <tr>
			            <td><c:out value="${ciudad.ciudad}"/></td>
			    		<td><c:out value="${ciudad.latitud}"/></td>
			    		<td><c:out value="${ciudad.longitud}"/></td>
			          </tr>
		        </c:forEach>