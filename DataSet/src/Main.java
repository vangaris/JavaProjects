public class Main {

    public static void main(String[] args) {

        Dataset ds = new Dataset();

        Student s1 = new Student(8);
        Student s3 = new Student(5.5);
        Student s2 = new Student(4);


        ds.add(s1);
        ds.add(s2);
        ds.add(s3);


        System.out.println("Average: " + ds.calcAverage());
        System.out.println("Max: " + ds.getMax().getMeasure());
        System.out.println("Min: " + ds.getMin().getMeasure() );

    }



}
