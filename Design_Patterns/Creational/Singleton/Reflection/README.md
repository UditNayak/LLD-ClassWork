# Reflection and Singleton in Java

## What is Reflection?
Reflection in Java is a feature that allows inspection and modification of classes, methods, and fields at runtime. It can bypass access control checks using `setAccessible(true)`.

## How does it break Singleton?
Even if a Singleton class has a private constructor, Reflection can access it and create multiple instances. This violates the Singleton principle.

### Example
```java
Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
constructor.setAccessible(true); // bypass private constructor
Singleton newInstance = constructor.newInstance(); // Creates a new object
```

## How to fix it?
Modify the private constructor to prevent multiple instantiations:

```java
private Singleton() {
    if (instance != null) {
        throw new RuntimeException("Use getInstance() method");
    }
}
```

### Best Practices for Singleton
- Use `private constructor` and check inside it.
- Make `instance` variable `volatile`and use double-checked locking.
- Implement `readResolve()` to handle serialization.
- Add a guard in the constructor to prevent Reflection attacks.

### Before

```shell
Instance1 hashCode: 622488023
Instance2 hashCode: 112810359
Are both instances same? false
```

### After

```shell
uditnayak@Udits-MacBook LLD-ClassWork %  cd /Users/uditnayak/Desktop/LLD-ClassWork ; /usr/bin/env /opt/homebrew/Cellar/openjdk/24.0
.2/libexec/openjdk.jdk/Contents/Home/bin/java --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/uditnayak/Library
/Application\ Support/Code/User/workspaceStorage/b9c275348e3d76209327eb0ad14f59ff/redhat.java/jdt_ws/LLD-ClassWork_4c0413be/bin Des
ign_Patterns.Creational.Singleton.Reflection.TestReflection 
Exception in thread "main" java.lang.reflect.InvocationTargetException
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)
        at Design_Patterns.Creational.Singleton.Reflection.TestReflection.main(TestReflection.java:27)
Caused by: java.lang.RuntimeException: Use getInstance() method to create Singleton instance
        at Design_Patterns.Creational.Singleton.Reflection.ReflectionSafeSingleton.<init>(ReflectionSafeSingleton.java:11)
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
        ... 3 more
uditnayak@Udits-MacBook LLD-ClassWork % 
```
