package parrot;

public class ParrotBuilder {

    private final boolean isNailed;
    private final int numberOfCoconuts;
    private final double voltage;


    private ParrotBuilder(boolean isNailed, int numberOfCoconuts, double voltage) {
        this.isNailed = isNailed;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
    }

    public static ParrotBuilder build (int numberOfCoconuts, double voltage, boolean isNailed){
        return new ParrotBuilder(isNailed, numberOfCoconuts, voltage);
    }
    protected Parrot european(){
        return new EuropeanParrot(this);
    }

    protected Parrot african(){
        return new AfricanParrot(this);
    }
    protected Parrot norwegianBlue(){
        return new NorwegianBlueParrot(this);
    }

    public boolean isNailed() {
        return isNailed;
    }
    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public double getVoltage() {
        return voltage;
    }
}
