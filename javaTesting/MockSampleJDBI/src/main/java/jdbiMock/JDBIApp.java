package jdbiMock;

import java.util.List;

import jdbiMock.model.Country;
import jdbiMock.service.CountryDetails;

public class JDBIApp{
  public static void main( String[] args){

    CountryDetails cd = new CountryDetails();

      List<Country> lc = cd.getCountryList();
    for( Country c: lc)
      System.out.println(c);
  
  }
}