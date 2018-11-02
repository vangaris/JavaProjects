public class Phdstudent extends Student{

    private String thesis;

    public Phdstudent(String aName, String aThesis) {
        super(aName);
        thesis = aThesis;
    }



    public void printInfo(){
        System.out.println("PhdStudents Students: ");
        System.out.println("name:" + getName() + " Thesis: " + thesis);
    }

}
