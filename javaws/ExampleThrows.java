import java.util.Scanner;
public class ExampleThrows{
    int age;
    void getAge() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter Age: ");
        age = sc.nextInt();
        if ( age < 18){
            Exception e = new Exception("age less than 18");
            throw ( e );
        }
        System.out.println ( " Age is "+ age);
    }
    public static void main ( String[] args){

        ExampleThrows et = new ExampleThrows();
        try{
        et.getAge();
        } catch(Exception e){ 
            System.out.print(e);
        }
    }
}