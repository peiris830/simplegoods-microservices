# SimpleGoods Microservices

Microservices architecture for the SimpleGoods e-commerce platform.

## Services

| Service | Port | Description |
|---------|------|-------------|
| Eureka Server | 8761 | Service Discovery |
| Config Server | 8888 | Centralized Configuration |
| API Gateway | 9000 | Routing & JWT Validation |
| Auth Service | 8081 | Authentication & Users |
| Product Service | 8082 | Product Catalog |
| Cart Service | 8083 | Shopping Cart (Redis) |
| Order Service | 8084 | Order Processing |

## Getting Started

### Prerequisites
- Java 21
- Maven 3.9+
- Docker (for PostgreSQL & Redis)

### Running Eureka Server
```bash
cd eureka-server
mvn spring-boot:run
```

Access dashboard at: http://localhost:8761

## Architecture

```
┌─────────────┐     ┌─────────────┐
│   Frontend  │────▶│ API Gateway │
└─────────────┘     └──────┬──────┘
                           │
        ┌──────────────────┼──────────────────┐
        ▼                  ▼                  ▼
   ┌─────────┐       ┌─────────┐       ┌─────────┐
   │  Auth   │       │ Product │       │  Order  │
   │ Service │       │ Service │       │ Service │
   └─────────┘       └─────────┘       └─────────┘
        │                  │                  │
        └──────────────────┴──────────────────┘
                           │
                    ┌──────┴──────┐
                    │   Eureka    │
                    │   Server    │
                    └─────────────┘
```

## Related Repositories
- [simplegoods](https://github.com/peiris830/simplegoods) - Monolith backend
- [simplegoods-frontend](https://github.com/peiris830/simplegoods-frontend) - Angular frontend
