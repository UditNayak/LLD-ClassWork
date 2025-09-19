package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

public class IceLargeStone implements IStone {
    public String size() { return "LARGE"; }
    public String theme() { return "Ice"; }
    public int damage() { return 19; }
    public double weight() { return 4.2; }
    public String toString() { return theme() + " " + size(); }
}