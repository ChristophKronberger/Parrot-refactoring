package parrot;

public abstract class Parrot {
    public static final double LOAD_FACTOR = 9.0;
    public static final double BASE_SPEED = 12.0;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    public double getBaseSpeed(double voltage) {
        double appleSauce = 24.0;
        return Math.min(appleSauce, voltage * BASE_SPEED);
    }
}
