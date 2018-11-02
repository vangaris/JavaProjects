import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        Undergraduate ug1 = new Undergraduate("Aris", 7.2);

        students.add(ug1);

        students.add(new Phdstudent("Giannis", "Java"));


        for (int i=0; i< students.size(); i++){

            Student student = students.get(i);

            student.printInfo();
        }



    }
}
