import java.util.*;

class SortByName implements Comparator<Student>{
    public int compare( Student t1, Student t2){
        String st1 = t1.getName();
        String st2 = t2.getName();
        int val = st1.compareTo(st2);
        return val;
    }
}
public class TestStudent{
    public static void main( String[] args){
      SortByName sn = new SortByName();
      TreeSet<Student> ts1 = new TreeSet<Student>(sn);
      ts1.add( new Student(200,"Geetha") ); 
      ts1.add( new Student(100,"Seetha"));
      ts1.add( new Student(300,"Mala"));
      ts1.add( new Student(150,"Kavi"));
      System.out.println( ts1 );

     NavigableSet<Student> treeheadset = 
      (NavigableSet<Student>)ts1.headSet(new Student(300,"Mala"));  
      //Displaying the tree set data
      System.out.println("Tree set data: " + treeheadset);       

     NavigableSet<Student> ns1 = ts1;
      Iterator<Student> descIterator = 
            ns1.descendingIterator();
      System.out.print("Student name by descending order: ");
      while (descIterator.hasNext()) {
        System.out.print(descIterator.next() + ", ");
      }

   /*
      ArrayList<Student> aStdList = new ArrayList<Student>();
      Student st1 = new Student(200,"Geetha");
      aStdList.add( st1 );
      aStdList.add( new Student(100,"Seetha"));
      aStdList.add( new Student(300,"Mala"));
      aStdList.add( new Student(150,"Kavi"));
      System.out.println(" UNSORTED List :" + aStdList );
      Collections.sort(aStdList ); // default natural sorting
      System.out.println("After Sorting "+ aStdList);
      // specific sorting order
      // Sorting using Student name;
      System.out.println(" Using class Sortbyname sorting");
      SortByName sn = new SortByName();
      Collections.sort( aStdList, sn);
      System.out.println( aStdList );

*/

    }
}
