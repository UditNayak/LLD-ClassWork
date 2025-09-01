package Design_Patterns.Creational.Singleton.Reflection;

import java.lang.reflect.Constructor;

// public class TestReflection {
//     public static void main(String[] args) throws Exception {
//         SerializationSafeSingleton instance1 = SerializationSafeSingleton.getInstance();

//         // Break Singleton using Reflection
//         Constructor<SerializationSafeSingleton> constructor =SerializationSafeSingleton.class.getDeclaredConstructor();
//         constructor.setAccessible(true); // bypass private constructor
//         SerializationSafeSingleton instance2 = constructor.newInstance();

//         System.out.println("Instance1 hashCode: " + instance1.hashCode());
//         System.out.println("Instance2 hashCode: " + instance2.hashCode());
//         System.out.println("Are both instances same? " + (instance1 == instance2));
//     }
// }

public class TestReflection {
    public static void main(String[] args) throws Exception {
        ReflectionSafeSingleton instance1 = ReflectionSafeSingleton.getInstance();

        // Break Singleton using Reflection
        Constructor<ReflectionSafeSingleton> constructor =ReflectionSafeSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true); // bypass private constructor
        ReflectionSafeSingleton instance2 = constructor.newInstance(); // This will throw RuntimeException

        System.out.println("Instance1 hashCode: " + instance1.hashCode());
        System.out.println("Instance2 hashCode: " + instance2.hashCode());
        System.out.println("Are both instances same? " + (instance1 == instance2));
    }
}
