import java.util.ArrayList;

public class Student {

    private String name;
    private String id;
    private ArrayList<Course> courses = new ArrayList<Course>();


    public void addCourse(Course acourse){
        courses.add(acourse);
        acourse.addStudent(this);
    }

    public Student(String aName, String anId) {
        name = aName;
        id =anId;
    }

    public Student(String aNname){
        name = aNname;
        id = "9999";

    }

    public void setID(String anId){

        id = anId;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return id;
    }

    public void printInfo(){

        System.out.println("Students Data");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Enrolled in: " );
        for (Course c : courses)
            System.out.println(c.getName());

        }

}
