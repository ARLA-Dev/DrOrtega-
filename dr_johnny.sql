-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-11-2020 a las 19:42:35
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dr_johnny`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultas`
--

CREATE TABLE IF NOT EXISTS `consultas` (
  `id_consulta` int(11) NOT NULL AUTO_INCREMENT,
  `id_paciente` int(11) NOT NULL,
  `fecha/hora` datetime NOT NULL,
  `motivos` varchar(5000) COLLATE utf8_spanish_ci NOT NULL,
  `diagnostico` varchar(2000) COLLATE utf8_spanish_ci NOT NULL,
  `indicaciones` varchar(3000) COLLATE utf8_spanish_ci NOT NULL,
  `recetario` varchar(5000) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_consulta`),
  KEY `id_paciente` (`id_paciente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `consultas`
--

INSERT INTO `consultas` (`id_consulta`, `id_paciente`, `fecha/hora`, `motivos`, `diagnostico`, `indicaciones`, `recetario`) VALUES
(1, 1, '2020-10-26 14:49:40', 'VINO PORQUE LE DUELE UN OJO', 'LOQUERA PORQUE AQUI NO SE ATIENDEN OJOS SIE', 'IR A UN LOQUERO', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamentos`
--

CREATE TABLE IF NOT EXISTS `medicamentos` (
  `id_medicamento` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_m` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `borrado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_medicamento`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=16 ;

--
-- Volcado de datos para la tabla `medicamentos`
--

INSERT INTO `medicamentos` (`id_medicamento`, `nombre_m`, `borrado`) VALUES
(1, 'CATAFLAN', 1),
(2, 'IBUPROFENO', 1),
(3, 'TACHIPIRIN', 1),
(4, 'ALLERGY', 0),
(5, 'BORRADO', 1),
(6, 'DOLAX', 0),
(7, 'CATAFLAN', 1),
(8, 'DOLAX', 1),
(9, 'ARTHURO', 1),
(10, 'TACHIPIRIN', 0),
(11, 'DOLAX 500MG', 1),
(12, 'CATAFLAN 30MG', 1),
(13, 'DOLL', 1),
(14, 'CATAFLAN', 0),
(15, '1', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE IF NOT EXISTS `pacientes` (
  `id_paciente` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `edad` int(3) NOT NULL,
  `direccion` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_fijo` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_movil` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `antecedentes_f` varchar(2000) COLLATE utf8_spanish_ci NOT NULL,
  `antecedentes_p` varchar(2000) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_paciente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`id_paciente`, `cedula`, `nombre`, `apellido`, `edad`, `direccion`, `telefono_fijo`, `telefono_movil`, `antecedentes_f`, `antecedentes_p`) VALUES
(1, 'V-27946016', 'ARTHURO ERNESTO', 'DUGARTE VALLES', 21, 'URBANIZACIÓN LA MORA', '02510000000', '04242734603', 'NO TIENEN CORDALES :)', 'CASI LO MATA EL DOCTOR CUANDO NACIÓ, PERO NACIÓ BIEN WAPO'),
(2, 'V-26976713', 'LAURA ESTEFANÍA', 'ORTEGA PÉREZ', 21, 'AVENIDA LIBERTADOR', '02510000000', '04145345199', 'NINGUNO', 'MUCHOS'),
(3, 'V-30000000', 'ARTHURO', 'DUGARTE', 21, 'SU CASA', '00000000000', '04240000000', 'A', 'A'),
(4, 'V-29000000', 'CAMILO', 'PASTELITO', 30, 'SU CASA', '0000000000', '04240000000', 'NINGUNO', 'NINGUNO'),
(5, 'V-31000000', 'TIFFANY', 'PANCRATZIA', 5, 'MI CASA', '', '04240000000', '', ''),
(6, 'V-32000000', 'LUIS', 'PALACIOS', 12, 'SU CASITA', '02510000000', '04244444444', '', ''),
(7, 'V-269767130', 'TIFFANITO', 'PANCRATZIO', 1, 'MI CASA', '58555555555', '04245555555', '', ''),
(8, 'V-23876965', 'JUAN ANDRES', 'ABOU ASSI PEREZ', 7, 'LA CASA DE MI TIA O SEA SU MAMÁ', '00000000000', '04240000000', '', '');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consultas`
--
ALTER TABLE `consultas`
  ADD CONSTRAINT `consultas_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id_paciente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
