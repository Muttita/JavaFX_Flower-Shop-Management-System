# Flower Shop Management System

Welcome to the **Flower Shop Management System** repository! This system is developed using **CSS**, **SceneBuilder**, **JDBC MySQL**, and **JavaFX** in **Eclipse**, designed to help manage various aspects of a flower shop, such as inventory management, customer orders, and sales tracking.

## Table of Contents
- [About](#about)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [Additional Documentation](#additional-documentation)
- [License](#license)

## About

The **Flower Shop Management System** is a desktop application that helps a flower shop manage its operations, such as adding flowers to inventory, processing customer orders, and generating sales reports. The application connects to a MySQL database using JDBC, and the user interface is built with **JavaFX** and **SceneBuilder**.

## Features

### 1. **Main Menu (Home)**
- Displays the total number of flower items available for sale.
- Shows total revenue accumulated from sales.
- Displays the total number of customers.
- Includes a bar chart summarizing daily sales.

### 2. **Available Flowers Menu**
- **Add, Edit, Update Status, Delete**: Manage flower items in the inventory.
- **Search**: Search for specific flowers in the inventory.

### 3. **Purchase Menu**
- Add flowers to each customer's shopping cart.
- Display the contents of each customer’s shopping cart.
- Calculate and display the total price of items in the cart.

## Technologies Used

- **JavaFX**: For building the graphical user interface (GUI).
- **SceneBuilder**: A GUI design tool to make designing JavaFX interfaces easier.
- **JDBC MySQL**: For connecting to and interacting with a MySQL database.
- **CSS**: For styling the user interface.
- **Eclipse IDE**: The development environment used to build the project.

## Setup and Installation

To run the **Flower Shop Management System**, follow these steps:

### Prerequisites
1. **JDK** (Java Development Kit) 8 or later
2. **MySQL Database**: You need a MySQL server set up for this project. You can use **phpMyAdmin** to manage the database.
3. **Eclipse IDE** for Java development

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Muttita/JavaFX_Flower-Shop-Management-System.git
   ```

2. **Setup MySQL Database**:
   - Create a new MySQL database using **phpMyAdmin** or any other MySQL client.
   - In the **Database.java** file, configure your **MySQL username**, **password**, and **database name** under the connection settings.

3. **Database Connection Setup**:
   - Open the **Database.java** file, and make sure that the JDBC connection is properly set up to your local MySQL instance.
   - The `Database.java` file contains the logic to connect to the database. Edit the connection details like the username, password, and database name according to your setup:
     ```java
     public class Database {
         private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
         private static final String USERNAME = "your_username";
         private static final String PASSWORD = "your_password";
         ...
     }
     ```

4. **Open the Project in Eclipse**:
   - Open Eclipse IDE and select `File -> Import`.
   - Choose `Existing Projects into Workspace` and browse to the folder where you cloned the repository.

5. **Run the Project**:
   - Once everything is set up, right-click the project in Eclipse and select `Run As -> Java Application`.
   - The application should launch, allowing you to interact with the flower shop management system.

## Usage

Once the system is up and running, you can perform the following actions through the user interface:

1. **Main Menu**:
   - View the number of available flowers in the inventory.
   - View the total revenue and the total number of customers.
   - View a bar chart summarizing daily sales.

2. **Manage Available Flowers**:
   - Add, edit, update, or delete flowers from the inventory.
   - Search for flowers within the inventory.

3. **Purchase Management**:
   - Add flowers to customers' shopping carts.
   - View the contents of each customer’s shopping cart.
   - Display the total price for each customer’s shopping cart.

## Contributing

We welcome contributions to the **Flower Shop Management System**! If you would like to help improve the project, follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push your changes to your fork (`git push origin feature/your-feature-name`).
5. Open a Pull Request.

Please make sure to follow the project’s coding standards and provide clear commit messages.

## Additional Documentation
For more detailed documentation or to view project specifications, please refer to the following document:

Flower Shop Management System Documentation

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
