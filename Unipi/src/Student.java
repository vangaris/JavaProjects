public abstract class Student {

    private String name;


    public Student(String aName){
        name = aName;

    }

    public String getName(){
        return name;
    }

    public abstract void printInfo();

}
