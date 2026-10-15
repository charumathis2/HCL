# Day 9 – Generics and Resource Management

## Project Overview
This project demonstrates Java Generics, bounded types, wildcards, generic repositories, CSV file reading, and automatic resource management.

## Features

### 1. Generic Toolkit
- `Pair<K, V>` — stores two values of different types.
- `Box<T extends Number>` — accepts numeric types.
- `GenericUtils.max()` — returns the maximum of two comparable values.
- `WildcardUtils` — demonstrates `? extends`, `? super`, and `?`.

### 2. CSV Reading
- Reads product information from `data/products.csv`.
- Uses try-with-resources to close the reader automatically.

### 3. Generic Repository
- `CrudRepository<T, ID>` defines CRUD operations.
- `InMemoryRepository<T, ID>` implements the operations using a `LinkedHashMap`.
- The repository is reused for `Product` entities.

### 4. Resource Management
- `ResourceDemo` implements `AutoCloseable`.
- Demonstrates reverse-order resource closing.

## Project Structure

- `src/main/java/toolkit` — generic utility classes.
- `src/main/java/model` — Product model.
- `src/main/java/repository` — generic repository interface and implementation.
- `src/main/java/app` — application and demonstration classes.
- `data/products.csv` — product seed data.

## Requirements
- Java JDK 24 or a compatible Java version.

## Compile and Run

Run these commands from the Day 9 project directory.

Compile the main application and its dependencies:

```powershell
javac -Xlint:all -d out src\main\java\toolkit\Pair.java src\main\java\toolkit\Box.java src\main\java\toolkit\GenericUtils.java src\main\java\toolkit\WildcardUtils.java src\main\java\model\Product.java src\main\java\repository\CrudRepository.java src\main\java\repository\InMemoryRepository.java src\main\java\app\ProductCsvReader.java src\main\java\app\ResourceDemo.java src\main\java\app\Main.java
```

Run the application:

```powershell
java -cp out app.Main
```

Run the generic toolkit demo:

```powershell
javac -Xlint:all -cp out -d out src\main\java\app\GenericToolkitDemo.java
java -cp out app.GenericToolkitDemo
```

Run the resource demo:

```powershell
java -cp out app.ResourceDemo
```

## Learning Outcomes
Practiced generic classes and methods, bounded type parameters, PECS wildcards, generic CRUD repositories, CSV reading, try-with-resources, and `AutoCloseable`.
