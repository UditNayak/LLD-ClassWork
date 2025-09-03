package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

// Concrete creator with Equalized (round-robin) policy
public class EqualizedStoneCreator extends StoneCreator {
    private int index = 0;

    @Override
    protected IStone createStone() {
        IStone stone;
        switch (index) {
            case 0:
                stone = new SmallStone();
                break;
            case 1:
                stone = new MediumStone();
                break;
            default:
                stone = new LargeStone();
                break;
        }
        index = (index + 1) % 3; // cycle through 0,1,2
        return stone;
    }
}

