create database manto;

CREATE TABLE IF NOT EXISTS `manto`.`vehiculos` (
  `idVehiculo` INT(11) NOT NULL AUTO_INCREMENT,
  `curp` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `modelo` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `placa` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVehiculo`),
  UNIQUE INDEX `placa_UNIQUE` (`placa` ASC)
  )

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

CREATE TABLE `manto`.`evento` (
  `idEvento` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`idEvento`),
  unique (`nombre`));

CREATE TABLE `manto`.`clima` (
  `idClima` INT NOT NULL,
  `ciudad` VARCHAR(45) NULL,
  `latitud` VARCHAR(45) NOT NULL,
  `longitud` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClima`),
  UNIQUE INDEX `idClima_UNIQUE` (`idClima` ASC));

INSERT INTO `manto`.`vehiculos` (`curp`, `tipo`, `modelo`, `marca`, `placa`, `color`) VALUES ('SHJO960414HTCLRV08', 'automovil', '2003', 'FORD', 'HOI89H', 'Gris');
INSERT INTO `manto`.`vehiculos` (`curp`, `tipo`, `modelo`, `marca`, `placa`, `color`) VALUES ('KOLI876517MIOLKV01', 'automovil', '2000', 'DODGE', 'Y7U7IN', 'Verde');

INSERT INTO `manto`.`editarperfil` (`id`, `usuario`, `contra`, `nombre`, `apellido`, `telefono`, `email`, `cp`, `pais`, `ciudad`, `estado`) VALUES ('2', 'jul', '123', 'juliane', 'arreola', '9865188291', 'jul@gmail.com', '29000', 'México', 'Tuxtla Gutiérrez', 'Chiapas');
INSERT INTO `manto`.`editarperfil` (`id`, `usuario`, `contra`, `nombre`, `apellido`, `telefono`, `email`, `cp`, `pais`, `ciudad`, `estado`) VALUES ('11', 'juliane', '123', 'juliane', 'arreola', '9865188291', 'jul@gmail.com', '29000', 'México', 'Tuxtla Gutiérrez', 'Chiapas');
