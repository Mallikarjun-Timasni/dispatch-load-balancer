# Dispatch Load Balancer

## Description
A Spring Boot application that optimizes the allocation of delivery orders to vehicles based on location, priority, and capacity.

## Setup Instructions

### 1. Clone the Repository
```sh
git clone https://github.com/YOUR_GITHUB_USERNAME/dispatch-load-balancer.git
cd dispatch-load-balancer
```

### 2. Build the Project
```sh
mvn clean install
```

### 3. Run the Application
```sh
mvn spring-boot:run
```

### 4. Test APIs
Use **Postman** or `curl` to test the following endpoints:
- `POST /api/dispatch/orders`
- `POST /api/dispatch/vehicles`
- `GET /api/dispatch/plan`
