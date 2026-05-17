# Enterprise-CRUD-Engine
Enterprise-grade Employee Management System built with Spring Boot, Data JPA, and Hibernate. Features full CRUD integration, automated MySQL schema mapping, and a decoupled RESTful API backend + dynamic HTML5/Bootstrap UI frontend.
# Java Employee Hub 🚀

A high-performance, full-stack Employee Management System built using **Spring Boot 3**, **Spring Data JPA**, and **Hibernate**, featuring dual-layer architecture: a headless **RESTful API engine** and an interactive **Thymeleaf dynamic dashboard**. 

This repository serves as a foundational ecosystem for integrating advanced GenAI orchestrations, including **RAG (Retrieval-Augmented Generation)**, semantic vector matching, and autonomous tool-calling agents.

---

## 🛠️ Tech Stack & Ecosystem

- **Backend Framework:** Spring Boot 3.5.14, Spring Web
- **Data Layer:** Spring Data JPA, Hibernate ORM
- **Database:** MySQL 8.0 (Relational Storage), Planned Integration: Pinecone DB (Vector Engine)
- **UI Architecture:** Thymeleaf Templating Engine, Bootstrap 5 UI Framework
- **Testing & Tooling:** Postman API Desktop Agent, Maven, Eclipse Enterprise IDE

---

## 🏗️ Architecture & Component Flow

The system isolates business logic from representation layers, utilizing a strict Service-Repository abstraction pattern to guarantee stateless thread safety during high-throughput database exchanges.

## ⚡ Key Features & Endpoints

### 1. Dynamic Web UI Dashboard
Navigate to `http://localhost:8080/web/employees` to access the responsive frontend control panel allowing real-time database modifications without external software wrappers.

### 2. Headless REST API Matrix
| Action | HTTP Verb | Endpoint | Payload Location |
| :--- | :--- | :--- | :--- |
| **Create Employee** | `POST` | `/employee` | Request Body (JSON) |
| **Fetch All Records** | `GET` | `/employee` | None |
| **Fetch Single Record**| `GET` | `/employee/{id}` | Path Variable |
| **Update Record** | `PUT` | `/employee/{id}` | Request Body (JSON) |
| **Delete Record** | `DELETE` | `/employee/{id}` | Path Variable |

---

## 🚀 Getting Started & Configuration

### Prerequisites
- Java 17 or higher
- MySQL Server 8.0+
- Maven Dependency Manager
