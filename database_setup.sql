CREATE DATABASE IF NOT EXISTS UniBook;

USE UniBook;

-- Create User table only if it does not exist
CREATE TABLE IF NOT EXISTS User (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(255) NOT NULL UNIQUE,
    Email VARCHAR(255) NOT NULL UNIQUE,
    Password VARCHAR(255) NOT NULL
);

-- Create Textbook table only if it does not exist
CREATE TABLE IF NOT EXISTS Textbook (
    BookID INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(255) NOT NULL,
    Author VARCHAR(255) NOT NULL,
    Price DECIMAL(10, 2) NOT NULL,
    `Condition` VARCHAR(100) NOT NULL
);

-- Create Course table only if it does not exist
CREATE TABLE IF NOT EXISTS Course (
    CourseID INT AUTO_INCREMENT PRIMARY KEY,
    CourseName VARCHAR(255) NOT NULL,
    Department VARCHAR(255) NOT NULL
);

-- Create Transaction table only if it does not exist
CREATE TABLE IF NOT EXISTS `Transaction` (
    TransactionID INT AUTO_INCREMENT PRIMARY KEY,
    BuyerID INT NOT NULL,
    SellerID INT NOT NULL,
    BookID INT NOT NULL,
    TransactionDate DATE NOT NULL,
    FOREIGN KEY (BuyerID) REFERENCES User(UserID),
    FOREIGN KEY (SellerID) REFERENCES User(UserID),
    FOREIGN KEY (BookID) REFERENCES Textbook(BookID)
);

