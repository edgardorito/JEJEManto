<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<c:forEach var="evento" items="${formaListadoEventos.eventos}">
                     <tr>
                        <td><c:out value="${evento.nombre}"/></td>
                        <td><c:out value="${evento.fecha}"/></td>
                      </tr>
                </c:forEach>
                 