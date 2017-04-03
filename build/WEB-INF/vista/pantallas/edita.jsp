<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Perfil</title>
         <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />

        <link rel="stylesheet" type="text/css" href="css/plantilla.css">
    </head>
	
    <body>
     <script type="text/javascript">
  
    function buscarC () {
        var valor = document.getElementById("icon_cp").value;
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("busquedaCP").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              document.getElementById("busquedaCP").innerHTML=xmlhttp.responseText;
             document.getElementById("pais").value ="USA"; 
          }
        };
        xmlhttp.open("GET","buscarCPs.dd?cp="+valor,true);
        xmlhttp.send();
  
    }
     function save () {
        var usuario = document.getElementById("usuario").value;
        var contrasena = document.getElementById("contrasena").value;
        var nombre = document.getElementById("nombre").value;
        var apellido = document.getElementById("apellido").value;
        var telefono = document.getElementById("telefono").value;
        var email = document.getElementById("email").value;
        var valor = document.getElementById("icon_cp").value;
        var pais = document.getElementById("pais").value;
        var ciudad = document.getElementById("ciudad").value;
         var estado = document.getElementById("estado").value;
       
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("busquedaCP").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              alert("Se han guardado los cambios");
               usuario = "";
               contrasena = "";
               nombre = "";
               apellido = "";
               telefono ="";
               email = "";
               cp = "";
               pais = "";
               ciudad = "";
                estado = "";
          }
        };
        console.log("do");
        console.log("ciudad: " +ciudad+"  pais: "+pais+" estado "+estado);
        console.log("procesarEditarPerfil.do?cp="+valor
          +"&usuario="+usuario+"&contra="+contrasena+"&nombre="+nombre+"&apellido="+apellido+"&telefono="+telefono+"&email="+email+"&pais="+pais+"&ciudad="+ciudad+"&estado="+estado);
        xmlhttp.open("GET","procesarEditarPerfil.do?cp="+valor
          +"&usuario="+usuario+"&contra="+contrasena+"&nombre="+nombre+"&apellido="+apellido+"&telefono="+telefono+"&email="+email+"&pais="+pais+"&ciudad="+ciudad+"&estado="+estado,true);
        xmlhttp.send();
  
    }
    </script>
    <c:import url="/WEB-INF/vista/comun/banner.jsp" />
    <main>
    <div class="row">
    
        <div  class="col s12" >
         <c:forEach var="perfil" items="${formaListadoPerfil.perfiles}">
                        
                   
          <div class="row">
          <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_box</i>
              <input disabled="disabled" placeholder="Usuario" id="usuario" type="text" class="validate"
              value="${perfil.usuario}" name="usuario">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_box</i>
              <input required placeholder="Contraseña" id="contrasena" type="password" class="validate"
              value="${perfil.contra}" name="contra">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_circle</i>
              <input required placeholder="Nombre (s)" id="nombre" type="text" class="validate"
              value="${perfil.nombre}" name="nombre">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">account_circle</i>
              <input required placeholder="Apellido (s)" id="apellido" type="text" class="validate"
              value="${perfil.apellido}" name="apellido">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">phone</i>
              <input required placeholder="Telefono" id="telefono" type="number" class="validate"
              value="${perfil.telefono}" name="telefono">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">email</i>
              <input required placeholder="E-mail" id="email" type="email" class="validate"
              value="${perfil.email}" name="email">
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">book</i>
              <input required style="float: left;" type="number" placeholder="C.P." id="icon_cp" class="validate" value="${perfil.cp}" name="cp">
              <a onclick="buscarC()" style="position: absolute; right: 5%;"><i class="material-icons prefix">search</i></a>
            </div>
            <div class="input-field col s12 m12 l6">
              <i class="material-icons prefix">collections_bookmark</i>
              <input placeholder="Pais" disabled="disabled" id="pais" type="text" class="validate" value="${perfil.pais}" name="pais">
            </div>
           <div id="busquedaCP">
              <div class="input-field col s12 m12 l6">
                <i class="material-icons prefix">collections_bookmark</i>
                <input placeholder="Ciudad" disabled="disabled" id="ciudad" type="text" class="validate" value="${perfil.ciudad}" name="ciudad">
              </div>
               <div class="input-field col s12 m12 l6">
                <i class="material-icons prefix">collections_bookmark</i>
                <input placeholder="Estado" disabled="disabled" id="estado" type="text" class="validate" value="${perfil.estado}" name="estado">
              </div>
           </div>
          </div>
          <center>
            <button class="btn waves-effect waves-light" onclick="save()" name="action">Guardar
                <i class="material-icons right">send</i>
            </button>
            
            </center>
             </c:forEach>
        </div>
        
      </div>
      </main>
      <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>
