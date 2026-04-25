# 🛒 Product Management System

A simple and efficient **Product Management Web Application** built using **Spring Boot (Backend)** and **HTML/CSS/JavaScript (Frontend)**.

This project allows users to perform full **CRUD operations** (Create, Read, Update, Delete) on products.

---

## 🚀 Features

* ➕ Add new product
* ✏️ Update existing product
* ❌ Delete product by ID
* 🔍 Search product by ID
* 📋 View all products
* 🌐 Clean and user-friendly UI

---

## 🧑‍💻 Tech Stack

### 🔹 Frontend

* HTML
* CSS
* JavaScript

### 🔹 Backend

* Spring Boot
* Spring MVC
* Spring Data JPA

### 🔹 Database

* MySQL

---

## 📸 UI Preview

* Dashboard with options:

  * Add Product
  * Update Product
  * Delete Product
  * Search Product
  * View All Products

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/product-management.git
cd product-management
```

---

### 2️⃣ Configure Database

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Run the Backend

👉 Using Spring Tool Suite / IntelliJ:

* Run `ProductManagementApplication.java`

---

### 4️⃣ Open Frontend

👉 Open in browser:

```text
http://localhost:8080/product_management.html
```

---

## 📌 API Endpoints

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| POST   | /products      | Add product       |
| GET    | /products      | Get all products  |
| GET    | /products/{id} | Get product by ID |
| PUT    | /products/{id} | Update product    |
| DELETE | /products/{id} | Delete product    |

---

## 🧠 Concepts Used

* REST API development
* MVC Architecture
* CRUD operations
* Database integration
* Frontend-backend connection

---



## 👨‍💻 Author

**Juned Bankapur**
Final Year Computer Science Engineering Student

---

## ⭐ Note

This project is part of my learning journey towards becoming a **Java Full Stack Developer**.
