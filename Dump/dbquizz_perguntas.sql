-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: dbquizz
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `perguntas`
--

DROP TABLE IF EXISTS `perguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perguntas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pergunta` varchar(200) DEFAULT NULL,
  `resposta1` varchar(60) DEFAULT NULL,
  `resposta2` varchar(60) DEFAULT NULL,
  `resposta3` varchar(60) DEFAULT NULL,
  `resposta4` varchar(60) DEFAULT NULL,
  `rescerta` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perguntas`
--

LOCK TABLES `perguntas` WRITE;
/*!40000 ALTER TABLE `perguntas` DISABLE KEYS */;
INSERT INTO `perguntas` VALUES (1,'Quantas horas tem um ano de 365 dias?','7105','1805','8760','10875',3),(2,'Como se chama um grupo de lobos?','Matilha','Manada','Varios Lobos','Alcateia',4),(3,'Qual é o nome do meio do famoso jogador de basquete Lebrom James?','Tyrone','Raymone','Carl','Smith',2),(4,'Qual é o planeta mais perto do sol?','Mercúrio','Terra','Lua','Plutão',1),(5,'Qual o maior país do mundo em area territorial?','China','Russia','Brasil','Estados Unidos',2),(6,'Quem era considerado o Rei do Rock?','Michael Jackson','Freddie Mercury','Barões da Pisadinha','Elvis Presley',4),(7,'Qual o nome do principal vilão da série The Legend of Zelda?','Ganon','Bowser','Kratos','Link',1),(8,'Qual o nome da moeda do Japão?','Pesos','Libra','Euro','Iene',4),(9,'Quando foi que o primeiro homem pisou na lua?','1966','1969','1968','1967',2),(10,'Quem pintou a Mona Lisa','Isac Newton','Leonardo Da Vinci','Van Gogh','Picasso',2),(11,'Qual o nome da Vocaloid mais famosa do mundo?','Kasane Teto','Gumi','Hatsune Miku','Akita Neru',3),(12,'Qual a montanha mais alta do mundo?','Elbrus','Denali','Everest','Lhotse',3),(13,'Qual o nome do ponto mais profundo dos oceanos','Triangulo das Bermudas','Atlantida','Fossa das Marianas','Pacifico',3),(14,'Em que ano foi inaugurado o Cristo Redentor?','1951','1921','1931','1941',3),(15,'Qual o idioma oficial do Egito?','Ingles','Indiano','Latin','Árabe',4),(16,'Qual o idioma oficial do Egito?','Ingles','Indiano','Latin','Árabe',4),(18,'Quem é o fundador da Microsoft','Bill Gates','Steve Jobs','Elon Musk','Gabe Newell',1),(19,'Com quantos anos morreu Silvio Santos?','93','91','87','105',1),(20,'Qual o nome do inimigo que atira martelos no Mario Bros?','Hammer Bro','Hammer Man','Mega Hammer','Hammer Carl',1);
/*!40000 ALTER TABLE `perguntas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-03 16:09:05
