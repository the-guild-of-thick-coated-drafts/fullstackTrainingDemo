public class MO{

public void showScoreCard( String name,
            int rank ){
    System.out.println("Name is :"+ name + 
        " Rank is "+ rank);
            }
public void showScoreCard( String name,
            int m1, int m2, int m3 ){
    int sum = m1 + m2 + m3;
    System.out.println("Name is :"+ name + 
        " Total score is is "+ sum);
}
public static void main( String args[]){

    MO m1 = new MO();
    m1.showScoreCard("Radha",2);
    m1.showScoreCard("Aparna", 90, 80,99);

}
}