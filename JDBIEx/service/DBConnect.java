package service;

import org.skife.jdbi.v2.DBI;

public class DBConnect{
  private static DBI dbi = null;

  public static DBI getConnection(){
  if ( dbi == null){
    dbi = new DBI("jdbc:mysql://localhost:3306/employees",
          "root", "Password123");
    }
    return dbi;

  }
}