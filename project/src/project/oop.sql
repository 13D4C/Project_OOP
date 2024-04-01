-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2024 at 05:43 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item` text NOT NULL,
  `sales` int(255) NOT NULL,
  `jan` int(255) NOT NULL,
  `feb` int(255) NOT NULL,
  `mar` int(255) NOT NULL,
  `apr` int(255) NOT NULL,
  `may` int(255) NOT NULL,
  `june` int(255) NOT NULL,
  `july` int(255) NOT NULL,
  `aug` int(255) NOT NULL,
  `sept` int(255) NOT NULL,
  `octo` int(255) NOT NULL,
  `nov` int(255) NOT NULL,
  `dece` int(255) NOT NULL,
  `item_id` int(11) NOT NULL,
  `id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item`, `sales`, `jan`, `feb`, `mar`, `apr`, `may`, `june`, `july`, `aug`, `sept`, `octo`, `nov`, `dece`, `item_id`, `id`) VALUES
('ejudge', 10, 743, 453, 876, 109, 0, 0, 432, 123, 1245, 1000, 2000, 1000, 1, 1),
('Jlearn', 200, 120, 233, 235, 500, 300, 1200, 231, 1455, 1324, 122, 1455, 1678, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `key_Login` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Role` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`key_Login`, `Username`, `Password`, `Role`) VALUES
(1, 'admin', '1234', 'owner'),
(2, 'test', '123', 'employee');

-- --------------------------------------------------------

--
-- Table structure for table `merchandise`
--

