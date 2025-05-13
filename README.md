## 🏦 **Project Title**:

**ATM Interface Simulation in Java**

---

## 📝 **Project Description**:

This Java-based **ATM Interface** is a simple command-line application that simulates the basic operations of an Automated Teller Machine. It allows a user to perform key banking transactions such as **Withdraw**, **Deposit**, and **Check Balance**, with proper constraints like **minimum balance requirement**.

The project focuses on object-oriented principles, user input handling, and conditional logic — making it a perfect fit for students and beginners learning Java.

---

## 🎯 **Key Features**:

### 1. **Initialization**:

* The user is prompted to enter:

  * An **initial account balance**
  * A **minimum balance**
* If the initial balance is less than the minimum balance, the program exits with a warning.

### 2. **Main Functionalities**:

The application provides the following options through a menu:

1. **Withdraw** – Deducts money if sufficient balance remains after maintaining the minimum.
2. **Deposit** – Adds money to the current balance.
3. **Check Balance** – Displays the current account balance.
4. **Exit** – Ends the session with a thank-you message.

### 3. **Transaction Logic**:

* Uses `Scanner` for real-time user input.
* Validates withdrawal to ensure the account never goes below the defined minimum balance.
* Displays confirmation messages after each operation.

---

## 🛠️ **Technologies Used**:

| Technology  | Description                                                            |
| ----------- | ---------------------------------------------------------------------- |
| **Java**    | Programming language used                                              |
| **JDK CLI** | Code compiled and run using the Java Development Kit on command prompt |
| **Scanner** | Used to capture user input interactively                               |

---

## 📌 **Highlights**:

* Fully text-based and interactive.
* Demonstrates use of:

  * **Classes and objects**
  * **Constructors**
  * **Method overloading (if extended)**
  * **Conditional statements (`if`, `else`)**
* Enforces banking rules via logic (minimum balance constraint).
* Cleanly formatted console output for each operation.

---

## 💡 **Possible Enhancements**:

* Add **PIN authentication**.
* Store data using **files** or a **database**.
* Track **transaction history**.
* Implement using **GUI** (Java Swing).
* Add exception handling for non-numeric inputs.

---

## 🎓 **Learning Outcomes**:

* Understand how to use constructors and object-oriented programming.
* Learn how to interact with users using the console.
* Handle conditional logic and arithmetic operations in real-world scenarios.
* Get experience writing modular and maintainable code.
