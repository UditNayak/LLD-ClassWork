package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

// A medium stone: moderate damage, moderate weight
public class MediumStone implements IStone {
    @Override
    public String size() {
        return "MEDIUM";
    }

    @Override
    public int damage() {
        return 10; // medium damage
    }

    @Override
    public double weight() {
        return 2.5; // medium weight
    }

    @Override
    public String toString() {
        return size();
    }
}
