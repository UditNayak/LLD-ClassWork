package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

public class VolcanoLargeStone implements IStone {
    public String size() { return "LARGE"; }
    public String theme() { return "Volcano"; }
    public int damage() { return 20; }
    public double weight() { return 4.5; }
    public String toString() { return theme() + " " + size(); }
}
