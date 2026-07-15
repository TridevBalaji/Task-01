# Task-01

# Random Even Number Table Generator

## Overview

This project is a simple console-based application developed in **Java**. It generates a square (P × P) table filled with random even numbers between **2** and **16**. The program allows the user to choose one of the even numbers, highlights every occurrence of that number in the table, and displays the total number of times it appears.

The application is designed to run entirely in the terminal and demonstrates the use of arrays, loops, conditional statements, random number generation, formatted output, and input validation.

---

## Features

- Accepts the size of the square array from the user.
- Generates random even numbers in the range **2–16** (inclusive).
- Displays the generated table with row and column indices.
- Allows the user to select an even number to highlight.
- Highlights all matching values in the table.
- Counts and displays the total number of occurrences.
- Validates user input and handles invalid entries gracefully.

---

## Technologies Used

- Java
- Java Standard Library
  - `Scanner`
  - `Random`

---

## Project Structure

```
github_repository_root/
│
├── Table.java
└── README.md
```

---

## How to Compile

```bash
javac Table.java
```

---

## How to Run

```bash
java Table
```

---

## Sample Execution

```
Enter array size (for P×P array): 5

Generated 2D array:
<img width="578" height="612" alt="image" src="https://github.com/user-attachments/assets/afac64be-2c84-4a4e-a095-c27c2beab377" />

...

Enter a number to highlight (even number 2–16): 12

Array with 12 highlighted:
...
<img width="578" height="612" alt="image" src="https://github.com/user-attachments/assets/c06b0013-eda2-4ffa-82a9-f9d59c36b02c" />

Number 12 appeared 9 time(s)
```

---

## Input Validation

The program checks for the following invalid inputs:

- Non-numeric values (e.g., `abc`)
- Array sizes less than or equal to zero
- Odd numbers
- Numbers outside the valid range (2–16)

If an invalid input is entered, the user is prompted again until a valid value is provided.

---

## Implementation Details

The application follows a simple workflow:

1. Read the array size from the user.
2. Generate a P × P array containing random even numbers.
3. Display the generated table.
4. Read the number to highlight.
5. Print the table again while highlighting matching values.
6. Count and display the total number of occurrences.

---
