package jdbimock;


import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

import jdbimock.model.Student;
import jdbimock.service.StudentDetails;

public class JDBIApp{
  public static void main( String[] args) throws ParseException{

    StudentDetails sd = new StudentDetails();
    int count = sd.GetStudentCount();
    System.out.println( "count is "+ count);

    List<Student> ls = sd.getAllStudents();
    for( Student s: ls)
      System.out.println(s);
    
    int regNo = 55;
    Student st = sd.getStudentByRegNo(regNo);
    System.out.println("get by regno " + st);
    //insertOneStudent( sd );

    UpdateOneStudent( sd );
  }
  static void UpdateOneStudent( StudentDetails sd ){
     Scanner sc = new Scanner( System.in);
     System.out.println( "enter id - record number and " +
            "new name for  the student");
     int id = sc.nextInt();
     String name = sc.next();
     int c = sd.updateStudent( id,name);
     System.out.println ("updated " + c );
     sc.close(); 
  }
  static void insertOneStudent(StudentDetails sd) throws ParseException{
      Scanner sc = new Scanner( System.in);
      System.out.println( " enter regno, name and dob in dd/MM/yyyy");
      int regNo = sc.nextInt();
      String name = sc.next();
      sc.nextLine();
      String stDob = sc.nextLine();
      SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
      sdf1.setLenient(false);
      Date dob = sdf1.parse(stDob);
      sd.insertOneStudent(regNo, name, dob);
      sc.close();
  }
}