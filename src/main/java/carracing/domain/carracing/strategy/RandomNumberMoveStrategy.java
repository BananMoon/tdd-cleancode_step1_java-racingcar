package carracing.domain.carracing.strategy;

import java.util.Random;

public class RandomNumberMoveStrategy implements MoveStrategy {
    private static final Random RANDOM = new Random();
    private static final int MOVE_REFERENCE_NUM = 4;
    private static final int LIMIT_RANDOM_NUM = 10;


    @Override
    public boolean isMovable() {
        return RANDOM.nextInt(LIMIT_RANDOM_NUM) >= MOVE_REFERENCE_NUM;
    }
}