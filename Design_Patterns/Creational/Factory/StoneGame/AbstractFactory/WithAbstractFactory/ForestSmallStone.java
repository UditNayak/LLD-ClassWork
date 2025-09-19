package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

public class ForestSmallStone implements IStone {
    public String size() { return "SMALL"; }
    public String theme() { return "Forest"; }
    public int damage() { return 5; }
    public double weight() { return 1.0; }
    public String toString() { return theme() + " " + size(); }
}