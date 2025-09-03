package Design_Patterns.Creational.Factory.StoneGame.SimpleFactory.src;

public class LargeStone implements IStone {
    @Override
    public String size() {
        return "LARGE";
    }

    @Override
    public int damage() {
        return 18;
    }

    @Override
    public double weight() {
        return 4.0;
    }

    @Override
    public String toString() {
        return size() + " Stone (damage=" + damage() + ", weight=" + weight() + ")";
    }
}