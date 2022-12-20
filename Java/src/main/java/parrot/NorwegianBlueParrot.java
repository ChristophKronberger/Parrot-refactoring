package parrot;

public class NorwegianBlueParrot extends Parrot{

    public static final double MAX_SPEED = 24.0;

    public NorwegianBlueParrot(ParrotBuilder parrotBuilder) {
        super(parrotBuilder);
    }

    @Override
    public double getSpeed() {
        return isNailed ? 0 : Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }
}
