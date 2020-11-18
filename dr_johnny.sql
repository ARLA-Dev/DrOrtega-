-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-11-2020 a las 01:58:09
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dr_johnny`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultas`
--

DROP TABLE IF EXISTS `consultas`;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `consultas`
--

INSERT INTO `consultas` (`id_consulta`, `id_paciente`, `fecha/hora`, `motivos`, `diagnostico`, `indicaciones`, `recetario`) VALUES
(1, 3, '2020-11-17 21:56:33', 'DOLOR DE CUELLO', 'CERVICALGIA', 'TACHIPIRIN 30MG -> EN AMPOLLAS DOS VECES AL DIA\nDOLOGESIC 3 POTES -> TRES VECES AL DIA\n', 'TACHIPIRIN 30MG\nDOLOGESIC 3 POTES\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamentos`
--

DROP TABLE IF EXISTS `medicamentos`;
CREATE TABLE IF NOT EXISTS `medicamentos` (
  `id_medicamento` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_m` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `indicaciones` varchar(1000) COLLATE utf8_spanish_ci NOT NULL,
  `borrado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_medicamento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `medicamentos`
--

INSERT INTO `medicamentos` (`id_medicamento`, `nombre_m`, `indicaciones`, `borrado`) VALUES
(1, 'TACHIPIRIN', 'EN AMPOLLAS DOS VECES AL DIA', 0),
(2, 'DOLOGESIC', 'TRES VECES AL DIA', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`id_paciente`, `cedula`, `nombre`, `apellido`, `edad`, `direccion`, `telefono_fijo`, `telefono_movil`, `antecedentes_f`, `antecedentes_p`) VALUES
(1, 'V-27946016', 'ARTHURO ERNESTO', 'DUGARTE VALLES', 21, 'LA MORA', '02520000000', '04140000000', 'NINGUNO', 'NINGUNO'),
(2, 'V-26976713', 'LAURA ESTEFANÍA', 'ORTEGA PÉREZ', 21, 'AVENIDA LIBERTADOR', '02510000000', '0424000000', 'MUCHOS', 'NINGUNO'),
(3, 'V-10772815', 'YULEIMA JOSEFINA', 'PÉREZ PÉREZ', 48, 'AVENIDA LIBERTADOR', '02510000000', '04166542059', 'HIPERTENSION Y DIABETES', 'HIPERTENSION');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consultas`
--
ALTER TABLE `consultas`
  ADD CONSTRAINT `consultas_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id_paciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
