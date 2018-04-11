import java.util.*;
public class ArrayListTest{

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(3);
        //a.add(10.2);
        for (Integer i: a){
            System.out.println(i);
        }
        
    }
}