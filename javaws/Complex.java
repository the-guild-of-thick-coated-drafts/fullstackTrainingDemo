import java.util.*;
public class Complex implements Comparable<Complex>
{
    private int realX;
    private int imaginaryY;
   
    public Complex( int realX, int  imaginaryY){
        this.realX = realX;
        this.imaginaryY = imaginaryY;
        
    }
    public int compareTo(Complex c){
         
        int val = this.realX - c.realX;
        return val;
    }
    public String toString(){
        String str = "realX is : " + realX + " ImaginaryY is "+ imaginaryY;
        return str;
    }
    public static void main( String[] args){
        ArrayList<Complex> cList = new ArrayList<Complex>();
        cList.add( new Complex(200,201));
        cList.add( new Complex(100,103));
        cList.add( new Complex(300,110));
        cList.add( new Complex(150,170));
        System.out.println(" UNSORTED List :" + cList );
        Collections.sort(cList );
        System.out.println("After Sorting "+ cList);
    }

}