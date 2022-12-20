package parrot;

public class NorwegianBlueParrot extends Parrot{

    public NorwegianBlueParrot(ParrotBuilder parrotBuilder) {
        super(parrotBuilder);
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
