package Design_Patterns.Creational.Singleton.Serialization;

import java.io.*;

// public class TestSerialization {
//     public static void main(String[] args) throws Exception {
//         VolatileLazySingleton instance1 = VolatileLazySingleton.getInstance();

//         // Serialize the instance
//         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
//         out.writeObject(instance1);
//         out.close();

//         // Deserialize the instance
//         ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
//         VolatileLazySingleton instance2 = (VolatileLazySingleton) in.readObject();
//         in.close();

//         // Check if both references point to the same object
//         System.out.println("Instance1 hashCode: " + instance1.hashCode());
//         System.out.println("Instance2 hashCode: " + instance2.hashCode());
//         System.out.println("Are both instances same? " + (instance1 == instance2));
//     }
// }

public class TestSerialization {
    public static void main(String[] args) throws Exception {
        SerializationSafeSingleton instance1 = SerializationSafeSingleton.getInstance();

        // Serialize the instance
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize the instance
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializationSafeSingleton instance2 = (SerializationSafeSingleton) in.readObject();
        in.close();

        // Check if both references point to the same object
        System.out.println("Instance1 hashCode: " + instance1.hashCode());
        System.out.println("Instance2 hashCode: " + instance2.hashCode());
        System.out.println("Are both instances same? " + (instance1 == instance2));
    }
}

