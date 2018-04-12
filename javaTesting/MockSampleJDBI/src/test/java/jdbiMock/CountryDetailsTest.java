
package jdbiMock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import mockit.Expectations;
import mockit.Mocked;
import mockit.MockUp;
import mockit.Mock;
import org.junit.Test;

import jdbiMock.model.Country;
import jdbiMock.dao.MyDAO;
import jdbiMock.service.CountryDetails;

public class CountryDetailsTest{

  @Test
  public void testCountryList(
    @Mocked final MyDAO dao){

      new Expectations(){
        {
        List<Country> cm = new ArrayList<Country>();
        cm.add(new Country(1,"India"));
        dao.getCountryList();
        result = cm;
        }
      };
      new MockUp<CountryDetails>(){
        @Mock
        MyDAO loadDAO(){ return dao; }
      };
      CountryDetails cd = new CountryDetails();
      List<Country> ca = cd.getCountryList();
      assertEquals(1, ca.size());

    }
}