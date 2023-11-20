package _4kyu;

import java.util.Arrays;

/*
 * 
 * Challenge: (4kyu) Strip Comments
 * https://www.codewars.com/kata/51c8e37cee245da6b40000bd
 * 
 * Description:
 * 
 *  Complete the solution so that it strips all text that follows any of a set of comment
 *  markers passed in, Any whitespace at the end of the line should also be stripped out.
 * 
 *  Example:
 *    Given an input string of:
 *    
 *     apples, pears # and bananas
 *     grapes
 *     bananas !apples
 * 
 *    The output expected would be:
 * 
 *     apples, pears
 *     grapes
 *     bananas
 * 
 *    The code would be called like so:
 *    
 *     var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
 *     // result should == "apples, pears\ngrapes\nbananas"
 * 
 */

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        String[] lines = text.split("\n");

        for (int i = 0; i < lines.length; i++) {
            for (String symbol : commentSymbols) {
                if (lines[i].indexOf(symbol) > -1) lines[i] = lines[i].substring(0, lines[i].indexOf(symbol));
            }

            lines[i] = lines[i].stripTrailing();
        }

        return String.join("\n", lines);
    }

}
