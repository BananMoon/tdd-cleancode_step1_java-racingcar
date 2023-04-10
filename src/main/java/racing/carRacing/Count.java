package racing.carRacing;

public class Count {
    public static final int ZERO = 0;
    public static final long COUNT_DOWN = 1;

    private int count;

    Count(int count) {
        if (isNegativeNumberOrZero(count)) {
            throw new IllegalArgumentException("0보다 큰 수를 입력해주세요.");
        }
        this.count = count;
    }

    public static Count createCount(int inputNumber) {
        return new Count(inputNumber);
    }

    private boolean isNegativeNumberOrZero(int count) {
        return count <= ZERO;
    }

    public boolean isOverZero() {
        return count > ZERO;
    }

    public void countDown() {
        count -= COUNT_DOWN;
    }

    @Override
    public String toString() {
        return "" + count;
    }
}
