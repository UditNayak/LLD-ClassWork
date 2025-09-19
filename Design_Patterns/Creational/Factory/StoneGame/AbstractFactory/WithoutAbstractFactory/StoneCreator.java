package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

import java.util.ArrayList;
import java.util.List;

// Abstract class that owns the wave algorithm
public abstract class StoneCreator {
    protected String theme;

    public StoneCreator(String theme) {
        this.theme = theme;
    }

    // Subclasses pick SMALL / MEDIUM / LARGE (policy)
    protected abstract int pickSize();

    // Common wave creation algorithm
    public final List<IStone> createWave(int count) {
        List<IStone> wave = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int pick = pickSize();
            wave.add(StoneThemeFactory.createStone(theme, pick));
        }
        return wave;
    }
}