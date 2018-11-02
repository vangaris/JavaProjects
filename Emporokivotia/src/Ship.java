import java.util.ArrayList;

public class Ship {

    private String name;
    private int capacity;

    private ArrayList<Container> containers = new ArrayList <Container>();

    public Ship(String aName, int aCapacity){
        name = aName;
        capacity = aCapacity;
    }


    public void addContainer(Container aContainer){
        if ( containers.size() < capacity){

            containers.add(aContainer);

        }
        else
            System.out.println("Ship is full of containers");
        }


     public double getTotalCharge(){
        double totalCharge = 0 ;
        for (Container container: containers)
            totalCharge =totalCharge + container.getCharge();
        return totalCharge;
     }

}
