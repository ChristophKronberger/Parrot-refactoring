package parrot;

public class ParrotBuilder {

    private ParrotBuilder() {
    }

    protected static Parrot european() {
        return new EuropeanParrot();
    }

    protected static Parrot african(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    protected static Parrot norwegianBlue(double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(isNailed, voltage);


    }
}
