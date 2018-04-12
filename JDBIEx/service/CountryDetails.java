package service;

import java.util.List;

import model.Country;
import dao.MyDAO;

import org.skife.jdbi.v2.DBI;

public class CountryDetails{

  public int GetCountryCount(){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    int cc = mDao.countCountry();
    return cc;
  }


  public Country getCountryById(int id){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    Country cy = mDao.findById(id);
    return cy;
  }

  public List<Country> getCountryList(){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    List<Country> lcy = mDao.getCountryList();
    return lcy;
  }

  public void insertOneCountry(int id, String cName){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    mDao.insertCountry(id, cName);
  }

  public void updateCountry(int id, String cName){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    mDao.updateCountry(id, cName);
  }

}