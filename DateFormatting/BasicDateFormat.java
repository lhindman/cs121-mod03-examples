/**
 * This is a simple example to show how we work with time formatting
 * @author Luke Hindman
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BasicDateFormat {

    public static void main(String[] args) {

        /* Allocate a variable to store Date object */
        Date timestamp;

        /* This is a string provided by the user */
        String userDate = "2021-12-30 14:33";

        /* Create a formatter to process the input date string */
        SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");

        try 
        {
            timestamp = inputFormatter.parse(userDate);
            System.out.println("Timestamp (unformatted): " + timestamp);
            System.out.println("Timestamp (input): " + outputFormatter.format(timestamp));
            System.out.println("Timestamp (output): " + outputFormatter.format(timestamp));
        }
        catch (ParseException e)
        {
            System.out.println("Error: Unable to parse timestamp: " + userDate);
            System.exit(1);
        }


        

        

        


    }
}