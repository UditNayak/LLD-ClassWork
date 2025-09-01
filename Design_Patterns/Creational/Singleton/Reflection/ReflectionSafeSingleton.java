package Design_Patterns.Creational.Singleton.Reflection;

import java.io.Serializable;

public class ReflectionSafeSingleton implements Serializable {

    private static volatile ReflectionSafeSingleton instance;

    private ReflectionSafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create Singleton instance");
        }
    }

    public static ReflectionSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ReflectionSafeSingleton.class) {
                if (instance == null) {
                    instance = new ReflectionSafeSingleton();
                }
            }
        }
        return instance;
    }

    // To prevent breaking via Serialization
    protected Object readResolve() {
        return getInstance();
    }
}
