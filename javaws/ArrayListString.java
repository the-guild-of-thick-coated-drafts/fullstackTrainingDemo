import java.util.*;

public class ArrayListString{

    public static void main( String[] args){
        ArrayList<String> as = new ArrayList<String>();
        as.add("java");
        as.add("git");
        as.add("angular");
        as.add("jira");

        Iterator it = as.iterator();
        while( it.hasNext() ){
            String s = (String)it.next();
            System.out.println( "String is : " + s);
        }
        Collections.sort( as );
        System.out.println("after sorting ");
         it = as.iterator();
        while( it.hasNext() ){
            String s = (String)it.next();
            System.out.println( "String is : " + s);
        }    
    }
}