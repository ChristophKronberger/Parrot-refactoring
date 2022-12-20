package parrot;

public abstract class Parrot {
    public static final double BASE_SPEED = 12.0;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    protected Parrot(ParrotBuilder parrotBuilder) {
        this.numberOfCoconuts = parrotBuilder.getNumberOfCoconuts();
        this.isNailed = parrotBuilder.isNailed();
        this.voltage = parrotBuilder.getVoltage();
    }

    public abstract double getSpeed();

}
