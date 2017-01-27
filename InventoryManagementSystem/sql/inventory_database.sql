-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2017 at 09:08 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_category`
--

CREATE TABLE `tbl_category` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_category`
--

INSERT INTO `tbl_category` (`category_id`, `category_name`) VALUES
(1, 'Apparels & Accessories'),
(2, 'Automobile'),
(3, 'Beauty & Health'),
(4, 'Books & Learning'),
(5, 'Computers & Peripherals'),
(6, 'Electronics'),
(7, 'Food & Nutrition'),
(8, 'Mobile & Accessories'),
(9, 'Music Instruments'),
(10, 'Sports & Fitness'),
(11, 'Services');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_product`
--

CREATE TABLE `tbl_product` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(200) NOT NULL,
  `cost_price` int(11) NOT NULL,
  `selling_price` int(11) NOT NULL,
  `discount` decimal(10,5) NOT NULL,
  `quantity` int(11) NOT NULL,
  `category_name` varchar(100) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_product`
--

INSERT INTO `tbl_product` (`product_id`, `product_name`, `cost_price`, `selling_price`, `discount`, `quantity`, `category_name`, `supplier_id`, `added_date`, `modified_date`, `status`) VALUES
(1, 'Dell 5110', 45000, 52500, '0.10000', 4, 'Computers & Peripherals', 1, '2017-01-24 08:42:58', NULL, 1),
(2, 'Dell N007', 50000, 57000, '0.05000', 5, 'Computers & Peripherals', 1, '2017-01-24 08:44:19', NULL, 1),
(3, 'Vans Slippers(Transparent Sole)', 750, 1300, '0.10000', 10, 'Apparels & Accessories', 2, '2017-01-24 08:45:21', NULL, 1),
(4, 'Adidas Superstar', 800, 1450, '0.05000', 5, 'Apparels & Accessories', 2, '2017-01-24 08:48:06', NULL, 1),
(5, 'Parker Fountain Pen', 250, 300, '0.00000', 10, 'Books & Learning', 3, '2017-01-24 09:08:12', NULL, 0),
(6, 'Manchester United kit(Home)', 1000, 1250, '0.10000', 10, 'Sports & Fitness', 4, '2017-01-26 06:42:09', NULL, 1),
(7, 'Manchester United kit(Away)', 1000, 1250, '0.10000', 10, 'Sports & Fitness', 4, '2017-01-26 06:42:09', NULL, 1),
(8, 'Hulas Basmati Rice', 500, 600, '0.05000', 20, 'Food & Nutrition', 5, '2017-01-26 06:44:06', NULL, 1),
(9, 'Hulas Papad', 50, 60, '0.01000', 30, 'Food & Nutrition', 5, '2017-01-26 06:44:06', NULL, 1),
(10, 'Shimano Disc Brake Pads', 800, 1200, '0.20000', 10, 'Sports & Fitness', 6, '2017-01-26 06:47:03', NULL, 1),
(11, 'Cheese Fruit Cake (4 lbs)', 750, 900, '0.10000', 4, 'Food & Nutrition', 7, '2017-01-26 07:43:46', NULL, 1),
(12, 'Printed Hoodies', 1200, 1400, '0.05000', 6, 'Apparels & Accessories', 2, '2017-01-26 08:58:38', NULL, 1),
(13, 'Quartz Wrist Watch', 2500, 3000, '0.10000', 4, 'Apparels & Accessories', 2, '2017-01-26 08:53:11', NULL, 1),
(14, 'HDMI to VGA Converter', 450, 550, '0.05000', 5, 'Computers & Peripherals', 1, '2017-01-26 08:59:57', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_purchase`
--

CREATE TABLE `tbl_purchase` (
  `purchase_id` int(11) NOT NULL,
  `product_name` varchar(200) NOT NULL,
  `cost_price` int(11) NOT NULL,
  `discount` decimal(10,4) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total_cost` int(11) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `purchase_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `payment_method` enum('CASH','CHEQUE','CREDIT','E-PAY') NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_purchase`
--

INSERT INTO `tbl_purchase` (`purchase_id`, `product_name`, `cost_price`, `discount`, `quantity`, `total_cost`, `supplier_id`, `purchase_date`, `payment_method`, `status`) VALUES
(1, 'Parker Fountain Pen', 250, '0.0000', 10, 2500, 3, '2017-01-24 09:05:58', 'CASH', 1),
(2, 'Manchester United kit(Home)', 1000, '0.1000', 10, 10000, 4, '2017-01-26 06:33:10', 'E-PAY', 1),
(3, 'Manchester United kit(Away)', 1000, '0.1000', 10, 10000, 4, '2017-01-26 06:33:10', 'E-PAY', 1),
(4, 'Hulas Basmati Rice', 500, '0.0500', 20, 10000, 5, '2017-01-26 06:34:53', 'CREDIT', 0),
(5, 'Hulas Papad', 50, '0.0100', 30, 1500, 5, '2017-01-26 06:34:53', 'CASH', 1),
(6, 'Shimano Disc Brake Pads', 800, '0.2000', 10, 8000, 6, '2017-01-26 06:40:08', 'CHEQUE', 1),
(7, 'Cheese Fruit Cake (4 lbs)', 750, '0.1000', 4, 3000, 7, '2017-01-26 06:40:08', 'E-PAY', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sales`
--

CREATE TABLE `tbl_sales` (
  `sales_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `selling_price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `discount` decimal(10,4) NOT NULL,
  `total_cost` int(11) NOT NULL,
  `sales_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `payment_method` enum('CASH','CHEQUE','CREDIT','E-PAY') NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_sales`
--

INSERT INTO `tbl_sales` (`sales_id`, `product_id`, `selling_price`, `quantity`, `discount`, `total_cost`, `sales_date`, `payment_method`, `status`) VALUES
(1, 5, 300, 10, '0.0000', 3000, '2017-01-24 09:06:55', 'CHEQUE', 1),
(2, 6, 1125, 3, '0.1000', 3375, '2017-01-27 14:07:30', 'CASH', 1),
(3, 7, 1125, 3, '0.1000', 3375, '2017-01-27 14:08:01', 'E-PAY', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_supplier`
--

CREATE TABLE `tbl_supplier` (
  `supplier_id` int(11) NOT NULL,
  `supplier_name` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_supplier`
--

INSERT INTO `tbl_supplier` (`supplier_id`, `supplier_name`, `address`, `contact`, `email`, `added_date`, `modified_date`, `status`) VALUES
(1, 'NewTech Electronics Suppliers', 'New Road, Kathmandu', '346374', 'newteches@gmail.com', '2017-01-24 08:08:36', NULL, 1),
(2, 'Antique Fashion Store', 'Banepa -5', '656853', 'afs@gmail.com', '2017-01-24 08:08:36', NULL, 1),
(3, 'Havoc Stationery Supplies', 'Bhaktapur, Suryavinayak', '663343', 'hssuplies@gmail.com', '2017-01-24 09:05:15', NULL, 0),
(4, 'MG Classico Sports Store', 'New Road', '5664645', 'mgclassico@gmail.com', '2017-01-26 06:30:51', NULL, 1),
(5, 'Hulas Group', 'Bhaktapur, Suryavinayak', '6603453', 'hulasbkt@gmail.com', '2017-01-26 06:30:51', NULL, 1),
(6, 'NepBike Access', 'Kupandole, Ktm', '59034343', 'newpbike@yahoo.com', '2017-01-26 06:37:32', NULL, 1),
(7, 'Juju Curd & Bakery', 'Banepa, Karunamarga', '656853', 'jujucurd@hotmail.com', '2017-01-26 06:37:32', NULL, 1),
(8, 'LOL fun shop', 'Baneshwor Plaza, Baneshwor', '4486796', 'lola@gola.com', '2017-01-27 18:29:01', NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_category`
--
ALTER TABLE `tbl_category`
  ADD PRIMARY KEY (`category_name`),
  ADD UNIQUE KEY `category_id` (`category_id`);

--
-- Indexes for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_name` (`category_name`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Indexes for table `tbl_purchase`
--
ALTER TABLE `tbl_purchase`
  ADD PRIMARY KEY (`purchase_id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Indexes for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  ADD PRIMARY KEY (`sales_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  ADD PRIMARY KEY (`supplier_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_category`
--
ALTER TABLE `tbl_category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `tbl_purchase`
--
ALTER TABLE `tbl_purchase`
  MODIFY `purchase_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  MODIFY `sales_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  MODIFY `supplier_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD CONSTRAINT `tbl_product_ibfk_1` FOREIGN KEY (`category_name`) REFERENCES `tbl_category` (`category_name`),
  ADD CONSTRAINT `tbl_product_ibfk_2` FOREIGN KEY (`supplier_id`) REFERENCES `tbl_supplier` (`supplier_id`);

--
-- Constraints for table `tbl_purchase`
--
ALTER TABLE `tbl_purchase`
  ADD CONSTRAINT `tbl_purchase_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `tbl_supplier` (`supplier_id`);

--
-- Constraints for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  ADD CONSTRAINT `tbl_sales_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `tbl_product` (`product_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
