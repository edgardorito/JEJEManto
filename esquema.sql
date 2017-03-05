alter table UsuarioRol drop constraint FK4CA33E15F65AB4;
alter table UsuarioRol drop constraint FK4CA33E1BF549993;
drop table Roles if exists;
drop table Usuarios if exists;
drop table UsuarioRol if exists;
create table Roles (
   idRol bigint not null,
   nombre varchar(255) not null,
   descripcion varchar(255),
   primary key (idRol),
   unique (nombre)
);
create table Usuarios (
   idUsuario bigint not null,
   nombrePrefijo varchar(255),
   nombreNombre varchar(255),
   nombreApellidoPaterno varchar(255),
   nombreApellidoMaterno varchar(255),
   nombrePosfijo varchar(255),
   nombreIniciales varchar(255),
   nombreUsuario varchar(255) not null,
   claveAcceso varchar(255) not null,
   primary key (idUsuario),
   unique (nombreUsuario)
);
CREATE TABLE `manto`.`vehiculos` (
  `idVehiculo` INT NOT NULL,
  `idUsuario` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `modelo` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `placa` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVehiculo`)
);

create table UsuarioRol (
   idUsuario bigint not null,
   idRol bigint not null
);

CREATE TABLE `manto`.`clima` (
  `idClima` INT NOT NULL AUTO_INCREMENT,
  `Ciudad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClima`));

alter table UsuarioRol add constraint FK4CA33E15F65AB4 foreign key (idRol) references Roles;
alter table UsuarioRol add constraint FK4CA33E1BF549993 foreign key (idUsuario) references Usuarios;


CREATE TABLE `manto`.`editarperfil` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `contra` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `cp` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45),
  `ciudad` VARCHAR(45),
  `estado` VARCHAR(45),
  PRIMARY KEY (`id`),
  unique (`usuario`));
