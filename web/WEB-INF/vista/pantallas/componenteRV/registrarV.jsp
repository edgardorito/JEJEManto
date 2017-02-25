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
            <div class="input-field col s12">
              <input id="nombreRV" type="text" class="validate">
              <label for="nombreRV">Nombre</label>
            </div>
        </div> 
        <div class="row">
            <div class="input-field col s12">
              <input id="apellidosRV" type="text" class="validate">
              <label for="apellidosRV">Apellidos</label>
            </div>
        </div>    
        <div class="row">
            <div class="input-field col s12">
              <input id="curpRV" type="text" class="validate">
              <label for="curpRV">Curp</label>
            </div>
        </div> 
        <div class="row">
            <div class="input-field col s12">
              <input id="tipoRV" type="text" class="validate">
              <label for="tipoRV">Tipo</label>
            </div>
        </div>  
        <div class="row">
            <div class="input-field col s12">
              <input id="modeloRV" type="text" class="validate">
              <label for="modeloRV">Modelo</label>
            </div>
        </div>   
         <div class="row">
            <div class="input-field col s12">
              <input id="marcaRV" type="text" class="validate">
              <label for="marcaRV">Marca</label>
            </div>
        </div> 
         <div class="row">
            <div class="input-field col s12">
              <input id="placaRV" type="text" class="validate">
              <label for="colorRV">Placa</label>
            </div>
        </div> 
         <div class="row">
            <div class="input-field col s12">
              <input id="placaRV" type="text" class="validate">
              <label for="colorRV">Color</label>
            </div>
        </div>   

        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                
    </body>
</html>
