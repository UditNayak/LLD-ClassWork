package Design_Patterns.Creational.Singleton;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
        // private constructor to prevent instantiation
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

/*
Benefits:
- Lazy initialization: Instance is created only when needed, saving resources.
- Thread-safe: Double-checked locking aims to ensure only one instance is created even in multithreaded environments.
- Better performance: Reduces the overhead of acquiring a lock by first checking the instance without synchronization.

Drawbacks:
- Without the volatile keyword, this implementation is not guaranteed to be thread-safe due to possible instruction reordering and visibility issues, which can lead to multiple instances being created.
*/
