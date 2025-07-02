# Food Delivery Backend

A multi-module Spring Boot application for a food delivery platform, using MySQL as the database.  

## 📦 Modules

- **api-main**: Entry point and REST API layer (controllers, DTOs).
- **persistence**: JPA entities and repositories.
- **domain**: Business domain models.
- **service**: Business logic layer.

## ⚙️ Features

✅ REST API with Spring Boot  
✅ JPA/Hibernate for database interactions  
✅ MySQL database integration  
✅ Modular Maven project structure  
✅ Domain-driven design with separate entity & domain layers  

## 🚀 Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name


CREATE DATABASE your_db_name;


spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_mysql_user
spring.datasource.password=your_mysql_password


./mvnw clean install
./mvnw spring-boot:run -pl api-main
http://localhost:8080/


food-delivery-backend/
├── api-main/       # API and main Spring Boot app
├── persistence/    # JPA entities, repositories
├── domain/         # Domain models
├── service/        # Business logic services
├── pom.xml         # Parent Maven pom
└── README.md



---

## ✅ What to change:
- Replace `your-username/your-repo-name` with your real GitHub repo URL.
- Update `your_db_name`, `your_mysql_user`, etc., with your actual database configuration.
- Add any other details, e.g. team members, known issues, or contributing guidelines.

---

Would you like help adding badges, like GitHub Actions build status or code coverage?
