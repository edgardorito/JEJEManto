<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<c:forEach var="evento" items="${formaListadoEventos.eventos}">
                     <tr>
                        <td><c:out value="${evento.nombre}"/></td>
                        <td><c:out value="${evento.fecha}"/></td>
                        <td>
                        	<i onclick="editarE('${eventos.nombre}')" class="small material-icons">mode_edit</i>
                        	<i onclick="eliminarE('${eventos.nombre}')" class="small material-icons">delete</i>
                        </td>
                      </tr>
                </c:forEach>
                 