import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalendarDateEx{
    public static void main ( String [] args){

        Calendar cal = Calendar.getInstance();
        Date d = cal.getTime();
        System.out.println( d );

        SimpleDateFormat sdf2 =
            new SimpleDateFormat("dd/MMM/YYYY hh:mm:ss");
        String dStr = sdf2.format(d);
        System.out.println(dStr);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);

        System.out.println( "year is : "+ year );
        System.out.println( "month is : "+ month );
        System.out.println( "dayofMonth is : "+ dayOfMonth );
        System.out.println( "dayOfWeek is : "+ dayOfWeek );
        System.out.println( "weekOfYear is : "+ weekOfYear );
    }

}