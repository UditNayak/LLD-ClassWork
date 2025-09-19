package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Factory for Ice stones
public class IceStoneFactory implements IStoneFactory {
    public IStone createSmall() { return new IceSmallStone(); }
    public IStone createMedium() { return new IceMediumStone(); }
    public IStone createLarge() { return new IceLargeStone(); }
}