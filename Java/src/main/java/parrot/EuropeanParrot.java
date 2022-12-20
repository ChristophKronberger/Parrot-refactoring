package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(ParrotBuilder parrotBuilder) {
        super(parrotBuilder);
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }
}



