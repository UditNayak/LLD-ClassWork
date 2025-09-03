package Design_Patterns.Creational.Factory.StoneGame.SimpleFactory.src;

public class StoneFactory {
    private StoneFactory() {
        // private constructor to prevent direct object creation
    }

    public static IStone createStone(StoneType type) {
        switch (type) {
            case SMALL:
                return new SmallStone();
            case MEDIUM:
                return new MediumStone();
            case LARGE:
                return new LargeStone();
            default:
                throw new IllegalArgumentException("Unknown stone type: " + type);
        }
    }
}
