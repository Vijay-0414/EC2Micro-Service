# EC2Demo-Microservices

A minimal Spring Boot **multi-module (monorepo)** with **three microservices**.

## Structure
```
EC2Demo-Microservices/
├── pom.xml
├── service-1/
├── service-2/
├── service-3/
├── ecs-task-defs/
└── docker-compose.yml
```

## Build (all services)
```bash
mvn -q -DskipTests package
```

## Run locally with Docker Compose
```bash
docker compose up --build
```
- Service 1 → http://localhost:8081/hello
- Service 2 → http://localhost:8082/hello
- Service 3 → http://localhost:8083/hello

## Docker: build & tag single service
```bash
# from repo root
docker build -t service-1:local ./service-1
```

## ECS task defs
Edit image URIs in `./ecs-task-defs/*.json` to match your ECR repos.
