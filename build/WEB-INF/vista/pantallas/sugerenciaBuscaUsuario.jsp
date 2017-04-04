<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
{
<c:forEach var="perfil" items="${formaListadoPerfil.perfiles}" varStatus="loop">
    "<c:out value="${perfil.usuario}"/> " : null <c:if test="${!loop.last}">,</c:if>   
</c:forEach>
}
                 