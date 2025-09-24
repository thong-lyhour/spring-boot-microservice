# Microservices with Spring Boot, Eureka, Config Server, Keycloak, and API Gateway

This repository demonstrates a **microservices architecture** built with **Spring Boot** and secured with **Keycloak**. It includes a **service discovery server (Eureka)**, a **config server**, an **API gateway**, and multiple client services.

## 📂 Project Structure

- **rtr-eureka-server** → Service Discovery (Eureka)
- **config-server** → Centralized Configuration (Spring Cloud Config)
- **config-server-files** → Configuration files for microservices
- **keycloak-stack** → Docker Compose setup (Keycloak, Vault, RabbitMQ, PostgreSQL)
- **rtr-api-gateway** → API Gateway
- **customer-service** → Example client service

## 🛠 Requirements

- **Java 17+**
- **Maven 3.9+**
- **Docker & Docker Compose**

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo
```

### 2️⃣ Start Eureka Server

```bash
cd rtr-eureka-server
mvn spring-boot:run
```

Eureka will be available at: **http://localhost:8761**

### 3️⃣ Start Config Server

```bash
cd ../config-server
mvn spring-boot:run
```

Config Server will be available at: **http://localhost:8888**

### 4️⃣ Start Keycloak and Supporting Services

```bash
cd ../keycloak-stack
docker compose up -d
```

This will start:
- **Keycloak** (authentication & authorization)
- **PostgreSQL** (database for Keycloak)
- **RabbitMQ**
- **Vault**

Keycloak will be available at: **http://localhost:8080**

### 5️⃣ Start API Gateway

```bash
cd ../rtr-api-gateway
mvn spring-boot:run
```

### 6️⃣ Start Client Services

For example, to start the customer-service:

```bash
cd ../customer-service
mvn spring-boot:run
```

## ⚡ Startup Order

**Important**: Services must be started in the following order to ensure proper dependencies:

1. **Eureka Server**
2. **Config Server**
3. **Keycloak Stack** (via Docker Compose)
4. **API Gateway**
5. **Client Services** (e.g., customer-service)

## 🔐 Authentication & Security

- **Keycloak** handles authentication and authorization
- You need to configure your realm, clients, and roles inside Keycloak before testing microservices
- The API Gateway routes traffic securely through Keycloak

## 📌 Configuration Notes

- Update configuration files inside `config-server-files` as needed
- All services should be registered in Eureka for service discovery
- Ensure proper security configurations are in place for production environments

## 🏗 Architecture Overview

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   API Gateway   │    │  Eureka Server  │    │  Config Server  │
│   (Port 8080)   │    │   (Port 8761)   │    │   (Port 8888)   │
└─────────────────┘    └─────────────────┘    └─────────────────┘
         │                       │                       │
         └───────────────────────┼───────────────────────┘
                                 │
    ┌─────────────────────────────────────────────────────────┐
    │                                                         │
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Customer      │    │   Keycloak      │    │   Other         │
│   Service       │    │   Stack         │    │   Services      │
└─────────────────┘    └─────────────────┘    └─────────────────┘
```

## 🚦 Health Checks

Once all services are running, you can verify their status:

- **Eureka Dashboard**: http://localhost:8761
- **Config Server**: http://localhost:8888/actuator/health
- **Keycloak Admin Console**: http://localhost:8080/admin

## 🐛 Troubleshooting

- Ensure all ports are available before starting services
- Check Docker containers are running: `docker compose ps`
- Verify service registration in Eureka dashboard
- Check application logs for any startup errors

## 📚 Additional Resources

- [Spring Cloud Documentation](https://spring.io/projects/spring-cloud)
- [Keycloak Documentation](https://www.keycloak.org/documentation)
- [Netflix Eureka](https://github.com/Netflix/eureka)****
