<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
    
    <br>
   
    <main>
    <div class="row">
      <div class="col offset-s4 s4">
          <form id="forma" action="procesarLogin.dd" method="post">
            <div class="row">
               <div class="input-field col s12 m12 l12">
              <i class="material-icons prefix">account_box</i>
              <input required placeholder="Usuario" id="usuario" type="text" class="validate"
              value="${formaLogin.user}" name="user">
            </div>
            </div>
            <div class="row"></div>
            <div class="row">
              <div class="input-field col s12 m12 l12">
              <i class="material-icons prefix">account_box</i>
              <input required placeholder="Contraseña" id="contrasena" type="password" class="validate"
              value="${formaLogin.password}" name="password">
            </div>
            </div>
           <center>
                <button class="btn waves-effect waves-light" type="submit" name="submit">Login
                <i class="material-icons right">send</i>
            </button>
                            
                     
            <a class="btn waves-effect waves-light" href="irEditarPerfil.dd">Registrarse</a>
           </center> 
           
    </form>
      </div>
    </div>
    
    </main>