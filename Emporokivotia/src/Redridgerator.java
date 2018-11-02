public class Redridgerator extends Container {

    private double power;

    public Redridgerator(String aCode, String aDestination, double aPower) {
        super(aCode, aDestination);
        power = aPower;
    }

    public double getCharge(){
        return 2000 * power;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Power: " + power);
    }
}
