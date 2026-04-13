# Vehicle Rental Management System (OOP)

A modular, Java-based management system designed to automate vehicle leasing operations using advanced Object-Oriented Programming (OOP) principles.

## 📌 Project Overview
The **Vehicle Rental Management System** is a technical solution for fleet operators to manage inventory and automate rental pricing. By utilizing a class hierarchy, the system differentiates between vehicle types (Cars and Bikes) to apply specific business rules, such as luxury taxes or long-term rental discounts.

## 🚀 Key Features
- **Dynamic Pricing Engine:** Calculates rent based on vehicle type and duration.
- **Unified Interface:** Uses polymorphism to process different vehicle types through a single reference.
- **Automatic Reporting:** Generates detailed receipts including brand, ID, and total cost.
- **Scalable Architecture:** Built with abstraction to allow easy addition of new vehicle types (e.g., Trucks, EVs).

## 🛠 Tech Stack
- **Language:** Java
- **Concepts:** Inheritance, Abstraction, Polymorphism, Encapsulation, Method Overriding.

## 🧠 Challenges, Solutions & Learnings

### 1. The Pricing Logic Dilemma
**Challenge:** Initially, I tried using `if-else` blocks in a single class to calculate rent, which made the code messy and hard to scale when new vehicle types were added.
**Solution:** I implemented **Method Overriding**. By creating an `abstract` base class and letting subclasses define their own `calculateRent()` logic, I decoupled the pricing rules from the main engine.
**Learning:** This taught me the **Open-Closed Principle**—software entities should be open for extension but closed for modification.

### 2. Handling Object Identity
**Challenge:** Ensuring that subclass constructors properly initialized the common attributes (like `vehicleNumber`) without repeating code.
**Solution:** I utilized the **`super()` keyword**. This allowed me to pass shared data to the parent constructor, ensuring a single source of truth for base attributes.
**Learning:** I gained a deep understanding of how constructor chaining works in Java.

### 3. Runtime Flexibility
**Challenge:** I wanted the system to handle a list of mixed vehicles without knowing their specific type beforehand.
**Solution:** I used **Dynamic Method Dispatch (Polymorphism)**. By using a `Vehicle` reference to point to `Car` or `Bike` objects, the JVM determines which method to run at execution time.
**Learning:** This project solidified my understanding of how polymorphism enables flexible and interchangeable code structures.

## 📂 Class Structure
- **`Vehicle` (Abstract):** Defines the core attributes and the contract for rent calculation.
- **`Car` (Subclass):** Adds Luxury Tax logic.
- **`Bike` (Subclass):** Adds Bulk Discount logic.
- **`RentalManagementSystem`:** The main driver class that executes the workflow.

## 🔧 Installation & Usage
1. Clone the repository.
2. Compile the Java files: `javac RentalManagementSystem.java`
3. Run the application: `java RentalManagementSystem`

---
*Developed as an OOP Project to demonstrate the design of flexible and reusable software systems.*
