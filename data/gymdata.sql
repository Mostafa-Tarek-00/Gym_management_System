-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2022 at 03:54 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gymdata`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `mobilenumber` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(40) NOT NULL,
  `startday` varchar(10) NOT NULL,
  `typeofwork` varchar(20) NOT NULL,
  `salary` int(11) NOT NULL,
  `medical` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `mobilenumber`, `email`, `gender`, `age`, `address`, `startday`, `typeofwork`, `salary`, `medical`) VALUES
(1, 'MOhamed Ezz Elregal', '0111111111', 'ezz@', 'Male', 20, 'hausry', '04-01-2022', 'Captain', 100000, 'Good'),
(2, 'mohamed yehia', '0100000000', 'yehia@20', 'Male', 20, 'giza', '04-01-2022', 'Captain', 5000, 'good');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `password`) VALUES
('mostafa', 'mostafa'),
('mostafa', 'mostafa'),
('ezz', 'ezz');

-- --------------------------------------------------------

--
-- Table structure for table `newmember`
--

DROP TABLE IF EXISTS `newmember`;
CREATE TABLE `newmember` (
  `id` int(10) NOT NULL,
  `reciptno` int(10) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `mobilenumber` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `gender` varchar(8) DEFAULT NULL,
  `dayofbirth` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `startday` varchar(10) DEFAULT NULL,
  `extrapackage` varchar(20) DEFAULT NULL,
  `payment` varchar(20) DEFAULT NULL,
  `medicalcomments` varchar(50) DEFAULT NULL,
  `howyouknowus` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `newmember`
--

INSERT INTO `newmember` (`id`, `reciptno`, `name`, `mobilenumber`, `email`, `gender`, `dayofbirth`, `address`, `startday`, `extrapackage`, `payment`, `medicalcomments`, `howyouknowus`) VALUES
(3, 3, 'Abo hamed', '01111111111', 'abohamed@', 'Male', '2002', 'giza', '04-01-2022', 'Kickboxing', '800', 'Good', 'From our Website'),
(4, 4, 'Ahmed', '011111111', 'ahmed@', 'Male', '2002', 'giza', '04-01-2022', 'Kickboxing', '3300 ', 'good', 'From Your Friend'),
(5, 5, 'Gaber', '0111111', 'mosta@', 'Male', '3/10', 'faise', '04-01-2022', 'CrossFit', '3300 ', 'good', 'From Your Friend');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` int(11) NOT NULL,
  `month` varchar(30) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`id`, `month`, `amount`) VALUES
(1, '04-01-2022', 800),
(3, '04-01-2022', 800),
(5, '04-01-2022', 3300);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `id` int(11) NOT NULL,
  `month` varchar(30) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`id`, `month`, `amount`) VALUES
(1, '04-01-2022', 100000),
(2, '04-01-2022', 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `newmember`
--
ALTER TABLE `newmember`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD UNIQUE KEY `reciptno` (`reciptno`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
