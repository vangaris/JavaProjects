public class Student implements Measurable {

    private double gpa;

    public Student(double aGpa){
        gpa = aGpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public double getMeasure() {
        return gpa;
    }
}
