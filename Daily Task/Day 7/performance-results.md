# ArrayList vs LinkedList Performance Comparison

## Objective
Compare the performance of `ArrayList` and `LinkedList` using Java collections.

## Test Setup
- Language: Java
- Elements added: 100,000
- Index-access operations: 10,000
- Timing method: `System.nanoTime()`

## Results

The following results were measured by running `CollectionPerformanceTest.java` on the local system.

| Operation | ArrayList (ns) | LinkedList (ns) |
|---|---:|---:|
| Add at end | Refer to console output | Refer to console output |
| Access by index | Refer to console output | Refer to console output |

## Observations
- `ArrayList` generally provides fast access by index because it uses a resizable array.
- `LinkedList` requires traversal to access an element by index, so repeated indexed access is generally slower.
- Adding at the end is efficient for both collections in typical use, although actual timings vary.
- Results can vary based on the computer, JVM, and system load.

## Conclusion
Choose `ArrayList` when frequent indexed access is required. Consider `LinkedList` when its insertion/removal behavior fits the specific workload. Always benchmark with representative data before choosing based on performance.
