# Serialization and Singleton

### What is Serialization?
- Serialization is the process of **converting an object into a byte stream** so it can be saved to a file, sent over a network, etc.
- **Deserialization** is the reverse: converting the byte stream back into an object.

### How does it break Singleton?
- When you **serialize a Singleton object and then deserialize it**, Java creates a new instance during deserialization.
- This **violates the Singleton property** because now you have **two objects**.

### Serialization Problem

When a Singleton class is serialized, the serialized object can be deserialized into a new instance, breaking the Singleton pattern. This happens because the default deserialization process does not call the Singleton's constructor, leading to the creation of a new instance.

```shell
Instance1 hashCode: 1198108795
Instance2 hashCode: 1751075886
Are both instances same? false
```

### Solution: Implementing readResolve

To solve the serialization problem, you can implement the `readResolve` method in your Singleton class. This method is called during deserialization and can be used to return the existing instance of the Singleton.

```java
// This method is called during deserialization
protected Object readResolve() {
    return getInstance(); // return the same instance
}
```

With this implementation, even if a new instance is created during deserialization, the `readResolve` method will ensure that the existing instance is returned, preserving the Singleton property.

```shell
Instance1 hashCode: 1836019240
Instance2 hashCode: 1836019240
Are both instances same? true
```

### Why does readResolve() work internally?

When **deserializing** an object in Java:
- JVM **creates a new object** from the serialized data (ignoring existing instances).
- After creating the new object, JVM **calls `readResolve()` if it exists**.
- The **return value of `readResolve()` replaces the newly created object** in the deserialization process.

So, by overriding `readResolve()`, we **return the already existing Singleton instance** instead of letting JVM use the newly created one.

### Keypoints:
- readResolve() is part of the Java Serialization mechanism.
- It is called after the object is deserialized but before it is returned to the caller.
- If readResolve() returns a different object, that object will be used instead.