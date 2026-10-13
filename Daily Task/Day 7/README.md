# Day 7 – Collections Framework: Library Waitlist

## Overview
A Java console application demonstrating the Collections Framework through a library catalogue, member waitlist, duplicate-title removal, and faculty priority requests.

## Features
1. Display the library catalogue.
2. Remove duplicate book titles while preserving insertion order.
3. Add members to a waitlist and serve them in FIFO order.
4. Add faculty requests with priority-based serving.
5. Demonstrate `Iterator` and `ListIterator` traversal.
6. Compare `ArrayList` and `LinkedList` performance.

## Collections Used

| Collection | Purpose |
|---|---|
| `ArrayList` | Store and display catalogue entries |
| `LinkedHashSet` | Remove duplicates while preserving insertion order |
| `ArrayDeque` | Manage the member waitlist |
| `PriorityQueue` | Serve requests by priority |
| `Iterator` | Traverse elements forward |
| `ListIterator` | Traverse elements forward and backward |
| `LinkedList` | Compare collection performance |

## Requirements
- Java JDK 24 or a compatible Java version.
- VS Code or another Java IDE.

## Compile and Run

From the Day 7 project directory, compile the application:

```powershell
javac -d out src\main\java\model\Book.java src\main\java\app\LibraryCatalog.java src\main\java\app\LibraryDeduplicator.java src\main\java\app\LibraryWaitlist.java src\main\java\app\FacultyPriorityQueue.java src\main\java\app\Main.java
```

Run the application:

```powershell
java -cp out app.Main
```

To run the iterator demo:

```powershell
javac -d out src\main\java\app\CollectionIteratorDemo.java
java -cp out app.CollectionIteratorDemo
```

To run the performance comparison:

```powershell
javac -d out src\main\java\app\CollectionPerformanceTest.java
java -cp out app.CollectionPerformanceTest
```

## Performance Results
See [performance-results.md](performance-results.md) for the comparison and observations.

## Learning Outcomes
Practiced Java collections, duplicate removal, queue operations, priority queues, iteration, and basic performance measurement.
