package hexstudent;

public class HistoryStudent extends MyStudent{
double historyMarks, civicsMarks;
static int noOfStudents=0;
public HistoryStudent(String name, String standard,
    double historyMarks,double civicsMarks){
        super(name, standard);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
        noOfStudents++;
    }

public double getPercentage(){
    double marks = historyMarks+civicsMarks;
    double percent = marks/2;
    return percent;
}
public int getTotalNoStudents(){
    return noOfStudents;
}
}