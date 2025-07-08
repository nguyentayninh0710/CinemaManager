# 🎬 Movie Theater Seating and Concession Management

## 🎯 Problem Statement

You are tasked with developing a simplified system for managing seating and concession sales in a movie theater.  
Each seat in the theater can be either **available** or **reserved by a customer**. When a seat is reserved, the system must also track any additional concession items (e.g., popcorn, soda) purchased by the customer.

Your solution must utilize:

- **Object-Oriented Programming concepts**
- **Two-dimensional arrays** to model seat arrangements
- **ArrayLists** to manage variable-length lists of purchased items

---

## ✨ Program Requirements

Your program must define the following classes:

---

### 🟢 Class `Seat`

**Instance Variables:**

- `private boolean reserved` – Indicates whether the seat has been reserved.
- `private String customerName` – The name of the customer who reserved the seat.
- `private ArrayList<String> items` – A list of purchased concession items.

**Constructors:**

- A no-argument constructor that initializes the seat as not reserved, with no customer name and an empty list of items.

**Methods:**

- `public void reserve(String name)` – Marks the seat as reserved and sets the customer name.
- `public void cancelReservation()` – Cancels the reservation, resets the customer name, and clears the list of items.
- `public boolean isReserved()` – Returns the reservation status.
- `public void addItem(String item)` – Adds a concession item to the list.
- `public String toString()` – Returns `"O"` if the seat is available, or `"X(customerName)"` if reserved.

---

### 🟢 Class `Cinema`

**Instance Variables:**

- `private Seat[][] seats` – A 2D array representing all seats in the theater.

**Constructor:**

- `public Cinema(int rows, int cols)` – Creates a theater layout with the specified number of rows and columns, initializing all seats.

**Methods:**

- `public void reserveSeat(int row, int col, String customerName)` – Reserves a specific seat.
- `public void cancelReservation(int row, int col)` – Cancels the reservation for a specific seat.
- `public void addItemToSeat(int row, int col, String item)` – Adds a concession item for the customer in the specified seat.
- `public void displaySeating()` – Prints the seating chart showing available and reserved seats.
- `public void displaySeatDetails(int row, int col)` – Displays the customer name and the list of purchased items for the specified seat.
- `public int countReservedSeats()` – Returns the total number of reserved seats.
- `public boolean isFull()` – Returns `true` if all seats are reserved.

---

### 🟢 Class `Main`

In your `Main` class (or in a `main` method), demonstrate the functionality of your classes by performing the following sequence:

1. Create a `Cinema` with 5 rows and 8 columns.
2. Reserve two seats for different customers (e.g., "Anna" and "Bob").
3. For each reserved seat, add at least one concession item.
4. Display the seating chart.
5. Display detailed information for one of the reserved seats.
6. Print the total number of reserved seats.
7. Indicate whether the theater is fully booked.
8. Cancel one reservation.
9. Display the seating chart again to confirm the cancellation.

---

## 🧠 Example Output

<pre>
Current Seating:
O O O O O O O O
O X(Anna) O O O O O O
O O X(Bob) O O O O O
O O O O O O O O
O O O O O O O O

Seat Details [Row 2, Column 2]:
Customer: Anna
Items purchased:
- Popcorn
- Soda

Total reserved seats: 2
Is the cinema full? false

Cancelling reservation for Bob...

Current Seating:
O O O O O O O O
O X(Anna) O O O O O O
O O O O O O O O
O O O O O O O O
O O O O O O O O
</pre>



---

## 📋 Submission Guidelines

Your code must:

- Use clear and consistent naming conventions.
- Follow proper encapsulation (private fields, public methods).
- Include comments describing the purpose of each class and method.
- Compile and run without errors.

---

✅ **This exercise will help you practice:**

- Designing classes with constructors and instance variables.
- Managing 2D arrays of objects.
- Utilizing ArrayLists to handle dynamic collections.
- Combining OOP principles with realistic scenarios.

---

