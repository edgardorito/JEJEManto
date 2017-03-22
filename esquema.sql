create database manto;

CREATE TABLE `manto`.`vehiculos` (
  `idVehiculo` INT NOT NULL,
  `curp` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `modelo` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `placa` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVehiculo`)
);

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