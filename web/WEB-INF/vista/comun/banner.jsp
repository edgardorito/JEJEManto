
	<nav class="nav-extended">
	    <div class="nav-wrapper">
	      <a href="#!" class="brand-logo center" style="left:35%;">Bienvenido</a>
	      <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>

	      <ul class="side-nav" id="mobile-demo">

	        <li class="no-padding">
	            <ul class="collapsible collapsible-accordion">
	            	<li><a href="irInicio.do">Inicio</a></li>
		    	     <li>
		        	    <a class="collapsible-header">Registro Vehicular<i class="material-icons">arrow_drop_down</i></a>
		            	<div class="collapsible-body">
			              	<ul>
				                <li><a href="registrarVehiculo.do">Registrar vehiculo</a></li>
				                
				                <li><a href="solicitarListarVehiculos.do">Mostrar registros</a></li>
			             	</ul>
			            </div>
		          </li>
		        </ul>
		    </li>


	        <!--Inicio clima-->
	        <li class="no-padding">
						 <ul class="collapsible collapsible-accordion">
							 <li>
								 <a class="collapsible-header">Clima</a>
								 <div class="collapsible-body">
									 <ul>
										 <li><a href="Clima.do">Clima</a></li>
										 <li><a href="solicitarListarClimas.do">Ciudades Favoritas</a></li>
									 </ul>
								 </div>
							 </li>
						 </ul>
					 </li>
	        <!--Fin clima-->

					<li class="no-padding">
						 <ul class="collapsible collapsible-accordion">
							 <li>
								 <a class="collapsible-header">Calendario</a>
								 <div class="collapsible-body">
									 <ul>
										 <li><a href="registrarEvento.do">Registar evento</a></li>
										 <li><a href="solicitarListaEventos.do">Buscar evento</a></li>
									 </ul>
								 </div>
							 </li>
						 </ul>
					 </li>


					
					<li><a href="solicitarListarPerfil.do">Perfiles</a></li>
					
					 <li>
		        	    <a class="collapsible-header">Configuracion<i class="material-icons">arrow_drop_down</i></a>
		            	<div class="collapsible-body">
			              	<ul>
				                <li><a href="editarPerfil.do">Editar Perfil</a></li>
				                <li><a href="procesarEliminarPerfil.do">Eliminar Perfil</a></li>
				                <li><a href="cerrarSesion.do">Cerrar sesion</a></li>
			             	</ul>
			            </div>
		          </li>

	      </ul>
	    </div>

			<div class="nav-content">
				<ul class="right hide-on-med-and-down">
				<li><a href="irInicio.do">Inicio</a></li>
					<li><a class="dropdown-button" href="#!" data-activates="dropdown1">Registro Vehicular </a></li>
					<ul id="dropdown1" class="dropdown-content">
						<li><a href="registrarVehiculo.do">Registrar vehiculo</a></li>
				                
						<li class="divider"></li>
						
						<li class="divider"></li>
						<li><a href="solicitarListarVehiculos.do">Mostrar registros</a></li>
					</ul>
					
					<li><a class="dropdown-button" href="#!" data-activates="dropdownClima">Ciudad</a></li>
					<ul id="dropdownClima" class="dropdown-content">
						<li><a href="Clima.do">Agregar ciudad</a></li>
						<li class="divider"></li>
						<li><a href="solicitarListarClimas.do">Buscar/Eliminar ciudad</a></li>
						<li class="divider"></li>
						<li><a href="EditarClimas.do">Editar Ciudad</a></li>
						
					</ul>

					<li><a class="dropdown-button" href="#!" data-activates="dropdownCal">Calendario</a></li>
					<ul id="dropdownCal" class="dropdown-content">
						<li><a href="registrarEvento.do">Registar evento</a></li>
						<li class="divider"></li>
						<li><a href="solicitarListaEventos.do">Buscar evento</a></li>
						
					</ul>

					<li><a href="solicitarListarPerfil.do">Perfiles</a></li>
					<li><a class="dropdown-button" href="#!" data-activates="dropdown3">Configuracion </a></li>
					<ul id="dropdown3" class="dropdown-content">
						<li><a href="editarPerfil.do">Editar Perfil</a></li>
						<li class="divider"></li>
						 <li class="divider"></li>
				        <li><a href="procesarEliminarPerfil.do">Eliminar Perfil</a></li>
				        <li class="divider"></li>
				         <li class="divider"></li>
				        <li><a href="cerrarSesion.do">Cerrar sesion</a></li>
						
					</ul>


				</ul>
			</div>
	 </nav>
