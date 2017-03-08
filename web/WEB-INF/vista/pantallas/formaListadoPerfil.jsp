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
    <script type="text/javascript">
  
    function buscarUsuario () {
        var valor = document.getElementById("user").value;
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("contPerfil").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              document.getElementById("contPerfil").innerHTML=xmlhttp.responseText;
          }
        };
        xmlhttp.open("GET","buscarUser.dd?usuario="+valor,true);
        xmlhttp.send();
  
    }

    function ordenarPor (atributo) {
       
        var xmlhttp=new XMLHttpRequest();
                    
        xmlhttp.onreadystatechange=function(){
          if(xmlhttp.status==404){
              document.getElementById("contPerfil").innerHTML="Page not found";
          }
          if (xmlhttp.readyState==4 && xmlhttp.status==200){
              document.getElementById("contPerfil").innerHTML=xmlhttp.responseText;
            
          }
        };
        xmlhttp.open("GET","ordenarPerfilesPor.do?atributo="+atributo,true);
        xmlhttp.send();
  
    }

      $(document).ready(function() {
    Materialize.updateTextFields();
  });
    </script>
        <c:import url="/WEB-INF/vista/comun/banner.jsp"/>
        <main>
        <div class ="row" style="overflow-y: scroll; height: 475px;">
        <div class="col offset-s4 s6">
             <div class="input-field col s12 m12 l6">
                  <input required style="float: left;" type="text" placeholder="Usuario" id="user" class="validate" name="user">
                  <a onclick="buscarUsuario()" style="position: absolute; right: 5%;"><i class="material-icons prefix">search</i></a>
            </div>
            </div>
           <div >
            <table>
                <thead>
                    <tr>
                        <th onclick="ordenarPor('usuario')" data-field="usuario">usuario</th>
                        <th onclick="ordenarPor('nombre')" data-field="nombre">nombre</th>
                        <th onclick="ordenarPor('apellido')" data-field="apellido">apellido</th>
                        <th onclick="ordenarPor('telefono')" data-field="telefono">telefono</th>
                        <th onclick="ordenarPor('email')" data-field="email">email</th>
                        <th onclick="ordenarPor('cp')" data-field="cp">cp</th>
                        <th onclick="ordenarPor('pais')" data-field="pais">pais</th>
                        <th onclick="ordenarPor('ciudad')" data-field="ciudad">ciudad</th>
                        <th onclick="ordenarPor('estado')" data-field="estado">estado</th>
                    </tr>
                </thead>

                <tbody id="contPerfil">
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
            </div>
        </main>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp"/>
    </body>
    </html>