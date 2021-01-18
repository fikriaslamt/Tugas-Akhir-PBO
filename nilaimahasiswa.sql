-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2021 at 02:49 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nilaimahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `npm` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `mk` varchar(50) DEFAULT NULL,
  `nilai` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nilaidosen`
--

CREATE TABLE `nilaidosen` (
  `npm` int(11) NOT NULL,
  `dosen` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nilaipraktikum`
--

CREATE TABLE `nilaipraktikum` (
  `npm` int(11) NOT NULL,
  `asdos` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `nilaidosen`
--
ALTER TABLE `nilaidosen`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `nilaipraktikum`
--
ALTER TABLE `nilaipraktikum`
  ADD PRIMARY KEY (`npm`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `nilaidosen`
--
ALTER TABLE `nilaidosen`
  ADD CONSTRAINT `nilaidosen_ibfk_1` FOREIGN KEY (`npm`) REFERENCES `nilai` (`npm`) ON DELETE CASCADE;

--
-- Constraints for table `nilaipraktikum`
--
ALTER TABLE `nilaipraktikum`
  ADD CONSTRAINT `nilaipraktikum_ibfk_1` FOREIGN KEY (`npm`) REFERENCES `nilai` (`npm`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
