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
  
   
     function save () {
        var curp = document.getElementById("curp").value;
        var tipo = document.getElementById("tipo").value;
        var modelo = document.getElementById("modelo").value;
        var marca = document.getElementById("marca").value;
        var placa = document.getElementById("placa").value;
        var color = document.getElementById("color").value;
      alert("placa");
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("busquedaCP").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              alert("Se ha actualizado el vehiculo");
          }
        };
        console.log("placa: "+placa);
        xmlhttp.open("GET","actualizarVehiculo.do?curp="+curp+"&tipo="+tipo+"&modelo="+modelo+"&marca="+marca+"&placa="+placa+"&color="+color,true);
        xmlhttp.send();
  
    }
    </script>
        <c:import url="/WEB-INF/vista/comun/banner.jsp" />
        
         
        <main>
          <div >
            <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                  <input value="${formaNuevoVehiculo.curp}" id="curp" name="curp" type="text" class="validate">
                  <label for="curpRV">Curp</label>
                </div>
            </div> 
            <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                  <input value="${formaNuevoVehiculo.tipo}" id="tipo" name="tipo" type="text" class="validate">
                  <label for="tipoRV">Tipo</label>
                </div>
            </div> 
  <!--        <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                    <select>
                        <option value="" disabled selected>Elige una opcion</option>
                        <option value="Automovil">Automovil</option>
                        <option value="Motocicleta">Motocicleta</option>
                       
                    </select>
                    <label>Tipo</label>
                </div>
            </div>  -->
            <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                  <input value="${formaNuevoVehiculo.modelo}" id="modelo"  name="modelo" type="text" class="validate">
                  <label for="modeloRV">Modelo</label>
                </div>
            </div>   
             <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                  <input value="${formaNuevoVehiculo.marca}" id="marca" name="marca" type="text" class="validate">
                  <label for="marcaRV">Marca</label>
                </div>
            </div> 
             <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                  <input value="${formaNuevoVehiculo.placa}" id="placa"  name="placa" type="text" disabled="disabled" class="validate">
                  <label for="colorRV">Placa</label>
                </div>
            </div> 
             <div class="row">
                <div class="input-field col s6  l3 offset-l5">
                  <input value="${formaNuevoVehiculo.color}" id="color" name="color" type="text" class="validate">
                  <label for="colorRV">Color</label>
                </div>
            </div>   
            <div class="row">
            <center>
               <button class="btn waves-effect waves-light" onclick="save()">Guardar
                <i class="material-icons right">Guardar</i>
            </button>
            </center>
           
          <!--    <input type="submit" 
                           name="submit"
                           value="Guardar"/>-->
            </div>
            </div>
        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                
    </body>
</html>
