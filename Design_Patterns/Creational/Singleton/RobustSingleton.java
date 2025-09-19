package Design_Patterns.Creational.Singleton;

import java.io.Serializable;

public class RobustSingleton implements Serializable {
    // Volatile ensures visibility across threads
    private static volatile RobustSingleton instance;

    private RobustSingleton() {
        // Prevent Reflection from breaking Singleton
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create the singleton instance");
        }
    }

    public static RobustSingleton getInstance() {
        if (instance == null) {
            synchronized (RobustSingleton.class) {
                if (instance == null) {
                    instance = new RobustSingleton();
                }
            }
        }
        return instance;
    }

    // Handle Serialization problem
    protected Object readResolve() {
        return getInstance();
    }
}
