package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

public class VolcanoMediumStone implements IStone {
    public String size() { return "MEDIUM"; }
    public String theme() { return "Volcano"; }
    public int damage() { return 12; }
    public double weight() { return 2.8; }
    public String toString() { return theme() + " " + size(); }
}
