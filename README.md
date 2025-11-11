# 🍔 Food Delivery App Backend

A complete backend API for an **Online Food Ordering and Delivery Platform**, built using **Spring Boot 3**, **Spring Data JPA**, **Hibernate**, and **MySQL**.  
It supports **user management, restaurants, menu items, orders, ratings, and authentication**.

---

## 🚀 Tech Stack

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA / Hibernate**
- **MySQL / H2 (for testing)**
- **Spring Security with JWT**
- **Lombok**
- **Jackson for JSON serialization**
- **Maven**

---

## 📁 Project Structure




---

## 🧩 Main Modules Overview

### 👤 User Management
- User Registration, Login, and JWT Authentication
- Role-based access (USER / ADMIN / RESTAURANT_OWNER)
- Update Profile, Address, Contact Info

### 🍽️ Restaurant Management
- CRUD for restaurants
- Menu management (add, update, delete food items)
- Manage opening hours, cuisines, and images

### 🛒 Order Management
- Place new orders
- Track order status (`PENDING`, `CONFIRMED`, `DELIVERED`, `CANCELLED`)
- Handle payments and order history

### ⭐ Reviews & Ratings
- Users can review restaurants
- Calculate average ratings per restaurant

### 💳 Payment
- Payment entities and simulated payment process
- Integration-ready for Razorpay / Stripe (future)

---

## ⚙️ Configuration

`application.yml`
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/food_delivery
    username: root
    password: root
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
  application:
    name: food-delivery

jwt:
  secret: your-secret-key
  expiration: 86400000 # 1 day
