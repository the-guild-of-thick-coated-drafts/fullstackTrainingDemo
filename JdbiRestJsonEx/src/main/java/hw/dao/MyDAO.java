package hw.dao;

import java.util.List;

import hw.model.Country;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface MyDAO {
    @SqlUpdate("insert into country( id, countryName) values(:id,:str)")
    void insertOneCountry(@Bind("id") int id, @Bind("str") String str);

    @SqlUpdate("Update country set countryName = :str where id = id)")
    void updateCountry(@Bind("id") int id, @Bind("str") String str);

    @SqlQuery("SELECT * FROM Country WHERE Id = :id")
    @Mapper(CountryMapper.class)
    Country findById(@Bind("id") int id);

    @SqlQuery("SELECT COUNT(Id) FROM Country")
    int countCountry();
    
    @SqlQuery("SELECT * FROM Country")
    @Mapper(CountryMapper.class)
    List<Country> getCountryList();

}
