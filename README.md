
# Spring Boot Microservice Basic

This repository contains a basic microservice ecosystem built using Spring Boot. The ecosystem consists of several services, including a discovery server, a gateway server, and additional microservices.

## Services

1. **Discovery Server**:
    - This service is responsible for service discovery and registration. It uses Spring Cloud Netflix Eureka Server.

2. **Gateway Server**:
    - The gateway server acts as an entry point for clients and routes requests to the appropriate microservices. It utilizes Spring Cloud Gateway.

3. **Movie Catalog Service**:
    - The movie catalog service manages information about movies and their associated details, including ratings and descriptions.

4. **Movie Info Service**:
    - This microservice provides information about movies, such as title, description, and release year.

5. **Rating Data Service**:
    - The rating data service handles movie ratings and reviews, allowing users to rate movies and view average ratings.

## Technologies Used

- Spring Boot
- Spring Cloud Netflix Eureka Server
- Spring Cloud Gateway

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

4. Access the services:
    - Discovery Server: [http://localhost:8761](http://localhost:8762)
    - Gateway Server: [http://localhost:8080](http://localhost:8090)
    - Movie Catalog Service: [http://localhost:8081](http://localhost:8081)
    - Movie Info Service: [http://localhost:8082](http://localhost:8082)
    - Rating Data Service: [http://localhost:8083](http://localhost:8083)

## Additional Information

### Discovery Server

- **Port**: 8762
- **Endpoint**: [http://localhost:8761](http://localhost:8762)
- This service registers other microservices with Eureka for service discovery.

### Gateway Server

- **Port**: 8090
- **Endpoint**: [http://localhost:8080](http://localhost:8090)
- This service acts as an API gateway, routing requests to the appropriate microservices based on the request path.

### Movie Catalog Service

- **Port**: 8081
- **Endpoint**: [http://localhost:8081](http://localhost:8081)
- The movie catalog service manages information about movies and their associated details, including ratings and descriptions.

### Movie Info Service

- **Port**: 8082
- **Endpoint**: [http://localhost:8082](http://localhost:8082)
- This microservice provides information about movies, such as title, description, and release year.

### Rating Data Service

- **Port**: 8083
- **Endpoint**: [http://localhost:8083](http://localhost:8083)
- The rating data service handles movie ratings and reviews, allowing users to rate movies and view average ratings.

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.
