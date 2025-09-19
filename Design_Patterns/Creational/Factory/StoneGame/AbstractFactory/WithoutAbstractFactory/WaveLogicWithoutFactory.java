package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

// Client code
public class WaveLogicWithoutFactory {
    public static void main(String[] args) {
        StoneCreator randomForest = new RandomStoneCreator("Forest");
        StoneCreator equalizedVolcano = new EqualizedStoneCreator("Volcano");
        StoneCreator randomIce = new RandomStoneCreator("Ice");

        System.out.println("Forest Random Wave: " + randomForest.createWave(6));
        System.out.println("Volcano Equalized Wave: " + equalizedVolcano.createWave(6));
        System.out.println("Ice Random Wave: " + randomIce.createWave(6));
    }
}
