package Design_Patterns.Creational.Factory.StoneGame.AbstractFactory.WithoutAbstractFactory;

import java.util.concurrent.ThreadLocalRandom;

// Random policy
public class RandomStoneCreator extends StoneCreator {
    public RandomStoneCreator(String theme) {
        super(theme);
    }

    @Override
    protected int pickSize() {
        return ThreadLocalRandom.current().nextInt(3);
    }
}

