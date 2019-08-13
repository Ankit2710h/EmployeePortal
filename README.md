# Employee_Portal

## Built With

    * Maven - Dependency Management
    * JDK 1.8 - Java™ Platform, Standard Edition Development Kit
    * Spring Boot - Framework to ease the bootstrapping and development of new Spring Applications
    * MySQL - Open-Source Relational Database Management System
    * git - Free and Open-Source distributed version control system
	* Angular CLI: 7.3.9
	* Node: 8.11.3
	* OS: win32 x64
	* Angular: 7.2.15
	
## Folder structure
	Server(API) code resides in folder -> Employee_Portal\src\main\java
	Client side code resides in folder -> Employee_Portal\src\main\webapp
	
## Running the application locally

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Import the project into your IDE(IntelliJ/Eclipse etc) using pom.xml as a Maven project
- In application.properties file configure a local database to be connected. For example, here I have created "employee_database" using MYSQL server that will store the employee objects created.
- Run the command "mvn clean install" in the root folder(where pom.xml is present)
- Go to the Spring Boot Application file(Employee_Portal\src\main\java\Employee_Portal\Application.java).
- Right Click on the file and Run as Java Application.

## For running the client

- Go to the app folder(Employee_Portal\src\main\webapp\src\app)
- Run command "npm install" to install the node modules required for the project
- Once it is complete, execute command "npm start" to start the appication, it will be deployed to localhost:4200 which is the default port for Angular app.

## App Navigation
- Home page displays 2 tabs :
	* List Employees - To list all the employees(in ascending order by first name) added into the database with all the details.
	* Add Employee - To add a new employee to the database. A form is displayed to be filled in and submitted in order to add the employee.
	
## packages

- `models`— to hold the entities;
- `repositories`—to communicate with the database;
- `services`—to hold the business logic;
- `controllers`—to listen to the client;
- `resources/application.properties` - It contains application-wide properties. Spring reads the properties defined in this file to configure the application. I have used it to define database URL to connect to and Hibernate configuration.

Note: To communicate from client side to server, "proxy.conf.json" file is added in webapp folder. It defines the base url to target in order to hit the server API.


