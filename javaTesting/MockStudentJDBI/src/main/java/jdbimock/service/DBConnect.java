package jdbimock.service;

import org.skife.jdbi.v2.DBI;

public class DBConnect{
  private static DBI dbi = null;

  public static DBI getConnection(){
  try {
      Class.forName("com.mysql.jdbc.Driver");
      if ( dbi == null){
        dbi = new DBI("jdbc:mysql://localhost:3306/test?useSSL=false",
            "root", "Password123");
      }
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    return dbi;
  }
}