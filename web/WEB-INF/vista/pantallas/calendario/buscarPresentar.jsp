<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />
    </head>

    <body>
       <c:import url="/WEB-INF/vista/comun/banner.jsp" />
       <main>
         <i class="material-icons prefix">search</i><br>
         <input placeholder="Buscar fecha " id="nombreEvento" type="date" class="col s12 validate datepicker"
         name="nombre" value="${formaNuevoEvento.nombre}">
         <table>
           <thead>
             <tr>
                 <th data-field="tipo">Nombre del evento</th>
                 <th data-field="modelo">Fecha</th>
             </tr>
           </thead>

           <tbody>
           <c:forEach var="eventos" items="${formaListadoEventos.eventos}">
              <tr>
                 <td><c:out value="${eventos.nombre}"/></td>
                 <td><c:out value="${eventos.fecha}"/></td>
               </tr>
           </c:forEach>


           </tbody>
         </table>
       </main>
       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>