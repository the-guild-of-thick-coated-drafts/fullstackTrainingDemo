import java.util.Date;

public class Hello{

    public static void main( String[] args){
            System.out.println(" Welcome to Hexaware");

//    Car c1;
//    c1 = new Car(3000);
//    System.out.println("from hello" + c1.toString());

    String name1="Sai";
String name2="Gautham";
int marks1=100;
int marks2=99;
Date d = new Date();
System.out.format("%-10s - %4d\n",name1,marks1);
System.out.format("%-10s - %4d\n",name2,marks2); 
System.out.format("%tF\n",d); 

 
    }
}
