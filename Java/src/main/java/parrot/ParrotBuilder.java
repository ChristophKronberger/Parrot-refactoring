package parrot;

public class ParrotBuilder {

    private boolean isNailed;
    private int numberOfCoconuts;
    private double voltage;


    private ParrotBuilder(boolean isNailed, int numberOfCoconuts, double voltage) {
        this.isNailed = isNailed;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
    }

    public static ParrotBuilder build (int numberOfCoconuts, double voltage, boolean isNailed){
        return new ParrotBuilder(isNailed, numberOfCoconuts, voltage);
    }

    protected Parrot european(){
        return new EuropeanParrot(ParrotTypeEnum.EUROPEAN, this.numberOfCoconuts, this.voltage, this.isNailed);
    }

    protected Parrot african(){
        return new AfricanParrot(ParrotTypeEnum.AFRICAN, this.numberOfCoconuts, this.voltage, this.isNailed);
    }

    protected Parrot norwegianBlue(){
        return new NorwegianBlueParrot(ParrotTypeEnum.NORWEGIAN_BLUE, this.numberOfCoconuts, this.voltage, this.isNailed);
    }


}
