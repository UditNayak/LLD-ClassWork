package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Abstract Factory interface
// Every theme factory must implement these methods
public interface IStoneFactory {
    IStone createSmall();
    IStone createMedium();
    IStone createLarge();
}
