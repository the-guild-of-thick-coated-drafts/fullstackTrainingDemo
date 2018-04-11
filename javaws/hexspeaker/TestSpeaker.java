package hexspeaker;

public class TestSpeaker {
  public static void main (String[] args){
        Politician p = new Politician();
        p.speak();
        Priest pr = new Priest();
        pr.speak();
        Lecturer lc = new Lecturer("latha");
        lc.speak();
    }
}