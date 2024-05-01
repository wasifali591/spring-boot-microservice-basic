
# Spring Boot Microservice Basic

This repository contains a basic microservice ecosystem built using Spring Boot. The ecosystem consists of several services, including a discovery server, a gateway server, and additional microservices.

## Services

1. **Discovery Server**:
   - This service is responsible for service discovery and registration. It uses Spring Cloud Netflix Eureka Server.
   - **Port**: 8762
   - **Endpoint**: [http://localhost:8761](http://localhost:8761)

2. **Gateway Server**:
   - The gateway server acts as an entry point for clients and routes requests to the appropriate microservices. It utilizes Spring Cloud Gateway.
   - **Port**: 8090
   - **Endpoint**: [http://localhost:8080](http://localhost:8080)

3. **Movie Catalog Service**:
   - The movie catalog service manages information about movies and their associated details, including ratings and descriptions.
   - **Port**: 8081
   - **Endpoint**: [http://localhost:8081](http://localhost:8081)

4. **Movie Info Service**:
   - This microservice provides information about movies, such as title, description, and release year.
   - **Port**: 8082
   - **Endpoint**: [http://localhost:8082](http://localhost:8082)

5. **Rating Data Service**:
   - The rating data service handles movie ratings and reviews, allowing users to rate movies and view average ratings.
   - **Port**: 8083
   - **Endpoint**: [http://localhost:8083](http://localhost:8083)

6. **Messaging Service (RabbitMQ)**:
   - This service handles messaging using RabbitMQ for asynchronous communication between microservices.
   - It includes a `rabbitmq.properties` file for centralized configuration of RabbitMQ properties.

## Technologies Used

- Spring Boot
- Spring Cloud Netflix Eureka Server
- Spring Cloud Gateway
- RabbitMQ (Messaging Service)

## Getting Started

To get started with the microservice ecosystem, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/wasifali591/spring-boot-microservice-basic.git
   ```

2. Navigate to the root directory:

   ```bash
   cd spring-boot-microservice-basic
   ```

3. Build and run the services:

   - Start the discovery server:
     ```bash
     cd discovery-server
     ./mvnw spring-boot:run
     ```

   - Start the gateway server:
     ```bash
     cd gateway-server
     ./mvnw spring-boot:run
     ```

   - Start the movie catalog service:
     ```bash
     cd movie-catalog-service
     ./mvnw spring-boot:run
     ```

   - Start the movie info service:
     ```bash
     cd movie-info-service
     ./mvnw spring-boot:run
     ```

   - Start the rating data service:
     ```bash
     cd rating-data-service
     ./mvnw spring-boot:run
     ```

   - Start the messaging service:
     ```bash
     cd messaging-service
     ./mvnw spring-boot:run
     ```

4. Access the services:

   - Discovery Server: [http://localhost:8761](http://localhost:8761)
   - Gateway Server: [http://localhost:8090](http://localhost:8090)
   - Movie Catalog Service: [http://localhost:8081](http://localhost:8081)
   - Movie Info Service: [http://localhost:8082](http://localhost:8082)
   - Rating Data Service: [http://localhost:8083](http://localhost:8083)

## Additional Information

- **Messaging Service (RabbitMQ)**:
  - This service handles messaging using RabbitMQ for asynchronous communication between microservices.
  - It includes a `rabbitmq.properties` file for centralized configuration of RabbitMQ properties.

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.
