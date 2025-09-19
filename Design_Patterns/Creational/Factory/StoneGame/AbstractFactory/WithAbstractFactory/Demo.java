package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Client code
public class Demo {
    public static void main(String[] args) {
        IStoneFactory forestFactory = new ForestStoneFactory();
        IStoneFactory volcanoFactory = new VolcanoStoneFactory();
        IStoneFactory iceFactory = new IceStoneFactory();

        StoneCreator randomForest = new RandomStoneCreator(forestFactory);
        StoneCreator equalizedVolcano = new EqualizedStoneCreator(volcanoFactory);
        StoneCreator randomIce = new RandomStoneCreator(iceFactory);

        System.out.println("Forest Random Wave: " + randomForest.createWave(6));
        System.out.println("Volcano Equalized Wave: " + equalizedVolcano.createWave(6));
        System.out.println("Ice Random Wave: " + randomIce.createWave(6));
    }
}