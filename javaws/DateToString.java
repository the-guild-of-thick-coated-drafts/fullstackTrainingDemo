import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateToString{
    public static void main (String[] args) throws ParseException{
/*
    Date d1 = new Date();

    SimpleDateFormat sdf =
            new SimpleDateFormat("dd/MM/YYYY");
    String date = sdf.format(d1);
    System.out.println(date);

    SimpleDateFormat sdf2 =
            new SimpleDateFormat("dd/MMM/YYYY");
    String date2 = sdf2.format(d1);
    System.out.println(date2);
 */
    SimpleDateFormat sdf =
            new SimpleDateFormat("dd/MM/YYYY");
    sdf.setLenient(false);
    Date d1 = new SimpleDateFormat("dd/MM/YYYY").parse("15/03/2018");
    System.out.println(d1);

            

    }

}