public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Giannis", "1");

        Student s2 = new Student("Kostas", "2");


        Course c1 = new Course("Java ");
        Course c2 = new Course("Python");
        Course c3 = new Course("Ruby");

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);

        s2.addCourse(c1);
        s2.addCourse(c2);
        s2.addCourse(c3);




        c1.printInformation();

    }
}
