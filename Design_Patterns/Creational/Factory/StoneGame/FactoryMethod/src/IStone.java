package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

public interface IStone {
    String size();    // SMALL, MEDIUM, LARGE
    int damage();     // how much health it reduces if it hits the player
    double weight();  // how heavy the stone is
}
