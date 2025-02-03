/**
 * Demonstrate using TimeZone object with SimpleDateFormat to show the
 *    the current time for specific cities around the world.
 * @author Luke Hindman
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class AroundTheWorld
{

    public static void main(String[] args) {

        /* Create a new Date object for the current UTC time */
        Date timestamp = new Date();

        /* Create a formatter to process the input date string */
        SimpleDateFormat myFormatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

        /* Create TimeZone objects for several different major cities */
        TimeZone lax =  TimeZone.getTimeZone("America/Los_Angeles");
        TimeZone boi =  TimeZone.getTimeZone("America/Boise");
        TimeZone chi =  TimeZone.getTimeZone("America/Chicago");
        TimeZone nyc =  TimeZone.getTimeZone("America/New_York");
        TimeZone lon =  TimeZone.getTimeZone("Europe/London");
        TimeZone sha =  TimeZone.getTimeZone("Asia/Shanghai");
        TimeZone syd =  TimeZone.getTimeZone("Australia/Sydney");
        
        System.out.println("---------------------------------------------------");
        System.out.println("|  Current time at major cities around the world  |");
        System.out.println("---------------------------------------------------");

        /* Reconfigure the formatter with timezone for the desired city, 
         *   then use the formatter to convert the Date object containing
         *   the current time to properly formatted String. Finally, 
         *   display the result in the terminal. */
        myFormatter.setTimeZone(lax);
        System.out.println("Los Angeles:  " + myFormatter.format(timestamp));

        myFormatter.setTimeZone(boi);
        System.out.println("Boise:  " + myFormatter.format(timestamp));

        myFormatter.setTimeZone(chi);
        System.out.println("Chicago:  " + myFormatter.format(timestamp));

        myFormatter.setTimeZone(nyc);
        System.out.println("New York:  " + myFormatter.format(timestamp));

        myFormatter.setTimeZone(lon);
        System.out.println("London:  " + myFormatter.format(timestamp));

        myFormatter.setTimeZone(sha);
        System.out.println("Shanghai:  " + myFormatter.format(timestamp));

        myFormatter.setTimeZone(syd);
        System.out.println("Sydney:  " + myFormatter.format(timestamp));
        

        /*
         * Not every city in the world is available in the TZ identifier database
         * https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
         * 
         * For those cities we can specify the timezone using a GMT offset. Just be
         *   aware that Daylight Savings Time is not calculated automatically
         *   when using a GMT offset.
         */

         TimeZone sea = TimeZone.getTimeZone("GMT-8");
         TimeZone del = TimeZone.getTimeZone("GMT+5:30");

         myFormatter.setTimeZone(sea);
         System.out.println("Seattle:  " + myFormatter.format(timestamp));
 
         myFormatter.setTimeZone(del);
         System.out.println("Delhi:  " + myFormatter.format(timestamp));


    }
}