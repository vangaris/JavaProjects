import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String aName){
        name = aName;
    }

    public String getName(){
        return  name;
    }

    public void  addStudent( Student aStudent){
       students.add(aStudent);
    }

   public void printInformation(){
       System.out.println("Course name: " + name);
       System.out.println("Has Student: " );
       for (Student s : students)
           System.out.printf(s.getName());


   }
}
