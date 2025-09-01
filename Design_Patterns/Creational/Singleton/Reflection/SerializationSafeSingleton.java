package Design_Patterns.Creational.Singleton.Reflection;

import java.io.Serializable;

public class SerializationSafeSingleton implements Serializable {
    private static volatile SerializationSafeSingleton instance;

    private SerializationSafeSingleton() {
        // private constructor
    }

    public static SerializationSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializationSafeSingleton.class) {
                if (instance == null) {
                    instance = new SerializationSafeSingleton();
                }
            }
        }
        return instance;
    }

    // This method is called during deserialization
    protected Object readResolve() {
        return getInstance(); // return the same instance
    }
}
