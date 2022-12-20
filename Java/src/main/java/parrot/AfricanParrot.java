package parrot;

public class AfricanParrot extends Parrot{

    public AfricanParrot(ParrotBuilder parrotBuilder) {
        super(parrotBuilder);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }
}
