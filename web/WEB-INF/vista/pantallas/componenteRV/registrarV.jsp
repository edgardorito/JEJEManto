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
          <form id="forma" action="procesarRegistroV.do" method="post">
            <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                  <input value="${formaNuevoVehiculo.curp}" id="curpRV" name="curp" type="text" class="validate">
                  <label for="curpRV">Curp</label>
                </div>
            </div> 
            <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                  <input value="${formaNuevoVehiculo.tipo}" id="tipoRV" name="tipo" type="text" class="validate">
                  <label for="curpRV">Tipo</label>
                </div>
            </div> 
  <!--        <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                    <select>
                        <option value="" disabled selected>Elige una opcion</option>
                        <option value="Automovil">Automovil</option>
                        <option value="Motocicleta">Motocicleta</option>
                       
                    </select>
                    <label>Tipo</label>
                </div>
            </div>  -->
            <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                  <input value="${formaNuevoVehiculo.modelo}" id="modeloRV"  name="modelo" type="text" class="validate">
                  <label for="modeloRV">Modelo</label>
                </div>
            </div>   
             <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                  <input value="${formaNuevoVehiculo.marca}" id="marcaRV" name="marca" type="text" class="validate">
                  <label for="marcaRV">Marca</label>
                </div>
            </div> 
             <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                  <input value="${formaNuevoVehiculo.placa}" id="placaRV" name="placa" type="text" class="validate">
                  <label for="colorRV">Placa</label>
                </div>
            </div> 
             <div class="row">
                <div class="input-field col s6  l6 offset-l3">
                  <input value="${formaNuevoVehiculo.color}" id="colorRV" name="color" type="text" class="validate">
                  <label for="colorRV">Color</label>
                </div>
            </div>   
            <div class="row">
              <input type="submit" 
                           name="submit"
                           value="Guardar"/>
            </div>
            </form>
        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                
    </body>
</html>
