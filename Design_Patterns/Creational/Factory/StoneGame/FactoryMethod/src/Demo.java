package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

import java.util.List;

// Demo class to test Factory Method with policies
public class Demo {
    public static void main(String[] args) {
        StoneCreator randomCreator = new RandomStoneCreator();
        StoneCreator equalizedCreator = new EqualizedStoneCreator();

        List<IStone> randomWave = randomCreator.createWave(9);
        List<IStone> equalizedWave = equalizedCreator.createWave(9);

        System.out.println("Random Wave: " + randomWave);
        System.out.println("Equalized Wave: " + equalizedWave);
    }
}
