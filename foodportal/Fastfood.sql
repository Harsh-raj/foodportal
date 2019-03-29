-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.34-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for fastfood
DROP DATABASE IF EXISTS `fastfood`;
CREATE DATABASE IF NOT EXISTS `fastfood` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `fastfood`;

-- Dumping structure for table fastfood.admin
DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `Username` char(50) NOT NULL,
  `Pwd` char(10) NOT NULL,
  `hint` char(20) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.bill
DROP TABLE IF EXISTS `bill`;
CREATE TABLE IF NOT EXISTS `bill` (
  `itemname` char(10),
  `price` int(5)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.customer
DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `Mobileno` bigint(20) NOT NULL,
  `Fname` char(10) NOT NULL,
  `L_Name` char(10) NOT NULL,
  `creditpt` int(10) NOT NULL,
  PRIMARY KEY (`Mobileno`,`Fname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.discount
DROP TABLE IF EXISTS `discount`;
CREATE TABLE IF NOT EXISTS `discount` (
  `credit_pt` int(10) NOT NULL,
  `Discount` int(10) NOT NULL,
  KEY `Index 1` (`credit_pt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.fastfood
DROP TABLE IF EXISTS `fastfood`;
CREATE TABLE IF NOT EXISTS `fastfood` (
  `ID` int(10) NOT NULL,
  `Itemname` char(10) NOT NULL,
  `Price` int(5) NOT NULL,
  `Category` char(10) NOT NULL,
  PRIMARY KEY (`ID`,`Itemname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.feedupdate
DROP TABLE IF EXISTS `feedupdate`;
CREATE TABLE IF NOT EXISTS `feedupdate` (
  `feedID` char(50) DEFAULT NULL,
  `Identity` bigint(20) DEFAULT NULL,
  `feed` char(50) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  KEY `FK_feed&update_customer` (`Identity`),
  CONSTRAINT `FK_feed&update_customer` FOREIGN KEY (`Identity`) REFERENCES `customer` (`Mobileno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.monsales
DROP TABLE IF EXISTS `monsales`;
CREATE TABLE IF NOT EXISTS `monsales` (
  `Billno` int(10) NOT NULL,
  `Mobileno` bigint(20) NOT NULL,
  `Fname` char(10) NOT NULL,
  `Billamt` int(10) DEFAULT NULL,
  PRIMARY KEY (`Billno`),
  KEY `FK_monsales_customer` (`Mobileno`,`Fname`),
  CONSTRAINT `FK_monsales_customer` FOREIGN KEY (`Mobileno`, `Fname`) REFERENCES `customer` (`Mobileno`, `Fname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.staff
DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `Staff_ID` int(10) NOT NULL,
  `Name` char(10) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Staff_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table fastfood.stock
DROP TABLE IF EXISTS `stock`;
CREATE TABLE IF NOT EXISTS `stock` (
  `ID` int(10) NOT NULL,
  `Itemname` char(10) NOT NULL,
  `qty` int(10) DEFAULT NULL,
  KEY `FK_stock_fastfood` (`ID`,`Itemname`),
  CONSTRAINT `FK_stock_fastfood` FOREIGN KEY (`ID`, `Itemname`) REFERENCES `fastfood` (`ID`, `Itemname`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
