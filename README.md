# quiz-app
# Quiz App - Microservices Architecture

## Overview

This project is a **scalable REST API** built for a Quiz Application using **Microservices Architecture**. The system is designed for high performance and seamless integration between multiple services, making it suitable for handling a large number of quizzes and questions efficiently.

## Key Features

- **Microservices Architecture**: The application is divided into separate services to manage quizzes and questions independently, improving scalability and performance.
  
- **Feign Client**: Implemented to ensure seamless communication between the **Question Service** and **Quiz Service**. The Feign client simplifies HTTP API calls between the microservices.

- **Eureka Server Integration**: Utilized **Eureka** for service discovery and registration, allowing microservices to dynamically register and discover each other, enhancing reliability and scalability.

- **Database Optimization**: 
  - Managed server load by implementing **database connection pooling** for efficient connection management.
  - Used **separate databases** for each microservice to prevent bottlenecks and ensure isolated database operations.

## Technologies Used

- **Java**
- **Spring Boot**
- **Netflix Eureka**
- **Feign Client**
- **MySQL**
  
## How to Run

1. **Clone the repository**
2. **Set up the Eureka Server:** Start the Eureka server to enable service discovery.
3. **Run each Microservice:** Run both the Question Service and Quiz Service separately using Spring Boot, ensuring that they register with the Eureka server.
4. **Configure Databases:** Set up individual databases for the Question Service and Quiz Service. Ensure each microservice points to its own database for optimal performance.
5. **Start the Application:** Once the Eureka server and microservices are running, the API is accessible for creating, updating, and managing quizzes and questions.

## Future Enhancements
Implement API Gateway for unified routing and security.
Add OAuth2 authentication for securing the microservices.
Enable Circuit Breaker for fault tolerance and reliability.

**Feel free to contribute or suggest improvements!**

