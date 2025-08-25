# Users Backend (Spring Boot)

Simple in-memory Users API for React frontend.

## Endpoints
- `GET /api/users` → returns list of users
- `POST /api/users` → accepts JSON `{ "firstName": "...", "lastName": "..." }` and returns created user

## Run
```bash
mvn spring-boot:run
# or
./mvnw spring-boot:run
```
Server runs on `http://localhost:8080`.

## Sample cURL
```bash
curl -X POST http://localhost:8080/api/users   -H "Content-Type: application/json"   -d '{"firstName":"Ada","lastName":"Lovelace"}'

curl http://localhost:8080/api/users
```

## Folder Overview
    * src/main/java/in/main/ → Main source code  

           * config/ → Global configurations (like CORS setup)

            * controller/ → REST API endpoints

            * dto/ → Data Transfer Objects (for API requests/responses)

            * exception/ → Custom exception handling

            * model (or entity)/ → Database entities (User, etc.)

            * service/ → Business logic of the application

            * src/main/resources/

                * application.properties → Application configurations
