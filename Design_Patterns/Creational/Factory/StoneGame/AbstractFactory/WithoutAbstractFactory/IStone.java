package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

public interface IStone {
    String size();    // SMALL, MEDIUM, LARGE
    String theme();   // Forest, Volcano, Desert, Ice, Ocean
    int damage();
    double weight();
}
