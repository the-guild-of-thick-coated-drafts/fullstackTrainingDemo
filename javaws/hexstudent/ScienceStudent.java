package hexstudent;

public class ScienceStudent extends MyStudent{
double physicsMarks, chemistryMarks, mathsMarks;
static int noofStudents = 0;
public ScienceStudent( String name, String standard,
    double physicsMarks, double chemistryMarks,
    double mathsMarks){
    
    super(name, standard);
    this.physicsMarks = physicsMarks;
    this.chemistryMarks =  chemistryMarks;
    this.mathsMarks = mathsMarks;
    noofStudents++;
}
public double getPercentage(){
    double marks = physicsMarks + chemistryMarks + 
                mathsMarks;
    double percent = marks/3;
    return percent;
}
public int getTotalNoStudents(){
    return noofStudents;
}
}