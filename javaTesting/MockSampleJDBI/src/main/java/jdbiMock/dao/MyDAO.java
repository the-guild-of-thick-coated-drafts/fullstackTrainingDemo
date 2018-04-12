package jdbiMock.dao;

import java.util.List;

import jdbiMock.model.Country;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface MyDAO{

  @SqlQuery("SELECT count(Id) from Country")
  int countCountry();

  @SqlQuery("Select * from Country")
  @Mapper(CountryMapper.class)
  List<Country> getCountryList();

  @SqlQuery("Select * from Country where id = :cid")
  @Mapper(CountryMapper.class)
  Country findById(@Bind("cid") int cid);

  @SqlUpdate("Insert into Country(id, countryName) Values(:id, :cn)")
  void insertCountry( @Bind("id") int id, @Bind("cn") String cname);

  @SqlUpdate("Update Country set countryName = :cn where id =:id")
  void updateCountry( @Bind("id") int id, @Bind("cn") String cname);

}