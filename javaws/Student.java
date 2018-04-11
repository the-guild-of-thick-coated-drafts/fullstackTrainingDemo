public class Student {
    private int regNo;
    private String name;

    Student(){
        regNo = 50;
        name = "Radha";
    }
    public void SetName( String stName){
        name = stName;
    }
    public void setRegNo( int stRegNo){
        regNo = stRegNo;
    }
    public void display(){
        System.out.println("Name is :"+ name + 
        " regNo is : " + regNo );
    }
    public boolean equals(Object o){
        if ( o == null) return false;
        if ( !(o instanceof Student) ) return false;
        if ( this.getClass() != o.getClass()) return false;
        System.out.println( this.getClass());
        Student s = (Student) o;
        if ( this.regNo != s.regNo ) return false;
        if ( ! this.name.equals(s.name)) return false;
        return true;        
    }
    public int hashCode(){
        int hc = regNo * name.hashCode();
        return hc;
    }
    public static void main( String[] args){

        Student s1 = new Student();
        Student s2  =  new Student();
       
        if( s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are NOT equal");
        }

        if( s1 == s2 ){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are NOT equal");
        } 
        System.out.println(s1);
        System.out.println(s2);

  
       
    }
}