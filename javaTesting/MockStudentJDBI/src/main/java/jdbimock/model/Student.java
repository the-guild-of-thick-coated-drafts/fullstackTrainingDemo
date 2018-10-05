package jdbimock.model;

import java.util.Date;

public class Student{
    private int id;
    private int regNo;
    private String name;
    private Date dob;

    public Student(){
        id = 1;
    }
    public Student( int id, int regNo,String name, Date dob){
        this.id = id;
        this.regNo = regNo;
        this.name = name;
        this.dob = dob;
    }
    int getId(){return id;}
    String getName(){return name;}
    Date getDob(){return dob;};
    void setId(int id) {this.id = id;}
    void setName(String name){this.name = name;}
    void setDob(Date dob){this.dob=dob;}
    public String toString(){
       String s = " ID "+ id + " regNo "+ regNo +" name "+ name + " date "+ dob;
       return s;
    }
    int getRegNo(){ return regNo; }
    void setRegNo( int regNo ){ this.regNo = regNo;}

}