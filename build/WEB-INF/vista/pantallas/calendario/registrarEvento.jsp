<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>JEJE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />
    </head>
    <body>
    <script type="text/javascript">
                $(document).ready(function() {
          Materialize.updateTextFields();
        });
    </script>
       <c:import url="/WEB-INF/vista/comun/banner.jsp" />
       <main>
       <div class="row">
        <div class="col offset-s4 s4">
           <form class="col s12" action="procesarRegistroEvento.do" method="post">
             <div class="row">
               <div class="input-field col s12 m12 l12">
                 <i class="material-icons prefix">account_circle</i><br>
                 <input placeholder="Nombre del evento" id="nombreEvento" type="text" class="validate"
                   name="nombre" value="${formaNuevoEvento.nombre}">
               </div>
              </div>
              <div class="row"></div>
              <div class="row">
                 <div class="input-field col s12 m12 l12">
                   <i class="material-icons prefix">alarm_on</i><br>
                   <input placeholder="Fecha del evento" id="fechaEvento" type="date" class="validate "
                     name="fecha" value="${formaNuevoEvento.fecha}">
                 </div>
              </div>
              <center>
                  <button class="btn waves-effect waves-light" type="submit" name="submit" >Registrar</button>

              </center> 

        </div>
           </form>
        </div>
       </div>
       </main>
       <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>
