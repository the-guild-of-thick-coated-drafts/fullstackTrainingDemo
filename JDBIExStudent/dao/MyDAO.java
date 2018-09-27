package dao;

import java.util.List;
import java.util.Date;

import model.Student;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface MyDAO{

  @SqlQuery("SELECT count(id) from Student")
  int countStudent();

  @SqlQuery("Select * from Student")
  @Mapper(StudentMapper.class)
  List<Student> getStudentList();

  @SqlQuery("Select * from Student where regNo = :regNo")
  @Mapper(StudentMapper.class)
  Student findByRegNo(@Bind("regNo") int regNum);

  @SqlUpdate("Insert into Student(regNo, name, dob) Values(:regNo, :name, :dob)")
  int insertStudent( @Bind("regNo") int regNo, 
      @Bind("name") String name,@Bind("dob") Date dob );

  @SqlUpdate("Update Student set name = :stname where id =:id")
  int updateStudent( @Bind("id") int id, @Bind("stname") String cname);

}