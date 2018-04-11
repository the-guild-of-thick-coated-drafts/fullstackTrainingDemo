import java.util.*;

// create class that represents the thesaurus 
// that has many synonmns for a single word.
//user can use this to search or mange the words.

public class MyDictionay{
    public static void main (String[] args){
    HashMap<String, String[]> hStr =
        new HashMap<String, String[]>();
    String []s1 = {"kind","generous","warm-hearted"};

    hStr.put("benevolent",s1 );
    hStr.put("endeavour", new String[]{"attempt", "effort","true"});
    hStr.put("dingy", new String[]{"dark","worn"});
    // get any word
    String[] result = hStr.get("benevolent");
    for( String s: result)
        System.out.println( s);
    

    // get all the keys
    System.out.println( "Listing all the keys");
    Set set1 = hStr.keySet();
    Iterator it = set1.iterator();
    while ( it.hasNext()){
        String ss = (String)it.next();
        System.out.println( ss );
    }
    //Print both key and value
    System.out.println( "Keys |   Values");
    Set set2 = hStr.entrySet();
    Iterator it2 = set2.iterator();
    while (it2.hasNext())
    {
        Map.Entry me =(Map.Entry)it2.next();

        System.out.printf(me.getKey() + "   |  " );
        String[] sArray = (String [] )me.getValue();
        for ( String sst: sArray )
                System.out.printf("  "+ sst);
        System.out.println("");
    }
  }
}