# Java Clean Architecture Template

A professional, production-ready boilerplate implementing Clean Architecture (also known as Hexagonal or Ports and Adapters) using Java 17 and Spring Boot 3.

---

## Motivation: Why Clean Architecture?

In traditional layered architectures (Controller -> Service -> Repository), business logic often becomes tightly coupled with database schemas and framework-specific annotations. 

I chose Clean Architecture for this project to solve these core problems:

1. Independence of Frameworks: The core business logic (Domain) does not depend on Spring Boot, Hibernate, or any third-party libraries. If Spring Boot becomes obsolete, the heart of the application remains untouched.
2. Testability: Business rules can be tested without a database, web server, or any other external element. Unit tests run in milliseconds.
3. Maintainability: By decoupling the "What" (Business Logic) from the "How" (Database, API, UI), the system becomes much easier to evolve over time.
4. Scalability & Flexibility: Easily swap a PostgreSQL database for MongoDB or a REST API for a gRPC interface by only changing the Infrastructure layer.

---

## Architecture Overview
<img width="772" height="567" alt="image" src="https://github.com/user-attachments/assets/88b6fd6f-149e-4e11-be97-96884a11c0f1" />

This project follows the Dependency Rule: Dependencies only point inwards.

### 1. Domain Layer (domain module)
- The Core: Contains Entities, Value Objects, and Domain Services.
- Rule: Pure Java. No Spring, No JPA, No external dependencies.

### 2. Application Layer (application module)
- The Orchestrator: Contains Use Cases (Interactors) and Port definitions.
- Input Ports: Interfaces called by the entry points (Web/CLI).
- Output Ports: Interfaces used to communicate with external tools (Persistence/Mail/External APIs).

### 3. Infrastructure Layer (infrastructure module)
- The Details: Implements Output Ports.
- Contents: Persistence logic (Spring Data JPA), External API clients, File system access.

### 4. Boot-App Layer (boot-app module)
- The Entry Point: Contains the Spring Boot main class, Configuration, and Web Adapters (Controllers).
- Responsibility: Wiring all modules together using Dependency Injection.

---

## Tech Stack
* Language: Java 17
* Framework: Spring Boot 3.x
* Database: PostgreSQL
* Mapping: MapStruct (for decoupling Domain Models and JPA Entities)
* Build Tool: Maven Multi-module
* Testing: JUnit 5, Mockito, AssertJ

---

## Getting Started

### Prerequisites
- JDK 17 or higher
- Maven 3.8+

### Installation
1. Clone the repository:
   git clone https://github.com/NgXuanBach/java-clean-architecture-template.git

2. Build all modules:
   mvn clean install

3. Run the application:
   mvn spring-boot:run -pl boot-app

---

## Project Structure
.
├── domain          # Pure Business Logic
├── application     # Use Cases & Port Interfaces
├── infrastructure  # Persistence, External APIs, Adapters
└── boot-app        # Configuration, Controllers & Application Entry
