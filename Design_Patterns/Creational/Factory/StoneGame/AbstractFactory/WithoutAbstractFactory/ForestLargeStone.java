package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

public class ForestLargeStone implements IStone {
    public String size() { return "LARGE"; }
    public String theme() { return "Forest"; }
    public int damage() { return 18; }
    public double weight() { return 4.0; }
    public String toString() { return theme() + " " + size(); }
}