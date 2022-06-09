/*
CREATE TABLE `consulta` (
  `idconsulta` int NOT NULL AUTO_INCREMENT,
  `id_medico` int NOT NULL,
  `id_paciente` int NOT NULL,
  `convenio` varchar(50) NOT NULL,
  PRIMARY KEY (`idconsulta`),
  KEY `id_medico` (`id_medico`),
  KEY `id_paciente` (`id_paciente`),
  CONSTRAINT `id_medico` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`idmedico`),
  CONSTRAINT `id_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`idpaciente`)
 */

 /*
CREATE TABLE `medico` (
  `idmedico` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(80) NOT NULL,
  `Especialidade` int NOT NULL,
  `CRM` int NOT NULL,
  `CPF` varchar(11) NOT NULL,
  PRIMARY KEY (`idmedico`)
*/

/*
CREATE TABLE `paciente` (
  `idpaciente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `idade` int NOT NULL,
  PRIMARY KEY (`idpaciente`)
*/