<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
<html>
    <head>
        <title>Administrador - UPCHIAPAS</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<script type="text/javascript" src="js/Ajax.js"></script>

        <c:import url="/WEB-INF/vista/comun/importaciones.jsp" />

       
    </head>
	
    <body>
        <c:import url="/WEB-INF/vista/comun/banner.jsp" />
        <c:import url="/WEB-INF/vista/pantallas/${param.c}"/>
        <c:import url="/WEB-INF/vista/comun/barraPie.jsp" />
    </body>
</html>
