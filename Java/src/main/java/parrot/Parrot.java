package parrot;

public class Parrot {

    public static final double LOAD_FACTOR = 9.0;
    public static final double BASE_SPEED = 12.0;
    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return BASE_SPEED;
            case AFRICAN:
                return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    private double getBaseSpeed(double voltage) {
        double appleSauce = 24.0;
        return Math.min(appleSauce, voltage * BASE_SPEED);
    }

}
