public abstract class Container {

    private String code;
    private String destination;


    public Container (String aCode, String aDestination){
        code = aCode ;
        destination = aDestination;
    }

    public abstract double getCharge();

    public void printInfo(){
        System.out.println("Container Code: " + code);
        System.out.println("Destination: " + destination);
    }

}
