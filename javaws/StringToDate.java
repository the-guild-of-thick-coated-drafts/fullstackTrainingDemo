import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class StringToDate{
    public static void main (String[] args) 
        throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat(
        "dd-MM-yyyy hh:mm:ss");
    String dateInString1 = "31-03-2017 10:40:30";
    Date d1 = sdf.parse(dateInString1);
    System.out.println(d1);


    SimpleDateFormat sdf1 = new SimpleDateFormat(
        "MM/dd/yyyy");
    String dateInString ="23/08/2017";// "2017/03/08";
    sdf1.setLenient(false);
    Date d2 = sdf1.parse(dateInString);
    System.out.println(d2);


    }
}