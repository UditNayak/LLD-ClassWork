package Design_Patterns.Creational.Factory.StoneGame.FactoryMethod.src;

import java.util.concurrent.ThreadLocalRandom;

// Concrete creator with Random policy
public class RandomStoneCreator extends StoneCreator {
    @Override
    protected IStone createStone() {
        int pick = ThreadLocalRandom.current().nextInt(3);
        switch (pick) {
            case 0:
                return new SmallStone();
            case 1:
                return new MediumStone();
            default:
                return new LargeStone();
        }
    }
}
