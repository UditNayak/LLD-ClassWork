package Design_Patterns.Creational.Singleton;

// Inner Class Singleton --> Also known as "Initialization-on-demand holder idiom" or "Bill Pugh Singleton Design Pattern"
public class InnerClassSingleton {
    // Private constructor prevents instantiation from outside
    private InnerClassSingleton() {
        System.out.println("Singleton instance created");
    }

    // Static inner class - loaded only when getInstance() is called
    private static class SingletonHelper {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    // Global access point
    public static InnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    
    public void showMessage() {
        System.out.println("Hello from Inner Class Singleton!");
    }
}