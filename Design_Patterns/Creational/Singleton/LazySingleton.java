package Design_Patterns.Creational.Singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // private constructor to prevent instantiation
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

/*
Benefits:
- Lazy initialization: Instance is created only when needed, saving resources.

Drawbacks:
- Not thread-safe: If accessed by multiple threads, it may create multiple instances.
*/
