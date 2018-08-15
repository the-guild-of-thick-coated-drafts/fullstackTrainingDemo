package hw.dao;

import hw.model.Country;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CountryMapper implements ResultSetMapper<Country> {
   
    @Override
    public Country map(int idx, ResultSet rs, StatementContext ctx) throws SQLException {
        return new Country(rs.getInt("id"), rs.getString("countryName"));
    }
}