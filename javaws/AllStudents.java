import hexstudent.*;

public class AllStudents{
    public static void main (String[] args){
    ScienceStudent sc1 = new ScienceStudent(
            "geetha", "Bsc",90,100,95);
    System.out.println( "percent of science s1 is: " +
        sc1.getPercentage());
    System.out.println(  "Total no of Science students: " +
        sc1.getTotalNoStudents());
    HistoryStudent hs1 = new HistoryStudent(
        "ganesh", "MA", 80, 93);
    System.out.println( "percent of history s1 is: " +
        hs1.getPercentage());
    System.out.println( "Total no of history students: " +
            hs1.getTotalNoStudents()); 
    }
}