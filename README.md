# Intel Travel System - Spring Microservices with Saga Pattern

## 📌 Overview
This project is a **flight, hotel, and restaurant booking system** built using **Spring Boot Microservices** and **Saga Pattern** to handle distributed transactions.

## 🏗️ Architecture
The system consists of the following microservices:

- **IAM Service**: Manages user authentication & profiles.
- **Flight Service**: Handles flight ticket reservations.
- **Hotel Service**: Manages hotel bookings.
- **Restaurant Service**: Handles restaurant table reservations.
- **Payment Service**: Processes payments.
- **Notification Service**: Sends confirmation emails.
- **API Gateway**: Acts as API Gateway.
- **Discovery Server (Eureka)**: Enables service discovery.

## ⚙️ Technologies Used
- **Spring Boot & Spring Cloud** (Eureka, OpenFeign, Gateway, Config Server)
- **Spring Security & JWT** for authentication
- **Kafka** for event-driven communication
- **PostgreSQL** for relational data storage
- **Docker & Kubernetes** for containerization and orchestration

## 🔄 Saga Pattern Implementation
This project uses **Choreography-based Saga**, where each microservice listens to events and reacts accordingly to maintain transaction consistency across services.

### 🛠️ Saga Workflow
1. **User initiates booking** → Event is published.
2. **Flight Service listens to the event and reserves tickets**, then publishes a success/failure event.
3. **Hotel Service listens to the flight event and reserves a room**, then publishes a success/failure event.
4. **Restaurant Service listens to the hotel event and reserves a table**, then publishes a success/failure event.
5. **Payment Service listens to the restaurant event and processes payment**, then publishes a success/failure event.
6. **Notification Service listens to the payment event and sends confirmation**.
7. **If any step fails, compensating events are triggered to rollback previous actions**.

## 🏗️ Project Structure
```bash
intel-travel-api/
├── api-gateway/
├── discovery-service/
├── iam-service/
├── flight-service/
├── hotel-service/
├── restaurant-service/
├── payment-service/
├── notification-service/
├── docker-compose.yml
└── README.md
```
