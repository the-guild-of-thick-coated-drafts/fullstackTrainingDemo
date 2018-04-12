package jdbiMock.service;

import java.util.List;

import jdbiMock.model.Country;
import jdbiMock.dao.MyDAO;

import org.skife.jdbi.v2.DBI;
public class CountryDetails{
  public MyDAO loadDAO(){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    return mDao;
  }
  public int GetCountryCount(){
     int cc = loadDAO().countCountry();
    return cc;
  }
  public Country getCountryById(int id){
    Country cy = loadDAO().findById(id);
    return cy;
  }
  public List<Country> getCountryList(){
    List<Country> lcy = loadDAO().getCountryList();
    return lcy;
  }
  public void insertOneCountry(int id, String cName){
    loadDAO().insertCountry(id, cName);
  }
  public void updateCountry(int id, String cName){
    loadDAO().updateCountry(id, cName);
  }

}