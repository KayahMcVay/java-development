import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {


        // set current data and time

        LocalDateTime now =  LocalDateTime.now();

        // Format date in first format (MM/dd/yyyy)

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = now.format (formatter1);
        System.out.println(formattedDate1);










     }
}
