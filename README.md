# 🛒 Spring Boot Shopping Cart API

A fully modular, secure, and testable REST API for a shopping cart system built with **Spring Boot 3**, following **Hexagonal + Clean Architecture**, including JWT authentication, Feign client proxying, in-memory H2 database, Swagger documentation and a full Postman collection.

---

## 🧱 Architecture

The project follows a **Hexagonal (Ports & Adapters)** structure combined with **Clean Architecture** principles:

```
com.shoppingcart
├── application         # Use cases and DTOs
├── domain              # Business entities, services and interfaces (ports)
├── infrastructure
│   ├── client          # Feign clients (external APIs)
│   ├── controller      # REST API controllers
│   ├── config          # Beans, Swagger and security configs
│   ├── repository      # Persistence implementations (adapters)
│   └── security        # JWT utilities and filter
└── resources
    └── application.yml # App configuration
```

---

## 🚀 Getting Started

### 📋 Prerequisites

- Java 21+
- Maven 3.9+
- Any IDE (IntelliJ, VSCode, etc.)

---

### ▶ Running the application

1. Clone the repository:
```bash
git clone https://github.com/alexvargashn/spring-boot-shooping-cart.git
cd spring-boot-shopping-cart
```

2. Build and run:
```bash
mvn clean install
mvn spring-boot:run
```

3. The app will start at:
```
http://localhost:8080
```

---

## 🔐 Authentication

To authenticate, send a `POST` to:

```
POST /api/auth/login
```

Body:
```json
{
  "username": "admin",
  "password": "secret"
}
```

Response:
```json
{
  "token": "Bearer eyJhbGciOi..."
}
```

Use this token to authorize subsequent requests:
```
Authorization: Bearer <token>
```

---

## 📦 Available Endpoints

| Method | Endpoint                   | Auth Required | Description                      |
|--------|----------------------------|---------------|----------------------------------|
| POST   | /api/auth/login            | ❌ No          | Authenticate and receive token  |
| GET    | /api/products              | ❌ No          | List all products (proxy API)   |
| GET    | /api/products/{id}         | ❌ No          | Get product by ID               |
| POST   | /api/orders                | ✅ Yes         | Create a new order              |
| GET    | /api/orders                | ✅ Yes         | Get all orders                  |
| GET    | /api/orders/{id}           | ✅ Yes         | Get order by ID                 |
| POST   | /api/payments/{orderId}    | ✅ Yes         | Simulate a payment              |

---

## 📒 Swagger Documentation

Once the app is running, go to:

```
http://localhost:8080/swagger-ui.html
```

Here you can explore and test all available endpoints.

---

## 🔁 Postman Collection

The complete Postman collection is located at the root of the project and is named:

`shopping-cart-full-api.postman_collection.json`

It includes authentication, product queries, order creation, and payment simulation. You can import it into Postman to easily test all features of the API.

Steps to use:

1. Open Postman
2. Import the JSON file
3. Authenticate via `/api/auth/login`
4. Use `{{jwt_token}}` variable in secured endpoints

---

## 💡 Technologies Used

- Spring Boot 3.4.x
- Spring Security (JWT)
- Spring Data JPA + H2 Database
- Springdoc OpenAPI (Swagger)
- Spring Cloud OpenFeign
- Maven
- Java 21

---

## 📂 Environments

The app runs with an **in-memory H2 database**. No additional setup is needed for data persistence in development/testing.

---

## 🧪 Testing the API

You can also use the included `.http` file (`shoppingcart-api.http`) with the **REST Client extension** in VS Code.

---

## 🧑‍💻 Author

Developed by **Alex Vargas** as a technical challenge for Spring Boot backend development.

---

## 📄 License

This project is for educational/demo purposes. Feel free to fork and build upon it.

