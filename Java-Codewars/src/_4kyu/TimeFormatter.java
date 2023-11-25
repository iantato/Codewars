package _4kyu;

/*
 * 
 * Challenge: (4kyu) Human readable duration format
 * https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java
 * Description:
 *  Your task in order to complete this Kata is to write a function which formats 
 *  a duration, given as a number of seconds, in a human-friendly way.
 * 
 *  The function must accept a non-negative integer. If it is zero, it just returns "now". 
 *  Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
 * 
 *  It is much easier to understand with an example:
 *    * For seconds = 62, your function should return 
 *      "1 minute and 2 seconds"
 *    * For seconds = 3662, your function should return
 *      "1 hour, 1 minute and 2 seconds"
 * 
 *  For the purpose of this Kata, a year is 365 days and a day is 24 hours.
 *  
 *  Note that spaces are important.
 * 
 *  Detailed rules
 *    The resulting expression is made of components like 4 seconds, 1 year, etc. 
 *    In general, a positive integer and one of the valid units of time, separated by a space. 
 *    The unit of time is used in plural if the integer is greater than 1.
 * 
 *    The components are separated by a comma and a space (", "). Except the last component, which 
 *    is separated by " and ", just like it would be written in English.
 * 
 *    A more significant units of time will occur before than a least significant one. Therefore, 1 second 
 *    and 1 year is not correct, but 1 year and 1 second is.
 * 
 *    Different components have different unit of times. So there is not repeated units 
 *    like in 5 seconds and 1 second.
 * 
 *    A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0 seconds 
 *    is not valid, but it should be just 1 minute.
 * 
 *    A unit of time must be used "as much as possible". It means that the function should not return 61 seconds, 
 *    but 1 minute and 1 second instead. Formally, the duration specified by of a component must not be greater 
 *    than any valid more significant unit of time.
 * 
 */

public class TimeFormatter {

    public static void main(String[] args) {
        System.out.println(formatDuration(3662));
    }

    public static String formatDuration(int seconds) {

        if (seconds == 0) return "now";

        String output = "";
        
        int count = 0;
        int year = (seconds / 365) / 24 / 60 / 60,
            day = ((seconds / 24) / 60 / 60) % 365,
            hour = ((seconds / 60) / 60) % 24,
            min = (seconds / 60) % 60,
            sec = seconds % 60;
        int[] time = {year, day, hour, min, sec};

        if (year >= 1) count++;
        if (day >= 1) count++;
        if (hour >= 1) count++;
        if (min >= 1) count++;
        if (sec >= 1) count++;

        for (int i = 0; i < time.length; i++) {
            if (time[i] > 0) {
                switch (i) {
                    case 0: output += year + " year"; break;
                    case 1: output += day + " day"; break;
                    case 2: output += hour + " hour"; break;
                    case 3: output += min + " minute"; break;
                    case 4: output += sec + " second"; break;
                }

                if (time[i] > 1) output += "s";

                if (count > 2) output += ", ";
                else if (count > 1) output += " and ";

                count--;
            }
        }

        return output;
    }

}
