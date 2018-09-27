package service;

import java.util.List;
import java.util.Date;

import model.Student;
import dao.MyDAO;

import org.skife.jdbi.v2.DBI;

public class StudentDetails{

  public MyDAO getDAO(){
    DBI dbi = DBConnect.getConnection();
    MyDAO mDao = dbi.onDemand(MyDAO.class);
    return mDao;
  }
  public int GetStudentCount(){
    MyDAO mDao = getDAO();
    int sCount = mDao.countStudent();
    return sCount;
  }

  public Student getStudentByRegNo(int regNo){
    MyDAO mDao = getDAO();
    Student st = mDao.findByRegNo(regNo);
    return st ;
  }

  public List<Student> getAllStudents(){
    MyDAO mDao = getDAO();
    List<Student> lst = mDao.getStudentList();
    return lst;
  }

  public int  insertOneStudent(int regNo, String cName, Date dob){
    MyDAO mDao = getDAO();
    int c  =mDao.insertStudent(regNo, cName, dob);
    return c;
  }

  public int updateStudent(int id, String cName){
    int c;
    MyDAO mDao = getDAO();
    c = mDao.updateStudent(id, cName);
    return c;
  }

}