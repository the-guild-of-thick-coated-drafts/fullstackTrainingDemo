package HexJDBI.persistence;

import HexJDBI.model.Student;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;


public interface StudentDAO  {
   
  @SqlQuery("SELECT * FROM STUDENT")
  @Mapper(StudentMapper.class)
  List<Student> list();

  
  @SqlQuery("SELECT * FROM STUDENT WHERE ID = :STD_ID")
  @Mapper(StudentMapper.class)
  Student find(@Bind("ID") int stdID);

  /**
  * close with no args is used to close the connection.
  */
  void close();
}
