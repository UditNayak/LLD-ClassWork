# Singleton Design Pattern

Singleton is a **creational design pattern** that ensures a class has only **one instance** and provides a **global point of access** to that instance.

## Table of Contents
- [Why Do We Need Singleton](#why-do-we-need-singleton)
- [Use Cases](#use-cases)
- [Implementations](#implementations)
- [References](#references)

## Why Do We Need 
In some scenarios, it is critical to ensure that only one instance of a class exists throughout the application lifecycle.  
This is essential for:
1. **Controlled Access**: Singleton provides a controlled access point to the instance, preventing unauthorized access.
2. **Managing Shared Resources**: Singleton can manage shared resources like database connections or configuration files.
3. **Reducing Memory Usage**: By preventing unnecessary object creation, Singleton helps in reducing memory usage.
3. **Global State Management**: Singletons can be used to manage global state in an application, making it easier to maintain consistency.

## Use Cases
Some common scenarios where the Singleton pattern is applied:

1. **Configuration Manager**  
   Provides a single source of truth for application configuration settings.  
   [Read detailed explanation](singleton_use_cases.md#1-configuration-manager)

2. **Logger**  
   Maintains a centralized logging mechanism to ensure consistent log management across the application.  
   [Read detailed explanation](singleton_use_cases.md#2-logger)

3. **Database Connection Pool**  
   Manages a single, shared pool of database connections to optimize resource usage and performance.  
   [Read detailed explanation](singleton_use_cases.md#3-database-connection-pool)

4. **Cache Manager**  
   Handles application-wide caching through a single instance to reduce redundant operations and improve speed.  
   [Read detailed explanation](singleton_use_cases.md#4-cache-manager)


## Implementations

We have implemented the Singleton design pattern using different approaches.  
Each implementation has its own benefits and drawbacks, which are documented inside the respective file as comments.

### Implementations List:
1. [Eager Initialization](EagerSingleton.java)  
   - Instance created at class loading time.

2. [Lazy Initialization](LazySingleton.java)  
   - Instance created when needed (on first call).

3. [Thread-Safe Lazy Initialization](ThreadSafeLazySingleton.java)  
   - Ensures safety in multi-threaded environments using `synchronized`.

4. [Double-Checked Locking](DoubleCheckedLockingSingleton.java)  
   - Reduces synchronization overhead by checking twice.

5. [Lazy Initialization with Volatile](VolatileLazySingleton.java)  
   - Uses `volatile` keyword to prevent instruction reordering issues.

6. [Enum-based Singleton](EnumSingleton.java)  
   - Simplest and safest Singleton approach:
     - **Thread-safe by default**
     - **Serialization-safe**
     - **Reflection-proof**
   - Recommended by *Effective Java* as the best way to implement Singleton in Java.

7. [Inner Class (Bill Pugh Singleton)](InnerClassSingleton.java)  
   - Uses a static inner class to hold the Singleton instance.
   - Ensures **lazy initialization** and **thread safety** without `synchronized` or `volatile`.
   - Efficient and widely recommended in modern Java applications.


### Thumb Rule:
- Most of the time, **Eager Initialization** should be preferred since our classes are often simple and do not require much resource management.
- **Lazy Initialization** can be useful in scenarios where the cost of creating an instance is high and it may not be needed.
- Unnecessary use of Lazy, Multithreading is basically Over-Engineering our code. Remember, simplicity is key. Our code should be as simple as possible.

### Conclusion:
To achieve Singleton behaviour:
- Use private constructors to prevent instantiation from outside the class.
- Provide a static method to get the instance, ensuring only one instance is created.
- Consider using thread-safe approaches for multi-threaded environments.

### Why EnumSingleton and InnerClassSingleton are Thread-Safe

#### 1. Enum Singleton
In Java, **enums are inherently thread-safe** because:
- Enum constants are created **when the enum class is loaded into the JVM**.
- JVM guarantees that **class loading and initialization are thread-safe**.
- This means only **one instance of each enum constant** will ever be created, no matter how many threads try to access it.
- You don’t need to use `synchronized`, `volatile`, or any manual locks.

**In short:**  
The JVM handles synchronization during enum initialization, so `EnumSingleton.INSTANCE` is always a single, thread-safe instance.


#### 2. Inner Class Singleton (Bill Pugh Pattern)
This approach uses a **static inner class** to hold the Singleton instance:
- The outer class is loaded first, but the **inner static class is not loaded until it is referenced** (lazy loading).
- When `getInstance()` is called for the first time, the JVM loads the inner class and initializes its static fields.
- **JVM guarantees that class initialization is thread-safe**, so multiple threads cannot load the inner class simultaneously.

**Why no synchronization or volatile needed?**  
Because the JVM ensures that the inner class initialization happens **exactly once**, even in a multi-threaded environment.


#### Simple Visual
- **Enum:** Instance created at enum class load time (JVM ensures thread safety).
- **Inner Class:** Instance created only when the inner class is first referenced (JVM ensures thread safety).

---

### Key points:
- For Serialization, use `readResolve()`.
- For Reflection, check inside constructor and throw an exception.
- For multithreading, use Thread-Safe Lazy Initialization or Double-Checked Locking with volatile.

## References
- [DigitalOcean: Singleton Pattern](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)
- [Refactoring Guru: Singleton Pattern](https://refactoring.guru/design-patterns/singleton)