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

📦 API Endpoints
Method    Endpoint    Description        Request Body (JSON)
GET     /users         List all users      —
GET     /users/{id}    Search for user by ID    —
POST    /users         Create new user    { “name”: “User in the afternoon”, “age”: 15 }
PUT     /users/{id}    Updates user       { “name”: “User number one tuesday”, “age”: 30 }
DELETE /users/{id}     Removes user by ID    —

📬 Examples of Requisition
🔹 Create user
http://localhost:8080/users
POST /users
Content-Type: application/json

{
"name": " New User ",
"age": 15
}

🔹 Update user
http://localhost:8080/users/{id}
PUT /users/1
Content-Type: application/json

{
"name": "New User updated ",
"age": 30
}

🔹 Find user by ID
http://localhost:8080/users/{id}
GET /users/1

🔹 Delete user
http://localhost:8080/users/{id}
DELETE /users/1


🧑‍💻 Author
André [V8AndreMatos]

Backend developer passionate about clean and well-documented APIs.