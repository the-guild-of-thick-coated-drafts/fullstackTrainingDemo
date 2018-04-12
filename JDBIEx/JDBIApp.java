
import java.util.List;

import model.Country;
import service.CountryDetails;

public class JDBIApp{
  public static void main( String[] args){

    CountryDetails cd = new CountryDetails();

    //cd.insertOneCountry(100,"Singapore");

    cd.updateCountry(100,"Singapore");
    /** 
    int cCount = cd.GetCountryCount();
    System.out.println(" Number of Countries " + cCount);

    Country cty = cd.getCountryById(2);
    System.out.println(cty);

    List<Country> lc = cd.getCountryList();
    for( Country c: lc)
      System.out.println(c);
  **/
  }
}