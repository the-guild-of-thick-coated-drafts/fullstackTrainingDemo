import java.util.*;

public class HashMapTrainee{

    public static void main(String[] args){

        HashMap<Integer, Trainee> hm = 
            new HashMap<Integer, Trainee>();
        hm.put(1, new Trainee(200,"geetha"));
        hm.put(2, new Trainee(400,"seetha"));
        hm.put(3, new Trainee(300,"ajay"));
        hm.put(4, new Trainee(250,"aruna"));

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