import java.util.*;

public class HashMapStudent{

    public static void main(String[] args){

        HashMap<Integer, Student> hm = 
            new HashMap<Integer, Student>();
        hm.put(1, new Student(200,"geetha"));
        hm.put(2, new Student(400,"seetha"));
        hm.put(3, new Student(300,"ajay"));
        hm.put(4, new Student(250,"aruna"));

        Set s = hm.entrySet();
        Iterator it = s.iterator();
        System.out.println( "Key    | value");
        while( it.hasNext()){
          Map.Entry me = (Map.Entry)  it.next();
          System.out.println(me.getKey() + "  |  "+
                me.getValue())   ; 
        }
    }
}