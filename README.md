# Spring Boot REST API with Frontend

This project is a **Spring Boot REST API** that handles user registration and a simple **frontend** to interact with the API. It uses a **database** to store user data and a **form-based UI** to interact with the user.

### Features:
- User registration using a form.
- Frontend interacts with the Spring Boot backend via REST API.
- Data is saved in a database (configured in `application.properties`).
- API responds with user data, including a generated `userId`.

---

## Prerequisites

- **Java 17** or later
- **Spring Boot 3.x** for the backend
- **Maven** or **Gradle** for managing dependencies
- **MySQL** or **H2 Database** for storing user data (you can use other databases if you prefer)
- **IDE**: IntelliJ IDEA, Eclipse, or any preferred IDE that supports Java
- **Browser** to run the HTML frontend

---

## Backend Setup

### 1. Clone the Repository

```bash
git clone https://github.com/NileshThakur119/spring-rest-api-with-frontend.git
cd spring-rest-api-with-frontend
```
### 2. Database Configuration
In the src/main/resources/application.properties file, configure the database connection settings. Below is an example for using H2 in-memory database. You can change it to MySQL or any other database.

Example for MySQL Database:
```bash
# DataSource Configuration (MySQL Database)
spring.application.name=registration
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${DB_HOSTNAME:localhost}:${DB_PORT:3306}/${DB_DATABASE:registration}
spring.datasource.username=${DB_USER:root}
spring.datasource.password=${DB_PASS:root}
spring.datasource.driver-class-name =com.mysql.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql: true

```

### 3. Build the Backend Project
If you're using Maven, build the project by running:
```bash
mvn clean install
```

### 4. Run the Spring Boot Application
To run the backend application, use the following command:
```bash
mvn spring-boot:run
```


---

--- 
# Frontend Setup
The frontend is a simple HTML page that interacts with the backend API. To test the frontend, follow these steps:

Open the HTML File in a Browser
Simply open the reg.html file in any modern browser (e.g., Chrome, Firefox)

## How to Use
### 1. Open the Registration Form
- Open the index.html file in your browser.
- You will see a registration form with fields: First Name, Last Name, Phone Number, Location, and Email.
### 2. Submit the Form
- Fill out the form with appropriate data.
- Click the Submit button.
- The data will be sent to the Spring Boot backend at http://localhost:8080/user.
### 3. View the Response
- The backend will respond with a JSON object that includes the user details along with a generated userId.
- The response will be displayed below the form in a formatted manner.



### Example Response
When you submit the form, you should receive a response similar to the following:

```json
{
    "userId": 1,
    "userFirstName": "Nilesh",
    "userLastName": "Thakur",
    "userPhone": "123456789",
    "userLocation": "Banglore",
    "userEmail": "nilesh@gmail.com"
}
```