<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

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
                 