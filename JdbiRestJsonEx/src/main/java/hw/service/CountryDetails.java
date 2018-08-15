package hw.service;

import java.util.List;

import hw.dao.MyDAO;
import hw.model.Country;

import org.skife.jdbi.v2.DBI;

public class CountryDetails {
	public Country GetCountryById(int id){
		DBI dbi = DBConnect.getConnection();
        
        MyDAO dao = dbi.onDemand(MyDAO.class);
        Country cy = dao.findById(id);
        return cy;
	}
	public int GetCountryCount(){
		DBI dbi = DBConnect.getConnection();
        
        MyDAO dao = dbi.onDemand(MyDAO.class);
        int nCtys = dao.countCountry();
        return nCtys;
	}

	public List<Country> getCountryList(){
		DBI dbi = DBConnect.getConnection();
		MyDAO dao = dbi.onDemand(MyDAO.class);
		if ( dbi != null && dao  != null ){
			List<Country> lc = dao.getCountryList();
			return lc;
		}
		else 
			return null;
		
	}
	public Country insertOneCountry(int id, String ct ){
		DBI dbi = DBConnect.getConnection();     
        MyDAO dao = dbi.onDemand(MyDAO.class);
        dao.insertOneCountry(id,ct);
		Country cty = new Country( id, ct);
		return cty;
	}

	public Country updateCountry(int id, String ct ){
		DBI dbi = DBConnect.getConnection();     
        MyDAO dao = dbi.onDemand(MyDAO.class);
        dao.updateCountry(id,ct);
		Country cty = new Country( id, ct);
		return cty;
	}
}
