package Design_Patterns.Creational.Factory.StoneGame.SimpleFactory.src;

public class MediumStone implements IStone {
    @Override
    public String size() {
        return "MEDIUM";
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public double weight() {
        return 2.5;
    }

    @Override
    public String toString() {
        return size() + " Stone (damage=" + damage() + ", weight=" + weight() + ")";
    }
}
