package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Factory for Volcano stones
public class VolcanoStoneFactory implements IStoneFactory {
    public IStone createSmall() { return new VolcanoSmallStone(); }
    public IStone createMedium() { return new VolcanoMediumStone(); }
    public IStone createLarge() { return new VolcanoLargeStone(); }
}