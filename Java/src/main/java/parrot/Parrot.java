package parrot;

public abstract class Parrot {
    public static final double BASE_SPEED = 12.0;
    public static final double MAX_SPEED = 24.0;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    protected Parrot(ParrotBuilder parrotBuilder) {
        this.numberOfCoconuts = parrotBuilder.getNumberOfCoconuts();
        this.isNailed = parrotBuilder.isNailed();
        this.voltage = parrotBuilder.getVoltage();
    }

    public abstract double getSpeed();

    public double getBaseSpeed(double voltage) {
        return Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }
}
