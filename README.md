# springboot-category-crud
A Spring Boot REST API project implementing CRUD operations for category management using clean architecture and proper exception handling.

A **Spring Boot REST API** project that demonstrates basic CRUD operations for **Category** management. This project is suitable for learning and practice purposes and follows standard Spring Boot layered architecture (Controller → Service).

---

## 🚀 Features

* RESTful APIs using Spring Boot
* CRUD operations on Category
* Exception handling using `ResponseStatusException`
* In-memory data handling (List based)
* Clean and simple structure

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Web (REST APIs)
* Maven

---

## 📂 Project Structure

```
SampleProject
│── src/main/java
│   └── com/lectures/SampleProject
│       ├── controller
│       ├── service
│       └── model
│
│── src/main/resources
│   └── application.properties
│
│── pom.xml
```

---

## ▶️ How to Run the Project

### Prerequisites

* Java 8 or higher
* Maven

### Steps

```bash
# Clone the repository
git clone <your-github-repo-url>

# Navigate to project directory
cd SampleProject

# Run the application
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 📌 API Endpoints

### ➤ Get All Categories

```
GET /api/categories
```

### ➤ Get Category by ID

```
GET /api/categories/{categoryID}
```

### ➤ Create Category

```
POST /api/admin/categories
```

**Request Body:**

```json
{
  "categoryName": "Electronics"
}
```

### ➤ Update Category

```
PUT /api/admin/categories/{categoryID}
```

**Request Body:**

```json
{
  "categoryName": "Updated Name"
}
```

### ➤ Delete Category

```
DELETE /api/admin/categories/{categoryID}
```

---

## ❗ Error Handling

* `404 NOT FOUND` → Category not found
* Proper HTTP status codes returned using `ResponseStatusException`

---

## 🧪 Testing

You can test APIs using:

* Postman
* Curl
* Browser (for GET requests)

---

## 📌 Notes

* Data is stored in-memory (List)
* Restarting the application will reset data
* Suitable for beginners learning Spring Boot REST APIs

---

## 👨‍💻 Author

**Sanket Khavale**

---

## 📜 License

This project is for learning and educational purposes.
