import java.util.*;
public class TreeSetExample{
    public static void main (String[] args){
      TreeSet<String> myFruits = new TreeSet<>();

      NavigableSet<String> setFruits = myFruits;
      setFruits.add("Banana");
      setFruits.add("Apple");
      setFruits.add("Orange");
      setFruits.add("Grape");
      setFruits.add("Mango");

      System.out.println("Set Fruits: " + setFruits);
      Iterator<String> descIterator = setFruits.descendingIterator();
      System.out.print("Fruits by descending order: ");
      while (descIterator.hasNext()) {
        System.out.print(descIterator.next() + ", ");
      }

      // getting values less than 15
      NavigableSet<String> treeheadset = 
      (TreeSet)myFruits.headSet("Grape");  
    
      // creating iterator
      Iterator<String> iterator;
      iterator = treeheadset.iterator();

      //Displaying the tree set data
      System.out.println("Tree set data: ");     
      while (iterator.hasNext()) {
         System.out.println(iterator.next() + " ");
      }
   }
}