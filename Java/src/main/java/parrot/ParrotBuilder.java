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
        return new EuropeanParrot(this.numberOfCoconuts, this.voltage, this.isNailed);
    }

    protected Parrot african(){
        return new AfricanParrot(this.numberOfCoconuts, this.voltage, this.isNailed);
    }

    protected Parrot norwegianBlue(){
        return new NorwegianBlueParrot(this.numberOfCoconuts, this.voltage, this.isNailed);
    }


}
