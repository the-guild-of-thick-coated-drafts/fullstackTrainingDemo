package hexaTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest 
{
  @Test
  public void personConstructorTest(){
      Person actualResult = new Person();
      System.out.println( " running tests onPersons");
      assertNotNull(actualResult);      
  }
}
