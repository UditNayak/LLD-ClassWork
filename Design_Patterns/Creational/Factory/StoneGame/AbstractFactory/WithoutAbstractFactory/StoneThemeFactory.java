package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

// A simple factory for themed stones
public class StoneThemeFactory {
    public static IStone createStone(String theme, int pick) {
        if (theme.equals("Forest")) {
            return switch (pick) {
                case 0 -> new ForestSmallStone();
                case 1 -> new ForestMediumStone();
                default -> new ForestLargeStone();
            };
        } else if (theme.equals("Volcano")) {
            return switch (pick) {
                case 0 -> new VolcanoSmallStone();
                case 1 -> new VolcanoMediumStone();
                default -> new VolcanoLargeStone();
            };
        } else if (theme.equals("Ice")) {
            return switch (pick) {
                case 0 -> new IceSmallStone();
                case 1 -> new IceMediumStone();
                default -> new IceLargeStone();
            };
        }
        throw new IllegalArgumentException("Unknown theme: " + theme);
    }
}

