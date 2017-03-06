    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>

    <!DOCTYPE html>
    <html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <c:import url="/WEB-INF/vista/comun/importaciones.jsp"/>
    </head>
    <body>
        <c:import url="/WEB-INF/vista/comun/banner.jsp"/>
        <main>
            <div style="overflow: scroll; height: 490px;">
            <table>
                <thead>
                    <tr>
                        <th data-field="usuario">usuario</th>
                        <th data-field="nombre">nombre</th>
                        <th data-field="apellido">apellido</th>
                        <th data-field="telefono">telefono</th>
                        <th data-field="email">email</th>
                        <th data-field="cp">cp</th>
                        <th data-field="pais">pais</th>
                        <th data-field="ciudad">ciudad</th>
                        <th data-field="estado">estado</th>
                    </tr>
                </thead>

                <tbody>
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
                </tbody>
            </table>
            </div>
        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp"/>
    </body>
    </html>