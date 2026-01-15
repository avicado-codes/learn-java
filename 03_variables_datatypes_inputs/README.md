# Java Data Types, Variables, Input & Memory

---

## Table of Contents

1. [What Is a Variable](#1-what-is-a-variable)
2. [Why Variables Are Needed](#2-why-variables-are-needed)
3. [Real-World Analogy for Variables](#3-real-world-analogy-for-variables)
4. [Variable Name and Variable Value](#4-variable-name-and-variable-value)
5. [Data Stored in Variables](#5-data-stored-in-variables)
6. [Memory Basics (RAM vs Storage)](#6-memory-basics-ram-vs-storage)
7. [How Data Is Stored in Memory (0s and 1s)](#7-how-data-is-stored-in-memory-0s-and-1s)
8. [Memory Addresses and Allocation](#8-memory-addresses-and-allocation)
9. [Variable Declaration](#9-variable-declaration)
10. [Variable Initialization](#10-variable-initialization)
11. [Declaration vs Initialization](#11-declaration-vs-initialization)
12. [Updating Variable Values](#12-updating-variable-values)
13. [Default Values of Variables](#13-default-values-of-variables)
14. [Java Data Types — Overview](#14-java-data-types--overview)
15. [Primitive vs Non-Primitive Data Types](#15-primitive-vs-non-primitive-data-types)
16. [Integer Data Types (byte, short, int, long)](#16-integer-data-types-byte-short-int-long)
17. [Floating-Point Data Types (float, double)](#17-floating-point-data-types-float-double)
18. [Character Data Type (char)](#18-character-data-type-char)
19. [Boolean Data Type (boolean)](#19-boolean-data-type-boolean)
20. [Size of Data Types (bit vs byte)](#20-size-of-data-types-bit-vs-byte)
21. [Why Data Types Exist](#21-why-data-types-exist)
22. [Choosing the Right Data Type](#22-choosing-the-right-data-type)
23. [Literals in Java](#23-literals-in-java)
24. [Integer Literals](#24-integer-literals)
25. [Floating-Point Literals](#25-floating-point-literals)
26. [Character Literals](#26-character-literals)
27. [String Literals](#27-string-literals)
28. [Boolean Literals](#28-boolean-literals)
29. [Naming Conventions (Why They Matter)](#29-naming-conventions-why-they-matter)
30. [Camel Case, Snake Case, Kebab Case](#30-camel-case-snake-case-kebab-case)
31. [Java Naming Rules (Identifiers)](#31-java-naming-rules-identifiers)
32. [Keywords in Java](#32-keywords-in-java)
33. [Escape Sequences](#33-escape-sequences)
34. [Common Escape Sequences](#34-common-escape-sequences)
35. [Printing Multiple Lines with Escape Sequences](#35-printing-multiple-lines-with-escape-sequences)
36. [Introduction to User Input](#36-introduction-to-user-input)
37. [Scanner Class](#37-scanner-class)
38. [Importing Classes in Java](#38-importing-classes-in-java)
39. [Creating a Scanner Object](#39-creating-a-scanner-object)
40. [Taking User Input](#40-taking-user-input-)
41. [The "Skipped Input" Problem](#41-the-skipped-input-problem-common-bug)
42. [Type Conversion and Casting](#42-type-conversion-and-casting)
43. [Implicit Type Conversion (Widening)](#43-implicit-type-conversion-widening)
44. [Explicit Type Conversion (Narrowing / Casting)](#44-explicit-type-conversion-narrowing--casting)
45. [Data Loss During Casting](#45-data-loss-during-casting)
46. [Practical Examples of Type Conversion](#46-practical-examples-of-type-conversion)
47. [Programming Challenges Explained](#47-programming-challenges-explained)
48. [Challenge: Welcome Program](#48-challenge-welcome-program)
49. [Challenge: Add Two Numbers](#49-challenge-add-two-numbers)
50. [Common Beginner Mistakes](#50-common-beginner-mistakes)
51. [Best Practices for Beginners](#51-best-practices-for-beginners)
52. [Summary Card](#52-summary-card)

---

## 1. What Is a Variable
A **variable** is a named storage location in memory used to store data that can change during program execution.

```java
int age = 20;
```

* `age` is the variable name.
* `20` is the value stored in it.

A **variable** is a named memory location used to store data that can change during program execution.

## 2. Why Variables Are Needed
Programs solve problems using data.

**Example problem:**
* Take two numbers from the user
* Add them
* Show the result

Without variables, data would be lost immediately after use, making problem-solving impossible.

## 3. Real-World Analogy for Variables
Think of variables as **boxes**:
* Each box has a **label** → variable name
* Each box holds **something inside** → variable value
* You don’t remember where the box is, only the label



## 4. Variable Name and Variable Value
Every variable has:
* **Name** → used to access data
* **Value** → actual data stored

```java
int score = 95;
```

* **Name:** `score`
* **Value:** `95`

## 5. Data Stored in Variables
Variables can store:
* Numbers
* Text
* True/False values
* Characters

## 6. Memory Basics (RAM vs Storage)

| RAM | Storage |
| :--- | :--- |
| Temporary | Permanent |
| Fast | Slower |
| Cleared on shutdown | Data remains |

Variables live in **RAM**, not in permanent storage.

## 7. How Data Is Stored in Memory (0s and 1s)
Computers store everything as binary:
* `1` → ON
* `0` → OFF

Text, numbers, images — all are converted into binary internally.



## 8. Memory Addresses and Allocation
Each memory location has an address, like a house number.



```java
int a = 5;
```

## 9. Variable Declaration
Declaring a variable means **reserving memory**.

```java
int number;
```

## 10. Variable Initialization
Initialization means **assigning a value**.

```java
number = 10;
```

## 11. Declaration vs Initialization

| Declaration | Initialization |
| :--- | :--- |
| Reserves memory | Stores value |
| `int x;` | `x = 5;` |

**Combined:**
```java
int x = 5;
```

## 12. Updating Variable Values
Variables can change values.

```java
int count = 10;
count = 20; // Value updated
```

## 13. Default Values of Variables

| Type | Default |
| :--- | :--- |
| `int` | `0` |
| `float` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |

**Note:** Local variables must be initialized manually.

## 14. Java Data Types — Overview
Data types define:
1. What kind of data
2. How much memory



## 15. Primitive vs Non-Primitive Data Types
* **Primitive:** Store actual values, Fixed size
* **Non-Primitive:** Store references, Flexible size

## 16. Integer Data Types (byte, short, int, long)

| Type | Size |
| :--- | :--- |
| `byte` | 1 byte |
| `short` | 2 bytes |
| `int` | 4 bytes |
| `long` | 8 bytes |

```java
int age = 25;
long population = 8000000000L;
```

## 17. Floating-Point Data Types (float, double)

| Type | Size |
| :--- | :--- |
| `float` | 4 bytes |
| `double` | 8 bytes |

```java
float price = 99.99f;
double pi = 3.14159;
```

## 18. Character Data Type (char)
Stores a single character. Uses single quotes.

```java
char grade = 'A';
```

## 19. Boolean Data Type (boolean)
Stores only: `true` or `false`.

```java
boolean isAdult = true;
```

## 20. Size of Data Types (bit vs byte)
* 1 bit = 0 or 1
* 8 bits = 1 byte

## 21. Why Data Types Exist
* Efficient memory usage
* Faster programs
* Prevent errors

## 22. Choosing the Right Data Type
* **Bad:** `double age = 25;` (Wastes memory)
* **Good:** `int age = 25;`

## 23. Literals in Java
A literal is a fixed value written directly in code.

```java
int x = 10; // 10 is a literal
```

## 24. Integer Literals
* **Integer:** `10`, `-5`, `1000`


---

## 25. Floating-Point Literals
* **Floating-Point:** `3.14`, `5.0f`


---

## 26. Character Literals
* **Character:** `'a'`, `'Z'`


---

## 27. String Literals
* **String:** `"Hello World"`, `"Java Programming"`


---

## 28. Boolean Literals
* **Boolean:** `true`, `false`

## 29. Naming Conventions (Why They Matter)
Readable code = maintainable code.

## 30. Camel Case, Snake Case, Kebab Case
* **camelCase** → Java variables (`myVariableName`)
* **snake_case** → Some languages (Python)
* **kebab-case** → URLs (not Java)



## 31. Java Naming Rules (Identifiers)
* **Allowed:** Letters, Digits (not at start), `_` and `$`
* **Not allowed:** Keywords, Spaces, Special characters

## 32. Keywords in Java
Reserved words like: `int`, `class`, `public`, `static`.
**Cannot** be used as variable names.

## 33. Escape Sequences
Used to print special characters.

## 34. Common Escape Sequences

| Sequence | Meaning      |
|:---------|:-------------|
| `\n`     | New line     |
| `\t`     | Tab          |
| `\b`     | Backspace    |
| `\"`     | Double quote |
| `\'`     | Single quote |
| `\\`     | Backslash    |

## 35. Printing Multiple Lines with Escape Sequences

```java
System.out.print("Hello\nWorld");
```

## 36. Introduction to User Input
Programs become interactive using input. Instead of hard-coding values (like `int age = 20;`), we ask the user to type them.

## 37. Scanner Class
The `Scanner` class is the most common way to read input in Java. It is part of the `java.util` package.
It acts like a "listener" that waits for the user to type something and press Enter.

```java
import java.util.Scanner; // Must be imported before use
```

## 38. Importing Classes in Java
Java groups classes into packages. The `Scanner` class is not available by default (unlike `String` or `System`). The `import` keyword tells Java where to find the `Scanner` code so you can use it.

## 39. Creating a Scanner Object
Before taking input, you must create a "scanner object".

```java
Scanner input = new Scanner(System.in);
```
* **`Scanner`**: The class name.
* **`input`**: The variable name (you can call it `sc`, `scanner`, `reader`, etc.).
* **`new Scanner(...)`**: Creates a new instance.
* **`System.in`**: Tells the scanner to read from the "standard input stream" (the keyboard).

## 40. Taking User Input 
The `Scanner` class provides different methods for different data types. Using the wrong method (e.g., trying to read text into an integer variable) will cause a crash (Exception).

### A. Reading Strings (Text)
There are two ways to read text, and the difference is crucial.

**1. `next()`**

* **Usage:** Reads a **single word**.
* **Behavior:** It stops reading as soon as it sees a space (whitespace).
* **Why use it:** Good for reading first names, commands, or single-word codes.

```java
System.out.print("Enter your first name: ");
String firstName = input.next(); // If user types "John Doe", it only stores "John"
```

**2. `nextLine()`**

* **Usage:** Reads the **entire line** of text.
* **Behavior:** It reads everything until the user presses "Enter" (including spaces).
* **Why use it:** Used for full names, addresses, or sentences.

```java
System.out.print("Enter your full name: ");
String fullName = input.nextLine(); // Stores "John Doe"
```

### B. Reading Integers (Whole Numbers)

**1. `nextInt()`**
* **Usage:** Reads a standard integer (`int`).
* **Range:** -2 billion to 2 billion.
* **Why use it:** Age, year, quantity, simple IDs.

```java
System.out.print("Enter your age: ");
int age = input.nextInt();
```

**2. `nextLong()`**

* **Usage:** Reads a large integer (`long`).
* **Range:** Very large numbers.
* **Why use it:** Phone numbers, population counts, timestamps, bank account numbers.

```java
System.out.print("Enter your phone number: ");
long phone = input.nextLong();
```

**3. `nextShort()`**

* **Usage:** Reads a small integer (`short`).
* **Range:** -32,768 to 32,767.
* **Why use it:** Rarely used today, but saves memory for very small numbers like a small strict counter.

```java
short seatNumber = input.nextShort();
```

**4. `nextByte()`**

* **Usage:** Reads a tiny integer (`byte`).
* **Range:** -128 to 127.
* **Why use it:** Very raw data processing, specific file formats.

```java
byte protocolId = input.nextByte();
```

### C. Reading Decimals (Floating-Point Numbers)

**1. `nextFloat()`**

* **Usage:** Reads a floating-point number (`float`).
* **Why use it:** When memory is tight or high precision isn't critical (e.g., simple grades).

```java
System.out.print("Enter your GPA: ");
float gpa = input.nextFloat();
```

**2. `nextDouble()`**

* **Usage:** Reads a large floating-point number (`double`).
* **Why use it:** Default choice for decimals. Used for currency, scientific calculations, physics coordinates.

```java
System.out.print("Enter the value of Pi: ");
double pi = input.nextDouble();
```

### D. Reading Booleans (True/False)

**1. `nextBoolean()`**

* **Usage:** Reads exactly "true" or "false" (case-insensitive).
* **Why use it:** Yes/No questions, toggle settings.

```java
System.out.print("Are you a student? (true/false): ");
boolean isStudent = input.nextBoolean();
```

### E. Reading Characters (`char`)
**Important:** `Scanner` does **not** have a `nextChar()` method.
To read a single character, you must read the whole word/string and then just take the first letter.

**Usage:**

```java
System.out.print("Enter your grade (A/B/C): ");
char grade = input.next().charAt(0);
```

* **`input.next()`**: Reads the string (e.g., "A").
* **`.charAt(0)`**: Extracts the character at index 0 (the first character).

## 41. The "Skipped Input" Problem (Common Bug)
A very common issue occurs when you use `nextInt()` followed immediately by `nextLine()`.



**The Problem:**
1.  User types `25` and presses Enter.
2.  `nextInt()` reads `25` but leaves the "Enter" key press (newline character) in the buffer.
3.  The following `nextLine()` sees that leftover "Enter" and thinks the user finished typing an empty line.
4.  **Result:** The program skips the string input.

**The Fix:**
Add an extra `input.nextLine()` to consume the leftover newline.

```java
System.out.print("Enter Age: ");
int age = input.nextInt();

input.nextLine(); // CONSUME THE LEFTOVER NEWLINE

System.out.print("Enter Name: ");
String name = input.nextLine(); // Now this works correctly
```


## 42. Type Conversion and Casting
Converting one data type into another.

## 43. Implicit Type Conversion (Widening)
Small → Big (automatic). No data loss.

`byte → short → int → long → float → double`

```java
int a = 10;
double b = a;
```

## 44. Explicit Type Conversion (Narrowing / Casting)
Big → Small (manual). Potential data loss.

`double → float → long → int → short → short`

```java
double x = 5.5;
int y = (int) x;
```

## 45. Data Loss During Casting

```java
double x = 5.9;
int y = (int) x; // y = 5 (0.9 is lost)
```

## 46. Practical Examples of Type Conversion
**Real-life analogy:** Pouring water from a bucket into a glass causes overflow (data loss).



## 47. Programming Challenges Explained
Practice builds confidence.

## 48. Challenge: Welcome Program

```java
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
System.out.println("Welcome " + name + " to KG Coding");
```

## 49. Challenge: Add Two Numbers

```java
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(a + b);
```

## 50. Common Beginner Mistakes
* Forgetting initialization
* Using wrong data type
* Missing semicolon
* Ignoring input errors

## 51. Best Practices for Beginners
* Use meaningful names
* Choose correct data types
* Practice daily
* Read errors carefully

## 52. Summary Card

| Topic | Concept | Usage |
| :--- | :--- | :--- |
| **Variables** | Named memory box | Stores data like `age`, `score`. |
| **Data Types** | Defines type & size | `int` (numbers), `char` (text). |
| **Literals** | Fixed values | `10`, `3.14`, `'A'`, `true`. |
| **Scanner** | User Input | `new Scanner(System.in)` |
| **Type Casting** | Converting types | `(int) 5.5` -> `5` |
| **Escape Seq** | Special formatting | `\n` for new line. |