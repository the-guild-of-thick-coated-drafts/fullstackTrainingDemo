package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import model.Student;
 
public class StudentMapper implements 
    ResultSetMapper<Student> {
  public final Student map(final int idx, 
      final ResultSet rs,
      final StatementContext ctx) throws SQLException {
    
    return new Student(rs.getInt("id"), 
                        rs.getInt("regNo"), 
                        rs.getString("name"),
                        rs.getDate("dob"));
  }
}
