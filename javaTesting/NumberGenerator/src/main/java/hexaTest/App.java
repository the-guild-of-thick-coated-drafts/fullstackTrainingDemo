package hexaTest;

public class App 
{
    String appName;

    public App(String appName){
        this.appName = appName;
    }
    public String printString(){
        System.out.println(appName);
        return appName;
    }
    public int add( int a, int b){
        int k = a +b;
        System.out.println("added value is "+ k);
        return k;
    }


    public static void main( String[] args )
    {
        
    }
}
