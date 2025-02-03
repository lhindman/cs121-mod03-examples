/**
 * This is a simple example to show how we work with time formatting
 * @author Luke Hindman
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {

    public static void main(String[] args) {

        /* Allocate a variable to store Date object */
        Date timestamp;

        /* This is a string provided by the user */
        String userDate = "2021-12-30 14:33";

        /* Create a formatter to parse the userDate based upon the 
         * specified Input Pattern */
        SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        /* Create a formatter for the specified Output Pattern */
        SimpleDateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");

        try 
        {   /* Attempt to parse the time data from the String using the Input Pattern
             *   I say attempt, because if the pattern cannot be found in the UserDate
             *   String, the parse method will raise a ParseException and jump to 
             *   the catch statement below.  */
            timestamp = inputFormatter.parse(userDate);

            /* Display the original userDate string */
            System.out.println("Timestamp (input): " + userDate);

            /* Use the outputFormatter to convert the Date object to a String using
             *   the Output Pattern. */
            System.out.println("Timestamp (output): " + outputFormatter.format(timestamp));
        }
        catch (ParseException e)
        {
            /* A ParseException will occur if the inputFormatter is unable to successfully
             *   parse the userDate String using the InputPattern. When that occurs, the 
             *   program will immediately jump to this catch code block and begin executing
             *   the statements below. */
            System.out.println("Error: Unable to parse timestamp: " + userDate);
            System.exit(1);
        }

    }
}