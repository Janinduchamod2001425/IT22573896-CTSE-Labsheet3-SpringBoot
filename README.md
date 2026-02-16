# 🚀 DevOps Lab 03 – Spring Boot Microservice

## 📌 Module
SE4010 – Current Trends in Software Engineering  
SLIIT – Faculty of Computing  
IT22573896 - Nagahawaththa J.C.D

---

# 📖 Project Overview

This project demonstrates the development of a **Spring Boot RESTful microservice** with:

- CRUD REST APIs
- H2 In-Memory Database
- Spring Data JPA
- Swagger (OpenAPI) Documentation
- Maven Build System

The microservice manages **Product** entities and exposes REST endpoints for product operations.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 4.x
- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI (Swagger)
- Maven

---


---

# 🟢 Part 1 – Spring Boot Setup

The project was generated using **Spring Initializr** with:

- Project: Maven
- Language: Java
- Packaging: Jar
- Group: com.sliit
- Artifact: product-service
- Java Version: 17

### Dependencies:
- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI UI

---

# 🟢 Part 2 – REST API Implementation

## Implemented Endpoints

| Method | Endpoint | Description |
|--------|----------|------------|
| POST | `/products` | Create a new product |
| GET | `/products` | Retrieve all products |
| GET | `/products/{id}` | Retrieve product by ID |
| DELETE | `/products/{id}` | Delete product by ID |

## Product Entity

```java
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
}



