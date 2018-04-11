package HexJDBI;
 import org.skife.jdbi.v2.DBI;

 import HexJDBI.model.Student;
 import HexJDBI.persistence.StudentDAO;
import HexJDBI.persistence.DbConnection;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        DBI dbi = new DbConnection().getConnect();
        StudentDAO sd = dbi.onDemand(StudentDAO.class);
        int id = 1;
        Student s = sd.find(id);
        System.out.println(s);
    }
}
