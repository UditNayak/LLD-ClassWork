package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

import java.util.ArrayList;
import java.util.List;

// Abstract class that owns the wave algorithm
// Uses the Factory Method "createStone" to decide which stone to create
public abstract class StoneCreator {

    // Factory Method (subclasses must implement this)
    protected abstract IStone createStone();

    // Fixed algorithm: create a wave of stones
    public final List<IStone> createWave(int count) {
        List<IStone> wave = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            wave.add(createStone()); // let subclass policy decide
        }
        return wave;
    }
}
