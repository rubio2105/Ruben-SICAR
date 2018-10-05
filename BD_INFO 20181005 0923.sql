-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.12


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema creditos
--

CREATE DATABASE IF NOT EXISTS creditos;
USE creditos;

--
-- Temporary table structure for view `vistacreditos`
--
DROP TABLE IF EXISTS `vistacreditos`;
DROP VIEW IF EXISTS `vistacreditos`;
CREATE TABLE `vistacreditos` (
  `id_cliente` int(11),
  `nombre_cliente` varchar(45),
  `telefono_cliente` varchar(45),
  `deuda_credito` varchar(45),
  `fecha_credito` varchar(45)
);

--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(45) NOT NULL,
  `direccion_cliente` varchar(45) DEFAULT NULL COMMENT '														',
  `localidad_cliente` varchar(45) DEFAULT NULL,
  `telefono_cliente` varchar(45) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`id_cliente`,`nombre_cliente`,`direccion_cliente`,`localidad_cliente`,`telefono_cliente`,`status`) VALUES 
 (3,'Rubén Martínez','Guadalupe Victoria 19','Casimiro Castillo','3173888830',1),
 (4,'Miriam Morales','Hidalgo 131415','Casimiro Castillo','3171064977',1),
 (5,'Romina Itzel Martínez Morales','Hidalgo 13','Casimiro Castillo','3573881526',1),
 (6,'Rubéncito Martínez Morales','Hidalgo 132526','Casimiro Castillo','3573881526',1),
 (7,'gru','autlan','AUTLAN','12345',-1),
 (8,'Vanessita','Paseo de los Abedules','Colima','3334660560',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `credito`
--

DROP TABLE IF EXISTS `credito`;
CREATE TABLE `credito` (
  `id_credito` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_credito` varchar(45) NOT NULL,
  `importe_credito` varchar(15) NOT NULL,
  `cliente_id_cliente` int(11) NOT NULL,
  `deuda_credito` varchar(45) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_credito`) USING BTREE,
  KEY `fk_credito_cliente_idx` (`cliente_id_cliente`),
  CONSTRAINT `fk_credito_cliente` FOREIGN KEY (`cliente_id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `credito`
--

/*!40000 ALTER TABLE `credito` DISABLE KEYS */;
INSERT INTO `credito` (`id_credito`,`fecha_credito`,`importe_credito`,`cliente_id_cliente`,`deuda_credito`,`status`) VALUES 
 (1,'13-09-2018','500',6,'0',-1),
 (2,'22-09-2018','1450',4,'1450',1),
 (3,'18-09-2018','14000',5,'12050',1),
 (4,'08-10-2018','5620',3,'5620',1),
 (5,'27-09-2018','2345',5,'2345',1);
/*!40000 ALTER TABLE `credito` ENABLE KEYS */;


--
-- Definition of view `vistacreditos`
--

DROP TABLE IF EXISTS `vistacreditos`;
DROP VIEW IF EXISTS `vistacreditos`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistacreditos` AS select `cliente`.`id_cliente` AS `id_cliente`,`cliente`.`nombre_cliente` AS `nombre_cliente`,`cliente`.`telefono_cliente` AS `telefono_cliente`,`credito`.`deuda_credito` AS `deuda_credito`,`credito`.`fecha_credito` AS `fecha_credito` from (`cliente` join `credito`);



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
