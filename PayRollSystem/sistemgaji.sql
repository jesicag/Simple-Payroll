-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2017 at 01:34 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sistemgaji`
--

-- --------------------------------------------------------

--
-- Table structure for table `pay`
--

CREATE TABLE IF NOT EXISTS `pay` (
`ID` int(10) unsigned NOT NULL,
  `FirstName` varchar(20) DEFAULT NULL,
  `LastName` varchar(20) DEFAULT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `HourWork` int(10) DEFAULT NULL,
  `BasicPay` int(10) DEFAULT NULL,
  `Payrollno` int(10) DEFAULT NULL,
  `Overtime` int(10) DEFAULT NULL,
  `Tax` int(10) DEFAULT NULL,
  `Grosspay` int(10) DEFAULT NULL,
  `NetPay` int(10) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pay`
--

INSERT INTO `pay` (`ID`, `FirstName`, `LastName`, `PhoneNumber`, `HourWork`, `BasicPay`, `Payrollno`, `Overtime`, `Tax`, `Grosspay`, `NetPay`) VALUES
(7, 'Sonya', 'Ahnela', '2147483647', 10, 200000, 20, 5, 10000, 5000000, 4500000),
(9, 'Elisabeth', 'Jesica', '8238710', 10, 300000, 12, 4, 20000, 4200000, 4180000),
(10, 'Dwi', 'Advenia', '82388', 13, 200000, 11, 4, 25000, 3400000, 3375000),
(11, 'Desy', 'Kristina', '082387105770', 18, 250000, 2, 5, 150000, 5750000, 5600000),
(12, 'Christine', 'vincenza', '082387105770', 10, 200000, 20, 4, 15000, 2800000, 2785000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pay`
--
ALTER TABLE `pay`
 ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pay`
--
ALTER TABLE `pay`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
