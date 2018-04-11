import java.util.Scanner;

public class ControlFlow{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter a Integer:");
        i = sc.nextInt();
        sc.nextLine();
        if ( i > 50 ){
                System.out.println( "You have entered:" + i + 
                "greater than 50");
        }
        else if ( i > 25){
                System.out.println( "You have entered:" + i + 
                "greater than 25");

        }
        else {
                System.out.println( "You have entered:" + i + 
                "lesser than 25");

        }
        
    }
}