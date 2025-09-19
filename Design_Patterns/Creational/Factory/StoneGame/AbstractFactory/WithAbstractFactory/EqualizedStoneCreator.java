package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

// Equalized (round-robin) policy
public class EqualizedStoneCreator extends StoneCreator {
    private int index = 0;

    public EqualizedStoneCreator(IStoneFactory factory) {
        super(factory);
    }

    @Override
    protected int pickSize() {
        int current = index;
        index = (index + 1) % 3;
        return current;
    }
}