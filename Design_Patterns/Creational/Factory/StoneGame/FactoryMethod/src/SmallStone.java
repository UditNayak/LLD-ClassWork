package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

// A small stone: low damage, very light
public class SmallStone implements IStone {
    @Override
    public String size() {
        return "SMALL";
    }

    @Override
    public int damage() {
        return 5; // small damage
    }

    @Override
    public double weight() {
        return 1.0; // very light
    }

    @Override
    public String toString() {
        return size();
    }
}

