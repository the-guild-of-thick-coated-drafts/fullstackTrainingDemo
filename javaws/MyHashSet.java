import java.util.*;

public class MyHashSet {
    public static void main( String [] args){

        int empId[] = {1,2,3,6,4,3,7,2,8};

        Set<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();
        for ( Integer a: empId){
            boolean b = hs1.add(a);
            if ( b == false)
                hs2.add(a);
            //System.out.println(" id is : " + a );
            //System.out.println(" duplicate is :"+ b);
        }
        System.out.println( "added elements are " + hs1);
        System.out.println( "duplicates are added in " +
                     " second list " + hs2);
    }

}