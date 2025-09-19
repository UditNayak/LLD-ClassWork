package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

import java.util.ArrayList;
import java.util.List;

// Abstract class that owns the wave algorithm
public abstract class StoneCreator {
    protected IStoneFactory factory; // now depends on Abstract Factory

    public StoneCreator(IStoneFactory factory) {
        this.factory = factory;
    }

    // Subclasses pick SMALL / MEDIUM / LARGE (policy)
    protected abstract int pickSize();

    // Fixed wave creation algorithm
    public final List<IStone> createWave(int count) {
        List<IStone> wave = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int pick = pickSize();
            switch (pick) {
                case 0 -> wave.add(factory.createSmall());
                case 1 -> wave.add(factory.createMedium());
                case 2 -> wave.add(factory.createLarge());
            }
        }
        return wave;
    }
}