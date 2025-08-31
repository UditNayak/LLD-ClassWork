package Design_Patterns.Creational.Singleton;

public class VolatileLazySingleton {
    private static volatile VolatileLazySingleton instance;

    private VolatileLazySingleton() {
        // private constructor to prevent instantiation
    }

    public static VolatileLazySingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileLazySingleton.class) {
                if (instance == null) {
                    instance = new VolatileLazySingleton();
                }
            }
        }
        return instance;
    }
}

/*
Benefits:
- Lazy initialization: Instance is created only when needed, saving resources.
- Thread-safe: Volatile keyword ensures proper visibility of the instance.

Drawbacks:
- Performance overhead: Synchronization can introduce latency.
*/