CREATE TABLE `merchandise` (
  `key_Merchandise` int(11) NOT NULL,
  `Name_Merchandise` varchar(255) NOT NULL,
  `total_Merchandise` int(11) NOT NULL,
  `Cost_Merchandise` int(11) NOT NULL,
  `Project_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `operating`
--

CREATE TABLE `operating` (
  `name` text NOT NULL,
  `year` int(255) NOT NULL,
  `expense` int(255) NOT NULL,
  `id` int(255) NOT NULL,
  `op_id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `operating`
--

INSERT INTO `operating` (`name`, `year`, `expense`, `id`, `op_id`) VALUES
('rent', 2024, 1000, 1, 1),
('idk', 2023, 2334, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `profit`
--

CREATE TABLE `profit` (
  `year` int(255) NOT NULL,
  `income` int(255) NOT NULL,
  `expense` int(255) NOT NULL,
  `jan_income` int(255) NOT NULL,
  `feb_income` int(255) NOT NULL,
  `mar_income` int(255) NOT NULL,
  `apr_income` int(255) NOT NULL,
  `may_income` int(255) NOT NULL,
  `june_income` int(255) NOT NULL,
  `july_income` int(255) NOT NULL,
  `aug_income` int(255) NOT NULL,
  `sep_income` int(255) NOT NULL,
  `oct_income` int(255) NOT NULL,
  `nov_income` int(255) NOT NULL,
  `dec_income` int(255) NOT NULL,
  `jan_expense` int(255) NOT NULL,
  `feb_expense` int(255) NOT NULL,
  `mar_expense` int(255) NOT NULL,
  `apr_expense` int(255) NOT NULL,
  `may_expense` int(255) NOT NULL,
  `june_expense` int(255) NOT NULL,
  `july_expense` int(255) NOT NULL,
  `aug_expense` int(255) NOT NULL,
  `sep_expense` int(255) NOT NULL,
  `oct_expense` int(255) NOT NULL,
  `nov_expense` int(255) NOT NULL,
  `dec_expense` int(255) NOT NULL,
  `profit_key` int(11) NOT NULL,
  `profit_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `profit`
--

INSERT INTO `profit` (`year`, `income`, `expense`, `jan_income`, `feb_income`, `mar_income`, `apr_income`, `may_income`, `june_income`, `july_income`, `aug_income`, `sep_income`, `oct_income`, `nov_income`, `dec_income`, `jan_expense`, `feb_expense`, `mar_expense`, `apr_expense`, `may_expense`, `june_expense`, `july_expense`, `aug_expense`, `sep_expense`, `oct_expense`, `nov_expense`, `dec_expense`, `profit_key`, `profit_id`) VALUES
(2023, 10000, 5000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1),
(2024, 15000, 1500, 100, 23, 44, 5, 23, 45, 44, 345, 34, 34, 4, 43, 10, 34, 34, 4, 45, 3, 33, 45, 42, 34, 44, 31, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `Id` int(11) NOT NULL,
  `Customer` varchar(255) NOT NULL,
  `Responsibility` text NOT NULL,
  `ProjectName` varchar(255) NOT NULL,
  `Date_Project` date NOT NULL,
  `Status` varchar(255) NOT NULL,
  `key_log` int(11) NOT NULL,
  `Telephone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`Id`, `Customer`, `Responsibility`, `ProjectName`, `Date_Project`, `Status`, `key_log`, `Telephone`) VALUES
(1, 'chotipat', 'teach student', 'ejudge', '2024-03-12', 'Finished', 1, '027234900'),
(2, 'A.J. Bank', 'give task to student', 'Jlearn', '2024-03-14', 'Finished', 1, '0123456789'),
(4, 'as', 'as', 'as', '2024-03-06', 'as', 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `quotation`
--

CREATE TABLE `quotation` (
  `Waiting` int(255) NOT NULL,
  `Accepted` int(255) NOT NULL,
  `ProjectDone` int(255) NOT NULL,
  `reminder` text NOT NULL,
  `quotation_id` int(11) NOT NULL,
  `id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `quotation`
--

INSERT INTO `quotation` (`Waiting`, `Accepted`, `ProjectDone`, `reminder`, `quotation_id`, `id`) VALUES
(0, 0, 0, '', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `quote`
--

CREATE TABLE `quote` (
  `customer` text NOT NULL,
  `telephone` text NOT NULL,
  `project_name` text NOT NULL,
  `status` text NOT NULL,
  `quote_id` int(255) NOT NULL,
  `id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `quote`
--

INSERT INTO `quote` (`customer`, `telephone`, `project_name`, `status`, `quote_id`, `id`) VALUES
('idl', '112231122', 'sdffdsgs', 'fgdfgdfg', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `receipt`
--

CREATE TABLE `receipt` (
  `customer` text NOT NULL,
  `telephone` text NOT NULL,
  `receipt_name` text NOT NULL,
  `status` text NOT NULL,
  `receipt_id` int(255) NOT NULL,
  `id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `receipt`
--

INSERT INTO `receipt` (`customer`, `telephone`, `receipt_name`, `status`, `receipt_id`, `id`) VALUES
('sfd', '1234', 'df', 'dfd', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `worker`
--

CREATE TABLE `worker` (
  `key_worker` int(11) NOT NULL,
  `Name_Work` varchar(255) NOT NULL,
  `total_Project` int(11) NOT NULL,
  `Project_idW` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`key_Login`);

--
-- Indexes for table `merchandise`
--
ALTER TABLE `merchandise`
  ADD PRIMARY KEY (`key_Merchandise`),
  ADD KEY `project_id` (`Project_id`);

--
-- Indexes for table `operating`
--
ALTER TABLE `operating`
  ADD PRIMARY KEY (`id`),
  ADD KEY `op_id` (`op_id`);

--
-- Indexes for table `profit`
--
ALTER TABLE `profit`
  ADD PRIMARY KEY (`profit_id`),
  ADD KEY `profit_key` (`profit_key`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `key_log` (`key_log`);

--
-- Indexes for table `quotation`
--
ALTER TABLE `quotation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `quotation_id` (`quotation_id`);

--
-- Indexes for table `quote`
--
ALTER TABLE `quote`
  ADD PRIMARY KEY (`id`),
  ADD KEY `quote_id` (`quote_id`);

--
-- Indexes for table `receipt`
--
ALTER TABLE `receipt`
  ADD PRIMARY KEY (`id`),
  ADD KEY `receipt_id` (`receipt_id`);

--
-- Indexes for table `worker`
--
ALTER TABLE `worker`
  ADD PRIMARY KEY (`key_worker`),
  ADD KEY `project_idW` (`Project_idW`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `key_Login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `merchandise`
--
ALTER TABLE `merchandise`
  MODIFY `key_Merchandise` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `worker`
--
ALTER TABLE `worker`
  MODIFY `key_worker` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `item_id` FOREIGN KEY (`item_id`) REFERENCES `login` (`key_Login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `merchandise`
--
ALTER TABLE `merchandise`
  ADD CONSTRAINT `project_id` FOREIGN KEY (`Project_id`) REFERENCES `project` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `operating`
--
ALTER TABLE `operating`
  ADD CONSTRAINT `op_id` FOREIGN KEY (`op_id`) REFERENCES `login` (`key_Login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `profit`
--
ALTER TABLE `profit`
  ADD CONSTRAINT `profit_key` FOREIGN KEY (`profit_key`) REFERENCES `login` (`key_Login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `key_log` FOREIGN KEY (`key_log`) REFERENCES `login` (`key_Login`);

--
-- Constraints for table `quotation`
--
ALTER TABLE `quotation`
  ADD CONSTRAINT `quotation_id` FOREIGN KEY (`quotation_id`) REFERENCES `login` (`key_Login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `quote`
--
ALTER TABLE `quote`
  ADD CONSTRAINT `quote_id` FOREIGN KEY (`quote_id`) REFERENCES `login` (`key_Login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `receipt`
--
ALTER TABLE `receipt`
  ADD CONSTRAINT `receipt_id` FOREIGN KEY (`receipt_id`) REFERENCES `login` (`key_Login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `worker`
--
ALTER TABLE `worker`
  ADD CONSTRAINT `project_idW` FOREIGN KEY (`Project_idW`) REFERENCES `project` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
