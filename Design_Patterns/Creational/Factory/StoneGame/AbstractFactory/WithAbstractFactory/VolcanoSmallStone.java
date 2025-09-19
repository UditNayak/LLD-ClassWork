package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

public class VolcanoSmallStone implements IStone {
    public String size() { return "SMALL"; }
    public String theme() { return "Volcano"; }
    public int damage() { return 6; }
    public double weight() { return 1.2; }
    public String toString() { return theme() + " " + size(); }
}