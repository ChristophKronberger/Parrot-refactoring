package parrot;

public class NorwegianBlueParrot extends Parrot{

    public static final double MAX_SPEED = 24.0;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(boolean isNailed, double voltage) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return isNailed ? 0 : Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }
}
