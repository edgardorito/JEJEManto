<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
{
<c:forEach var="vehiculo" items="${formaListadoVehiculos.vehiculos}" varStatus="loop">
    "<c:out value="${vehiculo.curp}"/> " : null <c:if test="${!loop.last}">,</c:if>   
</c:forEach>
}
                 