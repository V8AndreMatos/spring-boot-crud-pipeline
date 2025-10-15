# spring-boot-crud-pipeline
Spring Boot Crud Project Testing Pipeline CI/CD

🌟 Project: REST API with Spring Boot + Swagger
📌 Description
This project is a RESTful API developed with Spring Boot, documented with Swagger to facilitate testing and integration. Ideal for applications that require scalability, security, and clear documentation.

🚀 Technologies Used
Java 17

Spring Boot 3

Spring Web

Spring Data JPA

H2 Database (for testing)

Swagger/OpenAPI 3

Lombok

Maven

📚 API Documentation
Access the interactive Swagger interface:

Code
http://localhost:8080/swagger-ui/index.html
🛠️ How to Run Locally
bash

# Clone the repository
git clone https://github.com/seu-usuario/seu-projeto.git
cd your-project

# Compile and run
./mvnw spring-boot:run
🧪 Tests
The unit tests are located in src/test/java. To run them:

bash
./mvnw test

🧭 Project Structure
Code
src/
├── main/
│   ├── java/
│   │   └── com.example.api/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── model/
│   │       └── repository/
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/
📦 Sample Endpoints
Method    Endpoint    Description
GET     /api/users       Lists all users
POST    /api/users       Creates a new user
PUT    /api/users/{id}   Updates a user
DELETE /api/users/{id}   Removes a user by id

🧑‍💻 Author
André [V8AndreMatos]

Backend developer passionate about clean and well-documented APIs.