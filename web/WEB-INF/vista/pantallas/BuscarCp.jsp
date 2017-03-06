<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>

	<div class="input-field col s12 m12 l6">
        <i class="material-icons prefix">collections_bookmark</i>
        <input placeholder="Ciudad" disabled="disabled" id="icon_city" type="text" class="validate" value="${formaNuevoPerfil.ciudad}" name="ciudad">
    </div>
    <div class="input-field col s12 m12 l6">
        <i class="material-icons prefix">collections_bookmark</i>
        <input placeholder="Estado" disabled="disabled" id="icon_country" type="text" class="validate" value="${formaNuevoPerfil.estado}" name="estado">
    </div>
