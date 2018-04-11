package HexJDBI.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import HexJDBI.model.Student;
 
public class StudentMapper implements 
    ResultSetMapper<Student> {
  /**
   * @param idx the index
   * @param rs the resultset
   * @param ctx the context
   * @return the mapped employee object
   * @throws SQLException in case there is an error in fetching data from the resultset
   */
  public final Student map(final int idx, final ResultSet rs,
     final      StatementContext ctx) throws SQLException {
    
    return new Student(rs.getInt("ID"), 
                        rs.getString("NAME"),
                        rs.getDate("DOB"));
  }
}
