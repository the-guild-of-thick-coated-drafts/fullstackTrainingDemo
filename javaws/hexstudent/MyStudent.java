package hexstudent;

public abstract class MyStudent{
    String name, standard;

    public MyStudent(String name, String standard){
        this.name = name;
        this.standard = standard;
    }
    public abstract double getPercentage();
    public abstract int getTotalNoStudents();
}
