package Design_Patterns.Creational.Factory.StoneGame.SimpleFactory.src;

// Demo class to test the Simple Factory
public class Demo {
    public static void main(String[] args) {
        // Player will face different stones in the game
        IStone s1 = StoneFactory.createStone(StoneType.SMALL);
        IStone s2 = StoneFactory.createStone(StoneType.MEDIUM);
        IStone s3 = StoneFactory.createStone(StoneType.LARGE);

        // Print details of the stones
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
