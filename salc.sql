-- MySQL dump 10.13  Distrib 5.5.24, for Win64 (x86)
--
-- Host: localhost    Database: salc
-- ------------------------------------------------------
-- Server version	5.5.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumnos` (
  `cuenta` int(10) NOT NULL DEFAULT '0',
  `nombre` varchar(30) DEFAULT NULL,
  `apellido_p` varchar(30) DEFAULT NULL,
  `apellido_m` varchar(30) DEFAULT NULL,
  `id_carrera` int(10) DEFAULT NULL,
  PRIMARY KEY (`cuenta`),
  KEY `id_carrera` (`id_carrera`),
  CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`id_carrera`) REFERENCES `carreras` (`id_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (1526686,'Alejandro','Martinez','Garcia',600),(1526690,'Alma Gabriela','Ramos','Mejia',500),(1526702,'Liliana','Valencia','Elleyo',100),(1527382,'Pedro Alejandro','Avila','Rangel',400),(1527393,'Joel','Garcia','Betancourt',200),(1527422,'David Alejandro','Mondragon','Muciño',300),(1572238,'Erick Daniel','Perez','Mata',900);
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carreras`
--

DROP TABLE IF EXISTS `carreras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carreras` (
  `id_carrera` int(10) NOT NULL DEFAULT '0',
  `nombre` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carreras`
--

LOCK TABLES `carreras` WRITE;
/*!40000 ALTER TABLE `carreras` DISABLE KEYS */;
INSERT INTO `carreras` VALUES (100,'Acturaria'),(200,'Administracion'),(300,'Contaduria'),(400,'Relaciones economicas internacionales'),(500,'Derecho'),(600,'Economia'),(700,'Informatica administrativa'),(800,'Ing. en Computacion'),(900,'Ing. en Sistemas y comunicaciones'),(1000,'Ing. industrial');
/*!40000 ALTER TABLE `carreras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `computadoras`
--

DROP TABLE IF EXISTS `computadoras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `computadoras` (
  `id_computadora` int(10) NOT NULL DEFAULT '0',
  `nombre` varchar(10) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_computadora`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computadoras`
--

LOCK TABLES `computadoras` WRITE;
/*!40000 ALTER TABLE `computadoras` DISABLE KEYS */;
INSERT INTO `computadoras` VALUES (100,'PC 1','Disponible'),(200,'PC 2','Disponible'),(300,'PC 3','Disponible'),(400,'PC 4','Disponible'),(500,'PC 5','Disponible'),(600,'PC 6','Disponible'),(700,'PC 7','Disponible'),(800,'PC 8','Disponible'),(900,'PC 9','Disponible'),(1000,'PC 10','Disponible'),(1100,'PC 11','Disponible'),(1200,'PC 12','Disponible'),(1300,'PC 13','Disponible'),(1400,'PC 14','Disponible'),(1500,'PC 15','Disponible'),(1600,'PC 16','Disponible'),(1700,'PC 17','Disponible'),(1800,'PC 18','Disponible'),(1900,'PC 19','Disponible'),(2000,'PC 20','Disponible'),(2100,'PC 21','Disponible');
/*!40000 ALTER TABLE `computadoras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `control_sesion`
--

DROP TABLE IF EXISTS `control_sesion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `control_sesion` (
  `id_sesion` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_final` time DEFAULT NULL,
  `semestre` varchar(10) DEFAULT NULL,
  `cuenta` int(10) DEFAULT NULL,
  `id_computadora` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_sesion`),
  KEY `cuenta` (`cuenta`),
  KEY `id_computadora` (`id_computadora`),
  CONSTRAINT `control_sesion_ibfk_1` FOREIGN KEY (`cuenta`) REFERENCES `alumnos` (`cuenta`),
  CONSTRAINT `control_sesion_ibfk_2` FOREIGN KEY (`id_computadora`) REFERENCES `computadoras` (`id_computadora`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `control_sesion`
--

LOCK TABLES `control_sesion` WRITE;
/*!40000 ALTER TABLE `control_sesion` DISABLE KEYS */;
INSERT INTO `control_sesion` VALUES (1,'2018-11-01','12:38:56','24:00:00','2018B',1572238,100),(2,'2018-11-01','12:38:58','24:00:00','2018B',1572238,200),(3,'2018-11-01','12:39:26','24:00:00','2018B',1572238,100),(4,'2018-11-01','12:40:09','24:00:00','2018B',1572238,100),(5,'2018-11-01','12:40:11','24:00:00','2018B',1572238,200);
/*!40000 ALTER TABLE `control_sesion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-11 12:26:08
