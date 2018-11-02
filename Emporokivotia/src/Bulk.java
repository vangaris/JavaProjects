public class Bulk extends Container {

    private int weight;

    public Bulk(String aCode, String aDestination, int aWeight){
        super(aCode,aDestination);
        weight = aWeight;
    }

    public double getCharge(){
        return 10 * weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Weight: " + weight);
    }
}
