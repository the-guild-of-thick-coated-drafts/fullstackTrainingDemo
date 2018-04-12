package hexaTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 
{
    App ap;

  @BeforeClass
  public static void setupBeforeClass() throws Exception{
   System.out.println("Before class-is called on loading the class");
  }
  @AfterClass
  public static void tearDownAfterClass() throws Exception{
    System.out.println("after executing all the tests");
  }
  @Before
  public void setup() throws Exception{
      System.out.println( "called before executing every tests");
      ap = new App("Hello");
  }
  @After
  public void tearDown() throws Exception{
   System.out.println( "called after executing every tests - clean up");
  }
  @Test
  public void printStringTest(){
      String expectedResult = "Hello";
      String actualResult = ap.printString();
      assertEquals(expectedResult, actualResult) ;
  }
  @Test
  public void addTest(){
      int expectedResult = 11;
      int actualResult = ap.add(5,6);
      assertEquals(expectedResult, actualResult) ;
      expectedResult = 123;
      actualResult = ap.add(5,6);
      assertNotEquals( expectedResult, actualResult) ;
  }
}
