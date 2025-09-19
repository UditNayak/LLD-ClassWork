package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Common interface for all stones
public interface IStone {
    String size();    // SMALL, MEDIUM, LARGE
    String theme();   // Forest, Volcano, Ice
    int damage();
    double weight();
}
