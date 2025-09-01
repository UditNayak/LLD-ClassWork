package Design_Patterns.Creational.Singleton.Serialization;

import java.io.Serializable;

// Need to implement Serializable Interface for Testing the Serialization Problem
public class VolatileLazySingleton implements Serializable {
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
