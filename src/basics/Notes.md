# Java Basics

---

## Table of Contents

1. [Purpose of Java Basics Unit](#1-purpose-of-java-basics-unit)
2. [What You Will Learn by the End of This Unit](#2-what-you-will-learn-by-the-end-of-this-unit)
3. [Installing Java (JDK)](#3-installing-java-jdk)
4. [Verifying Java Installation](#4-verifying-java-installation)
5. [Understanding JDK, JRE, and JVM](#5-understanding-jdk-jre-and-jvm)
6. [Java Compilation and Execution Flow](#6-java-compilation-and-execution-flow)
7. [Writing Your First Java Program (Text Editor)](#7-writing-your-first-java-program-text-editor)
8. [File Extensions in Java (.java and .class)](#8-file-extensions-in-java-java-and-class)
9. [Compiling Java Code Using Terminal](#9-compiling-java-code-using-terminal)
10. [Running Java Programs Using Terminal](#10-running-java-programs-using-terminal)
11. [Understanding Output in Java (print vs println)](#11-understanding-output-in-java-print-vs-println)
12. [What Is Input and Output in Programming](#12-what-is-input-and-output-in-programming)
13. [Anatomy of a Java Program](#13-anatomy-of-a-java-program)
14. [Understanding class in Java](#14-understanding-class-in-java)
15. [Understanding the main Method](#15-understanding-the-main-method)
16. [Why main Method Is Mandatory](#16-why-main-method-is-mandatory)
17. [Role of JVM in Program Execution](#17-role-of-jvm-in-program-execution)
18. [What Happens If main Is Missing](#18-what-happens-if-main-is-missing)
19. [Syntax Errors vs Runtime Errors](#19-syntax-errors-vs-runtime-errors)
20. [Why Semicolon Is Mandatory](#20-why-semicolon-is-mandatory)
21. [Java Is Case-Sensitive](#21-java-is-case-sensitive)
22. [Viewing Bytecode (.class File)](#22-viewing-bytecode-class-file)
23. [Why Java Uses Bytecode](#23-why-java-uses-bytecode)
24. [Platform Independence (Write Once, Run Anywhere)](#24-platform-independence-write-once-run-anywhere)
25. [Java vs C/C++ Compilation Model](#25-java-vs-cc-compilation-model)
26. [Java Memory Safety and Security](#26-java-memory-safety-and-security)
27. [Introduction to IDE (Integrated Development Environment)](#27-introduction-to-ide-integrated-development-environment)
28. [Why IDEs Exist](#28-why-ides-exist)
29. [Features of an IDE](#29-features-of-an-ide)
30. [Installing IntelliJ IDEA (Community Edition)](#30-installing-intellij-idea-community-edition)
31. [Creating First Java Project in IntelliJ](#31-creating-first-java-project-in-intellij)
32. [Project Structure in IntelliJ](#32-project-structure-in-intellij)
33. [Source Folder (src)](#33-source-folder-src)
34. [Output Folder (out)](#34-output-folder-out)
35. [Running Java Programs in IntelliJ](#35-running-java-programs-in-intellij)
36. [IntelliJ Auto-Compilation and Auto-Run](#36-intellij-auto-compilation-and-auto-run)
37. [Error Detection in IDE](#37-error-detection-in-ide)
38. [Role of Libraries in Java](#38-role-of-libraries-in-java)
39. [What Are Java Standard Libraries](#39-what-are-java-standard-libraries)
40. [Real-World Example: Java Development vs Bicycle Manufacturing](#40-real-world-example-java-development-vs-bicycle-manufacturing)
41. [Summary Card](#41-summary-card)
---

## 1. Purpose of Java Basics Unit

The goal of this unit is to **prepare you completely** to write, compile, and run Java programs.

By the end of this unit:
- Java is installed correctly
- You understand how Java programs work internally
- You can write and run Java programs using terminal and IDE
- You understand how JVM executes Java code

---

## 2. What You Will Learn by the End of This Unit

You will be able to:
- Install Java Development Kit (JDK)
- Verify installation using terminal
- Write a basic Java program
- Compile and run Java code manually
- Understand how IDE simplifies development
- Understand the structure of Java programs

---

## 3. Installing Java (JDK)

Java programs are written and compiled using **JDK (Java Development Kit)**.

Steps:
1. Search: `Download JDK`
2. Open Oracle website
3. Download **LTS (Long-Term Support)** version (e.g., Java 17 or Java 21)
4. Install normally like any other software

LTS versions are stable and supported for many years.

---

## 4. Verifying Java Installation

After installation, verify using terminal or command prompt.

```bash
javac -version
```

If output appears like:

```bash
javac 21.0.1
```

It means Java is installed correctly.

---

## 5. Understanding JDK, JRE, and JVM

### JDK (Java Development Kit)

Used by developers to:
- Write Java code
- Compile Java programs
- Generate documentation

Contains:
- Compiler (javac)
- JRE
- Tools and utilities

---

### JRE (Java Runtime Environment)

Used to:
- Run Java programs

Contains:
- JVM
- Core libraries

Users who only run Java programs need JRE.

---

### JVM (Java Virtual Machine)

Responsible for:
- Executing Java bytecode
- Converting bytecode into machine code
- Managing memory and security

Each operating system has its own JVM.

---

## 6. Java Compilation and Execution Flow

```text
.java (Source Code)
|
v
javac (Compiler)
|
v
.class (Bytecode)
|
v
JVM
|
v
Machine Code
```

---

## 7. Writing Your First Java Program (Text Editor)

Example:

```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming");
    }
}
```

---

## 8. File Extensions in Java

### .java
- Human-readable source code
- Written by developers
- Editable

### .class
- Compiled bytecode
- Not human-readable
- Used by JVM
- Should not be edited

---

## 9. Compiling Java Code Using Terminal

```bash
javac FirstProgram.java
```

This creates:

```bash
FirstProgram.class
```

---

## 10. Running Java Programs Using Terminal

```bash 
java FirstProgram
```

Note:
- Do NOT include .class extension
- JVM locates and runs bytecode

---

## 11. Understanding Output in Java

### print()

```text
System.out.print("Hello");
System.out.print("World");
```

```text
Output:
HelloWorld
```

---

### println()

```text
System.out.println("Hello");
System.out.println("World");
```

```text
Output:
Hello  
World
```

---

## 12. What Is Input and Output in Programming

### Input
- Data given to the program  
  Example: numbers entered by user

### Output
- Result produced by the program  
  Example: printed result

Real-world analogy:
- Input: Money given to shopkeeper
- Output: Items received

---

## 13. Anatomy of a Java Program

```java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

Components:
- Access modifier (public)
- Class declaration
- Main method
- Statements
- Semicolon

---

## 14. Understanding class in Java

Class is a blueprint.

Example:

```java
class Human {
    int age;
    void speak() {
        System.out.println("Speaking");
    }
}
```

---

## 15. Understanding the main Method

public static void main(String[] args)

This is the entry point of a Java program.

---

## 16. Why main Method Is Mandatory

JVM starts execution from main.

Without main:

```text
Error: Main method not found
```

---

## 17. Role of JVM in Program Execution

JVM:
- Loads class
- Verifies bytecode
- Executes instructions
- Manages memory

---

## 18. What Happens If main Is Missing

- Compilation succeeds
- Execution fails

Reason:
- JVM does not know where to start

---

## 19. Syntax Errors vs Runtime Errors

### Syntax Error
- Code does not compile
- Example: missing semicolon

### Runtime Error
- Code compiles
- Fails during execution

---

## 20. Why Semicolon Is Mandatory

Semicolon tells Java:
- Statement ends here

Java ignores whitespace and line breaks.

---

## 21. Java Is Case-Sensitive

Correct:
```text
System.out.println();
```

Incorrect:
```text
system.out.println();
```

---

## 22. Viewing Bytecode (.class File)

Opening .class file shows unreadable symbols.

Reason:
- Bytecode is not text
- Designed for JVM

---

## 23. Why Java Uses Bytecode

Benefits:
- Platform independence
- Security
- Performance optimization

---

## 24. Platform Independence (Write Once, Run Anywhere)

Java program:
- Compiled once
- Runs on any system with JVM

---

## 25. Java vs C/C++ Compilation Model

### C/C++
- Compiled directly to machine code
- Platform dependent

### Java
- Compiled to bytecode
- Executed by JVM

---

## 26. Java Memory Safety and Security

Java provides:
- Automatic memory management
- No direct memory access
- Sandboxing

Prevents:
- Crashes
- Viruses
- Memory corruption

---

## 27. Introduction to IDE

IDE = Integrated Development Environment

Combines:
- Editor
- Compiler
- Terminal
- Debugger

---

## 28. Why IDEs Exist

Manual workflow is slow:
- Write code
- Compile
- Fix errors
- Run

IDE automates all steps.

---

## 29. Features of an IDE

- Syntax highlighting
- Auto-completion
- Error detection
- One-click run
- Version control integration

---

## 30. Installing IntelliJ IDEA (Community Edition)

Steps:
- Search: Download IntelliJ IDEA
- Select Community Edition
- Install normally

Community Edition is:
- Free
- Open-source
- Sufficient for learning

---

## 31. Creating First Java Project in IntelliJ

Steps:
- New Project
- Select Java
- Select JDK
- Create project

---

## 32. Project Structure in IntelliJ

```text
project-name/
├── src/
├── out/
├── .idea/
```
---

## 33. Source Folder (src)

Contains:
- All Java source code
- Editable files

---

## 34. Output Folder (out)

Contains:
- Compiled .class files
- Generated automatically

---

## 35. Running Java Programs in IntelliJ

Click `▶` Run button

IDE:
- Compiles code
- Runs program
- Shows output

---

## 36. IntelliJ Auto-Compilation and Auto-Run

IDE automatically:
- Detects errors
- Compiles code
- Runs correct class

---

## 37. Error Detection in IDE

Errors shown immediately:
- Missing semicolon
- Wrong syntax
- Missing main method

---

## 38. Role of Libraries in Java

Libraries provide:
- Ready-made functionality
- File handling
- Networking
- Input/output

---

## 39. What Are Java Standard Libraries

Examples:
- java.lang
- java.util
- java.io

Used to avoid rewriting common logic.

---

## 40. Real-World Example: Java Development vs Bicycle Manufacturing

JDK = Tools to build bicycle  
JRE = Bicycle for riding  
JVM = Engine converting effort into motion

---

## 41. Summary Card

- Java uses bytecode and JVM
- JDK is required for development
- JRE is required for execution
- JVM executes bytecode
- main method is entry point
- IDE simplifies development
- Java is platform-independent
- Strong foundation for enterprise systems

