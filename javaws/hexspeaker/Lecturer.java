package hexspeaker;

public class Lecturer implements Speaker{
    String name;
    Lecturer( String name){
        this.name = name;
    }
    public void speak(){
        System.out.println ( "Lecturer " + 
        this.name + " speaks about OOPS !!! + java ");
    }

}