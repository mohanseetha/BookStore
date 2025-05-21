# 📚 Bookstore API

*A Spring Boot backend for those who believe every book deserves a digital afterlife.*

## 📖 Overview

The **Bookstore API** is built with Spring Boot, designed to manage your collection of books with clarity and intention. It’s a RESTful backend that lets you create, read, update, and delete book records—think of it as a quiet, persistent librarian who never sleeps.

## ✨ Features

- Add new books to your library  
- Retrieve all books or a single book by ID  
- Update book details as stories evolve  
- Delete books when their time has passed

## 🛠️ Tech Stack

- **Java 17+**  
- **Spring Boot**  
- **Maven**
- **MongoDB**

## 📌 API Endpoints

| Method | Endpoint         | Description                 |
|--------|------------------|-----------------------------|
| GET    | `/books`         | List all books              |
| GET    | `/books/{id}`    | Get details of a book       |
| POST   | `/books`         | Add a new book              |
| PATCH  | `/books/{id}`    | Update a book’s details     |
| DELETE | `/books/{id}`    | Remove a book               |

## 🚀 Getting Started

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/mohanseetha/BookStore.git](https://github.com/mohanseetha/BookStore.git)
    ```
    ```bash
    cd BookStore
    ```

2.  **Build the project:**
    ```bash
    ./mvnw clean install
    ```

3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```

4. **Access the API**

  - The server will be running at `http://localhost:8080`.
  - You can now test the endpoints using tools like Postman, curl, or your preferred HTTP client.

## 📝 Example Book JSON

Here's a sample JSON representation of a book object that you can use when making POST or PUT requests:

```json
{
  "bookTitle": "Atomic Habits",
  "bookAuthor": "James Clear",
  "bookPublisher": "Penguin Random House",
  "bookYear": 2018,
  "bookPrice": 999
}
