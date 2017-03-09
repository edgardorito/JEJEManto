<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
{
<c:forEach var="vehiculo" items="${formaListadoVehiculos.vehiculos}">
    '<c:out value="${vehiculo.curp}"/> ' : null,         
</c:forEach>
}
                 