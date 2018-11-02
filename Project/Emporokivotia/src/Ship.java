import java.util.*;

public class Ship {

    private String name;
    private int capacity;

    private ArrayList<Container> containers =
            new ArrayList<Container>();

    public Ship(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void addContainer(Container aContainer) {
        if(capacity > containers.size())
            containers.add(aContainer);
        else
            System.out.println("Sorry, the ship is full");
    }

    public double getTotalCharge() {

        double totalCharge = 0;
        for(Container container : containers) {
            totalCharge += container.getCharge();
        }
        return totalCharge;
    }

    public String getName() {
        return name;
    }
}
