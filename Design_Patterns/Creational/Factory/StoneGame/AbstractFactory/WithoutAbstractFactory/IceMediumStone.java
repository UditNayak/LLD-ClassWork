package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

public class IceMediumStone implements IStone {
    public String size() { return "MEDIUM"; }
    public String theme() { return "Ice"; }
    public int damage() { return 11; }
    public double weight() { return 2.6; }
    public String toString() { return theme() + " " + size(); }
}
