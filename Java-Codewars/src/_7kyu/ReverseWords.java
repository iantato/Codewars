package _7kyu;

/*
 * 
 * Challenge: (7kyu) Reverse words
 * https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
 * 
 * Description:
 * 
 *  Complete the function that accepts a string parameter, and reverses each word in the
 *  string. All spaces in the string should be retained.
 * 
 *  Examples
 *    "This is an example!" ==> "sihT si na !elpmaxe"
 *    "double  spaces"      ==> "elboud  secaps"
 * 
 */

public class ReverseWords {
    
    public static String reverseWords(final String original) {
        String reversed = "", resultString = "";

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') {
                resultString += reversed + " ";
                reversed = "";
            } else {
                reversed = original.charAt(i) + reversed;
            }
        }

        resultString += reversed;
        
        return resultString;
    }

}
