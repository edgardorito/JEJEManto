<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
<html>
    <head>
        <title>Ayuda</title>
        <link rel="stylesheet" type="text/css" href="css/plantilla.css">
    </head>
	
    <body>
        <table class="marco" cellpadding="0">
            <tr>
                <td colspan="2">
                    <c:import url="/WEB-INF/vista/comun/banner.jsp" />
                    <c:import url="/WEB-INF/vista/comun/barraMenu01.jsp" />
                </td>
            </tr>
            <tr height="490px">
                <td align="center" valign="center" width="100%">
                 	<form >
                        Usuario:
                        <input type="text" name="usuario"><br/><br/>
                        Nombre:
                        <input type="text" name="nombre">
                        <br/><br/>
                        Apellido:
                        <input type="text" name="apellido">
                        <br/><br/>
                        CP:
                        <input type="text" name="cp">
                     
                        <br/><br/>
                        Lenguaje preferido:
                        <select name="lenguaje">
                          <option value="java">java
                          <option value="jsp" selected>jsp
                          <option value="php">php
                          <option value="C/C++">C/C++
                          <option value="C#">C#
                          <option value="Asp">Asp
                          <option value="AS3">AS3
                        </select>
                        <br/>
                        
                     
                        <p><input type="submit" value="Enviar"></p>
                    </form>
 
                </td>
            </tr>
           


            <tr>
                <td colspan="2">
                    <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
                </td>
            </tr>
        </table>
    </body>
</html>
