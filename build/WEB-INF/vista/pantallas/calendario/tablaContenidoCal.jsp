<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<c:forEach var="evento" items="${formaListadoEventos.eventos}">
                     <tr>
                        <td><c:out value="${evento.nombre}"/></td>
                        <td><c:out value="${evento.fecha}"/></td>
                        <td>
                        	<a href="BuscarEventoPorFecha.do?nombre=${evento.nombre}">
                  				<i  class="small material-icons">mode_edit</i>
                   			</a>
                        	<i onclick="eliminarE('${evento.nombre}')" class="small material-icons">delete</i>
                        </td>
                      </tr>
                </c:forEach>
                 