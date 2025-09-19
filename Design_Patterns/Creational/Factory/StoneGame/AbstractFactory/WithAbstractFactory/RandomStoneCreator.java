package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithAbstractFactory;

import java.util.concurrent.ThreadLocalRandom;

// Random policy
public class RandomStoneCreator extends StoneCreator {
    public RandomStoneCreator(IStoneFactory factory) {
        super(factory);
    }

    @Override
    protected int pickSize() {
        return ThreadLocalRandom.current().nextInt(3);
    }
}