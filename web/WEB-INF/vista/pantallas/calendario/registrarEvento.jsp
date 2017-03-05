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

       <div class="row">
         <form class="col s12" action="procesarRegistroEvento.do" method="post">
           <div class="row">
             <div class="col s12"></div>
             <div class="input-field col s12">
               <i class="material-icons prefix">account_circle</i><br>
               <input placeholder="Nombre del evento" id="nombreEvento" type="text" class="col s12 validate"
                 name="nombre" value="${formaNuevoEvento.nombre}">
             </div>
             <div class="col s12"></div>
             <div class="input-field col s12">
               <i class="material-icons prefix">alarm_on</i><br>
               <!-- datepicker -->
               <input placeholder="Fecha del evento" id="fechaEvento" type="text" class="col s12 validate "
                 name="fecha" value="${formaNuevoEvento.fecha}">
             </div>
             <div class="col s12"></div>
           </div>
           <input type="submit" name="submit" value="Registrar"/>
         </form>
       </div>

       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>
