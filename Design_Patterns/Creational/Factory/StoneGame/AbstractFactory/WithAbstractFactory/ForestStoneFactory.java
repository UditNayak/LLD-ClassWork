package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Factory for Forest stones
public class ForestStoneFactory implements IStoneFactory {
    public IStone createSmall() { return new ForestSmallStone(); }
    public IStone createMedium() { return new ForestMediumStone(); }
    public IStone createLarge() { return new ForestLargeStone(); }
}