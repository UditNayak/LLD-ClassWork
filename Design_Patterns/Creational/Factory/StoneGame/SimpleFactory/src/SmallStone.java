package Design_Patterns.Creational.Factory.StoneGame.SimpleFactory.src;

public class SmallStone implements IStone {
    @Override
    public String size() {
        return "SMALL";
    }

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public double weight() {
        return 1.0;
    }

    @Override
    public String toString() {
        return size() + " Stone (damage=" + damage() + ", weight=" + weight() + ")";
    }
}
