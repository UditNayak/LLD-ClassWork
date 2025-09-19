package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

public class IceSmallStone implements IStone {
    public String size() { return "SMALL"; }
    public String theme() { return "Ice"; }
    public int damage() { return 7; }
    public double weight() { return 1.1; }
    public String toString() { return theme() + " " + size(); }
}