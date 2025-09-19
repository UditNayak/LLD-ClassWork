package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

// Equalized (round-robin) policy
public class EqualizedStoneCreator extends StoneCreator {
    private int index = 0;

    public EqualizedStoneCreator(String theme) {
        super(theme);
    }

    @Override
    protected int pickSize() {
        int current = index;
        index = (index + 1) % 3;
        return current;
    }
}
