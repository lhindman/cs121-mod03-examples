/**
 * Example showing the sample Date and Time Patterns from
 *   the SimpleDateFormat API.
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
 * 
 * @author Luke Hindman
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class FormsOfTime 
{
    
    public static void main(String[] args) 
    {
        /* Instantiate a Date object with the current time, UTC */

        Date current = new Date();

        System.out.println("----------------------------------------------------");
        System.out.println("|  Exploring various date and time format patterns  |");
        System.out.println("----------------------------------------------------");

        /* Display the current Date object without formatting */
        System.out.println("default: " + current);
        System.out.println("\n");

        /* Sample Result: 2025.02.03 AD at 12:18:19 MST */
        SimpleDateFormat fmt0 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("fmt0: " + fmt0.format(current));

        /* Sample Result: Mon, Feb 3, '25 */
        SimpleDateFormat fmt1 = new SimpleDateFormat("EEE, MMM d, ''yy");
        System.out.println("fmt1: " + fmt1.format(current));

        /* Sample Result: 12:18 PM */
        SimpleDateFormat fmt2 = new SimpleDateFormat("h:mm a");
        System.out.println("fmt2: " + fmt2.format(current));

        /* Sample Result: 12 o'clock PM, Mountain Standard Time */
        SimpleDateFormat fmt3 = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        System.out.println("fmt3: " + fmt3.format(current));

        /* Sample Result: 2025-02-03T12:18:19.476-0700 */
        SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        System.out.println("fmt4: " + fmt4.format(current));

        /* Sample Result: Mon Feb 03 12:24:47 MST 2025 */
        SimpleDateFormat fmt5 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        System.out.println("fmt4: " + fmt5.format(current));

    }
}
