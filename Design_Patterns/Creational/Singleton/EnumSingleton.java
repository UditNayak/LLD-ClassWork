package Design_Patterns.Creational.Singleton;

public enum EnumSingleton {
    INSTANCE; // This is the singleton instance

    // You can define methods and variables
    private int value;

    public void showMessage() {
        System.out.println("Hello from Enum Singleton!");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

/*
Benefits:
- Simple and concise: Enum-based singletons are easy to implement and understand.
- Serialization: Enum singletons are inherently serializable, providing a built-in mechanism to preserve the singleton property.
- Thread-safe: Enum singletons are thread-safe by default, eliminating the need for explicit synchronization.

Drawbacks:
- Limited flexibility: Enum singletons cannot be subclassed, which may be a limitation in some scenarios.
*/


/* Usage Example (in main class)
public class Main {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.showMessage();

        // Setting and getting values
        singleton.setValue(100);
        System.out.println("Value: " + singleton.getValue());
    }
}
*/