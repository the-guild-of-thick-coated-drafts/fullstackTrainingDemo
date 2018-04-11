import java.util.*;
class SortByName implements Comparator<Trainee>{
    public int compare( Trainee t1, Trainee t2){
        String st1 = t1.getName();
        String st2 = t2.getName();
        int val = st1.compareTo(st2);
        return val;
    }
}
public class Trainee implements Comparable<Trainee>
{
    private int regNo;
    private String name;
    public Trainee( int regNo, String name ){
        this.regNo = regNo;
        this.name = name;
    }
    public String getName(){return name;}
    public int getRegNo(){return regNo;}
    public int compareTo(Trainee tr){
        System.out.println(" this object regno is "+ this.regNo+
            "arg tr regno is :"+ tr.regNo );
        int val = this.regNo - tr.regNo;
        return val;
    }
    public String toString(){
        String str = "RegNo is : " + regNo + " name is "+ name;
        return str;
    }
    public static void main( String[] args){
        ArrayList<Trainee> aTr = new ArrayList<Trainee>();
        aTr.add( new Trainee(200,"geetha"));
        aTr.add( new Trainee(100,"Seetha"));
        aTr.add( new Trainee(300,"Mala"));
        aTr.add( new Trainee(150,"kavi"));
        System.out.println(" UNSORTED List :" + aTr );
        Collections.sort(aTr );
        System.out.println("After Sorting "+ aTr);

        // Sorting using Trainee name;
        System.out.println(" Using class Sortbyname sorting");
        SortByName sn = new SortByName();
        Collections.sort( aTr, sn);
        System.out.println( aTr );
    }

}