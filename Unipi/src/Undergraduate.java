public class Undergraduate extends Student {

    private double gpa;

    public Undergraduate(String aName, double aGpa){
        super(aName);
        gpa = aGpa;
    }


    public void printInfo(){
        System.out.println(" UnderGraduate Students: ");
        System.out.println("name: " + getName() + " GPA: " + gpa);
    }

}
