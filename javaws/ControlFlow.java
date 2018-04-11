import java.util.Scanner;
public class ControlFlow{
    public static void main( String[] args){
       Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter a Integer:");
        i = sc.nextInt();
        sc.nextLine();
        if ( i > 50 ){
                System.out.println( "You have entered:" + i + 
                "greater than 50");
        }
        else if ( i > 25){
                System.out.println( "You have entered: " + i + 
                " greater than 25");
        }
        else {
                System.out.println( "You have entered: " + i + 
                " lesser than 25");
        }
        switch( i){
            case 50:
                System.out.println( "value is 50 ");
                break;
            case 25:
                System.out.println( "value is 25 ");
                break;
            default:
                System.out.println("Other values");
        }

        j = 0;
        while ( j < i ){
            if( j == 5){
                j++;
                continue;
            }
            System.out.println( " value is "+ j);
            j++;
            if ( j > 10 )
                break;
        }
        j = 0;
        do {
            System.out.println( "using do while "+ j);
            j++;
        }while ( j < i);

        for ( j= 0; j < i; j++ ){
            System.out.println( "using for loop "+ j);
        }

        // infinite

    }
}