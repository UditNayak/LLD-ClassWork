package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

// A large stone: heavy and dangerous
public class LargeStone implements IStone {
    @Override
    public String size() {
        return "LARGE";
    }

    @Override
    public int damage() {
        return 18; // big damage
    }

    @Override
    public double weight() {
        return 4.0; // heavy
    }

    @Override
    public String toString() {
        return size();
    }
}
