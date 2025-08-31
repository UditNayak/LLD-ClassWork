package Design_Patterns.Creational.Singleton;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton() {
        // private constructor to prevent instantiation
    }

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }
}

/*
Benefits:
- Lazy initialization: Instance is created only when needed, saving resources.
- Thread-safe: Synchronization ensures only one instance is created even in multithreaded environments.

Drawbacks:
- Performance overhead: Synchronization can introduce latency.
*/
