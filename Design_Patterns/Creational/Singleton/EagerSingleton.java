package Design_Patterns.Creational.Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // private constructor to prevent instantiation
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

/*
Benifit:
- Eager initialization ensures that the instance is created at the time of class loading.
- Simple and straightforward implementation.
- Thread-safe without requiring synchronization.

Drawbacks:
- Eager initialization may lead to resource wastage if the instance is never used.
 */
