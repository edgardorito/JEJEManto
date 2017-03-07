    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>

<c:forEach var="perfil" items="${formaListadoPerfil.perfiles}">
                        <tr>
                            <td><c:out value="${perfil.usuario}"/></td>
                            <td><c:out value="${perfil.nombre}"/></td>
                            <td><c:out value="${perfil.apellido}"/></td>
                            <td><c:out value="${perfil.telefono}"/></td>
                            <td><c:out value="${perfil.email}"/></td>
                            <td><c:out value="${perfil.cp}"/></td>
                            <td><c:out value="${perfil.pais}"/></td>
                            <td><c:out value="${perfil.ciudad}"/></td>
                            <td><c:out value="${perfil.estado}"/></td>
                        </tr>
</c:forEach>