package Design_Patterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();

        System.out.println(instance1 == instance2); // Should print true, as both references point to the same instance
    }
}